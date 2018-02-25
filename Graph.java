package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

	ArrayList<Vertex> vertices;

	Graph(){
		vertices = new ArrayList<>();
	}

	public boolean isEmpty(){
		return vertices.size()==0;
	}


	public int numVertices(){
		return vertices.size();
	}

	public int numEdges(){
		int count=0;
		for(Vertex v : vertices){
			count = count + v.numEdges();
		}

		return count/2;
	}

	public Vertex getVertex(String name){
		for(Vertex v : vertices){
				if(v.name.equals(name)){
					return v;
				}
		}
		return null;

	}

	public void addVertex(String name){
		if(getVertex(name) != null){
			return;
		}
		
		Vertex newVertex = new Vertex(name);
		vertices.add(newVertex);
	}
	
	public void addEdge(String name1, String name2){
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		
		if(v1 == null || v2 == null){
			return;
		}
		
		if(areAdjacent(v1.name,v2.name)){
			return;
		}
		
		Edge e = new Edge();
		e.first = v1;
		e.second = v2;
		v1.addEdge(e);
		v2.addEdge(e);
		
	}

	public boolean areAdjacent(String name1, String name2) {
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		
		if(v1 == null || v2 == null){
			return  false;
		}
		
		return v1.isAdjacent(v2);	
	}

	public void removeVertex(String name){
		Vertex v = getVertex(name);
		if(v==null){
			return;
		}
		ArrayList<Vertex> adjacent = getAdjacent(v);
		for(Vertex adjV : adjacent){
			adjV.removeEdgeWith(v);
		}
		vertices.remove(v);
	}
	
	
	public void removeEdge(String name1,String name2){
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		
		if(v1 == null || v2 == null){
			return ;
		}
		if(!areAdjacent(name1, name2)){
			return;
		}
		
		v1.removeEdgeWith(v2);
		v2.removeEdgeWith(v1);
	}
	
	public ArrayList<Vertex> getAdjacent(Vertex v){
		if(v==null){
			return null;
		}
		ArrayList<Vertex> adjacent = v.getAdjacent();
		return adjacent;
	}
	
	public void print(){
		
		for(Vertex v : vertices){
			v.print();
		}
	}
	
	public void dfs() throws StackEmptyException{
		if(isEmpty()){
			return;
		}
		StackUsingList<Vertex> pendingNodes= new StackUsingList<>();
		HashMap<Vertex,Boolean> map= new HashMap<>();
		//pendingNodes.push(vertices.get(0));
		//map.put(vertices.get(0), true);
		
		for(Vertex v: vertices){
			 if(!map.containsKey(v)){
				 map.put(v, true);
				 pendingNodes.push(v);
		while(!pendingNodes.isEmpty()){
			Vertex currentVertex = pendingNodes.pop();
			System.out.println(currentVertex.name + " ");
			ArrayList<Vertex> adjacent = getAdjacent(currentVertex);
			for(Vertex b: adjacent){
				if(!map.containsKey(b)){
					pendingNodes.push(b);
					map.put(b, true);
				}
			}
		}
		System.out.println();
			 }
		}
		
	}
	
	public boolean isconnected() throws StackEmptyException{
		if(isEmpty()){
			return true;
		}
		int flag=0;
		StackUsingList<Vertex> pendingNodes= new StackUsingList<>();
		HashMap<Vertex,Boolean> map= new HashMap<>();
		for(Vertex v: vertices){
			 if(!map.containsKey(v)){
				 map.put(v, true);
				 pendingNodes.push(v);
		         while(!pendingNodes.isEmpty()){
		       	 Vertex currentVertex = pendingNodes.pop();
			     System.out.println(currentVertex.name + " ");
			     ArrayList<Vertex> adjacent = getAdjacent(currentVertex);
			     for(Vertex b: adjacent){
				 if(!map.containsKey(b)){
					pendingNodes.push(b);
					map.put(b, true);
				   }
			     }
		        }
		         flag++;
			 }
		   }
		if (flag==1){
			return true;
		}
		else return false;
	   }
	
	public boolean havePath(String name1, String name2){
		
		
	}
	
	
}
