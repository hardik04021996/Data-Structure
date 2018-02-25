package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeinput() throws QueueEmptyException{
		Scanner s= new Scanner(System.in);
		System.out.print("enter root data:");
		int rootdata = s.nextInt();
		BinaryTreeNode<Integer> root= new BinaryTreeNode<>();
		root.data= rootdata;
		
		QueueList<BinaryTreeNode<Integer>> pendingNodes= new QueueList<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer>currentNode= pendingNodes.dequeue();
			System.out.println("enter left child of" + currentNode.data);
			int leftData= s.nextInt();
			if(leftData!=-1){
				BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<>();
				leftChild.data= leftData;
				currentNode.left= leftChild;
				pendingNodes.enqueue(leftChild);
			}
			System.out.println("enter right child of" + currentNode.data);
			int rightData= s.nextInt();
			if(rightData!=-1){
				BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<>();
				rightChild.data= rightData;
				currentNode.right= rightChild;
				pendingNodes.enqueue(rightChild);
		 }
		}
			return root;
	}
		

	
	  public static int getheight(BinaryTreeNode<Integer> root){
		  if(root==null){
				return 0;
			}
           return Integer.max(getheight(root.left), getheight(root.right)) +1 ;
			
	  }
		
		
		public static void print(BinaryTreeNode<Integer> root){
			
				if(root == null){
					return;
				}
				String tobeprinted = root.data + " : ";
				if(root.left!= null){
					tobeprinted+= root.left.data+ " , ";
				}
				if(root.right!= null){
					tobeprinted+= root.right.data;
				}
				System.out.println(tobeprinted);
				print(root.left);
				print(root.right);			
		}
		
		
		public static int getdiameter(BinaryTreeNode<Integer> root){
			if(root == null){
				return 0;
			}
			
			int leftheight= getheight(root.left);
			int rightheight= getheight(root.right);
			int leftdiameter= getdiameter(root.left);
			int rightdiameter= getdiameter(root.right);
			
			return Integer.max(Integer.max(leftdiameter, rightdiameter), leftheight + rightheight + 1);
			
			
		}
		
		public static BinaryTreeNode<Integer> find(BinaryTreeNode<Integer> root, int x){
			
			if(root == null){
				return null;
			}
			BinaryTreeNode<Integer> ele=null;
			if(root.data==x){
				ele= root;
			}
		    if(ele==null){
				ele=find(root.left,x);
			}
			if(ele==null){
		        ele=find(root.right,x);
			}

			return ele;
			}
			
		
	public static BinaryTreeNode<Integer> construct(int[] in, int[] pre, int inS, int inE, int preS, int preE){
		if(inS > inE){
			return null;
		}
		BinaryTreeNode<Integer> root= new BinaryTreeNode<>();
		root.data= pre[preS];
		int i=inS;
		while(in[i]!=root.data){
			i++;
		}
		
		int leftInS= inS;
		int leftInE= i-1;
		int rightInS= i+1;
		int rightInE= inE;
		
		int leftPreS= preS+1;
		int rightPreE= preE;
		int leftLength= leftInE-leftInS+1;
		int leftPreE= leftPreS + leftLength-1;
	    int rightPreS= leftPreE+1;	
	    
	    root.left= construct(in, pre, leftInS, leftInE, leftPreS, leftPreE);
	    root.right= construct(in, pre, rightInS, rightInE, rightPreS, rightPreE);
	    
		return root;	
		
	}
	
	
	/*public static ArrayList<Node<BinaryTreeNode<Integer>>> eachLevel(BinaryTreeNode<Integer> root) throws QueueEmptyException{
		if(root== null){
			return null;
		}
		ArrayList<Node<BinaryTreeNode<Integer>>> output = new ArrayList<>();
		QueueList<BinaryTreeNode<Integer>> primary = new QueueList<>();
		QueueList<BinaryTreeNode<Integer>> secondary = new QueueList<>();
		primary.enqueue(root);
		Node<BinaryTreeNode<Integer>> head= null, tail= null;
		while(!primary.isEmpty()){
			
			
			BinaryTreeNode<Integer> currentNode = primary.dequeue();
			Node<BinaryTreeNode<Integer>>newnode= new Node<>();
			newnode.data= currentNode;
			if(head== null){
				head= newnode;
				tail= newnode;
			}
			else{
				tail.next= newnode;
				tail= newnode;
			}
			if(currentNode.left!= null){
				seco
			}
		}
		
	}
	*/
	
	public static boolean checkBalance(BinaryTreeNode<Integer> root){
		if(root==null){
			return true;
		}
		
		int lheight= getheight(root.left);
		int rheight= getheight(root.right);
		if(lheight-rheight>=-1 && lheight-rheight<=1 && checkBalance(root.left) && checkBalance(root.right)){
			return true;
		}
		else
			return false;
	}
	
		
		
		
		
		
		
	public static void main(String args[]) throws Exception{
	    Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeinput();
		print(root);
		int height= getheight(root);
		System.out.println("height: " +  height);
		int diameter= getdiameter(root);
		System.out.println("diameter: " +  diameter);
		System.out.println("enter element to be found:");
		int x= s.nextInt();
		BinaryTreeNode<Integer> answer= find(root,x);
		if(answer!=null)
		    System.out.println(answer.data+" found");
		else
			System.out.println("element not found");
		
		int[] in= {4,2,5,1,6,3,7};
		int[] pre= {1,2,4,5,3,6,7};
		BinaryTreeNode<Integer> Root= construct(in, pre, 0, in.length-1, 0, pre.length-1);
		print(Root);
		boolean check=  checkBalance(root);
		System.out.println(check);
		
   }
	
	
	
	
	
}
