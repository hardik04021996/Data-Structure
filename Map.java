package DataStructures;

import java.util.ArrayList;


public class Map<K,V> {

	ArrayList<Node<MapPair<K,V>>> buckets= new ArrayList<Node<MapPair<K,V>>>();
	int size;
	Map(){
		size=0;

		for(int i=0; i<4; i++){
			buckets.add(null);
		}
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		else
			return false;

	}

	public int getBucketIndex(K key){
		int hashcode=key.hashCode();
		hashcode=hashcode%buckets.size();
		return hashcode;
	}

	public V get(K key){
		int index=getBucketIndex(key);
		Node<MapPair<K,V>> head = buckets.get(index) ;
		if(head==null){
			return null;
		}
		while(head!= null){
			if(head.data.key.equals(key)){
				return head.data.value;
			}
			head=head.next;
		}
		return null;

	}

	public void put(K key, V value){
		int index=getBucketIndex(key);
		Node<MapPair<K,V>> head = buckets.get(index) ;
		Node<MapPair<K,V>> prev =null;
		Node<MapPair<K,V>> newNode= new Node<MapPair<K,V>>();
		MapPair<K,V> pair= new MapPair<K,V>();
		pair.key=key;
		pair.value=value;
		newNode.data=pair;
        
		if(head==null){
			buckets.set(index,newNode);
			size++;
		}
		else{
			while(head!= null){
				if(head.data.key.equals(key)){
					head.data.value=value;
					return;
				}
				prev=head;
				head=head.next;
			}
			
				prev.next=newNode;
				size++;
			
		}
		if((1.0*size)/buckets.size()>=0.75){
			rehash();
		}
	}

	public void remove(K key){
		int index=getBucketIndex(key);
		Node<MapPair<K,V>> head = buckets.get(index) ;
		Node<MapPair<K,V>> prev =null;
		if(head==null){
			return;
		}
		while(head!= null){
			if(head.data.key.equals(key)){
				if(prev==null){
					buckets.set(index, head.next);
				}
				else{
					prev.next=head.next;
				}
			}
			prev=head;
			head=head.next;
			size--;
		}
	}

	public void rehash(){
		size=0;
		ArrayList<Node<MapPair<K,V>>> temp= buckets;
		ArrayList<Node<MapPair<K,V>>> buckets= new ArrayList<Node<MapPair<K,V>>>();
		for(int i=0; i<2*temp.size(); i++){
			buckets.add(null);
		}
		for(Node<MapPair<K,V>> head : temp){
			Node<MapPair<K,V>> temp1 = head;
			while(temp1!=null){
				put(temp1.data.key,temp1.data.value);
				temp1=temp1.next;
			}
		} 
	}


}
