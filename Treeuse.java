package DataStructures;

import java.util.Scanner;

public class Treeuse {


	private static final int TreeNodes = 0;

	public static TreeNodes<Integer> takeInput(){
		Scanner s = new Scanner(System.in);

		System.out.println("Enter root data :");
		int rootData = s.nextInt();
		TreeNodes<Integer> root = new TreeNodes<Integer>(rootData);
		System.out.println("Enter number of children of "+rootData+" : ");
		int numChild = s.nextInt();

		for(int i = 0; i < numChild; i++){
			TreeNodes<Integer> currentChild = takeInput();
			root.children.add(currentChild);
		}

		return root;
	}

	public static TreeNodes<Integer> takeInputLevelWise() throws Exception{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data :");
		int rootData = s.nextInt();

		QueueList<TreeNodes<Integer>> pendingNodes = new QueueList<TreeNodes<Integer>>();
		TreeNodes<Integer> root = new TreeNodes<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty())
		{	
			TreeNodes<Integer> currentNode = pendingNodes.dequeue();
			System.out.println("Enter number of children of "+currentNode.data+" :");
			int numChild = s.nextInt();	
			for(int i =0; i < numChild; i++){
				System.out.println("Enter "+i+" child of :"+currentNode.data);
				int childData = s.nextInt();
				TreeNodes<Integer> child = new TreeNodes<Integer>(childData);
				pendingNodes.enqueue(child);
				currentNode.children.add(child);			
				}
		}
		return root;
	}


	public static void print(TreeNodes<Integer> root){
		if(root == null){
			return;
		}
		String toBePrinted  = root.data +" : ";

		for(int i = 0; i < root.children.size(); i++){
			TreeNodes<Integer> currentChild = root.children.get(i);
			toBePrinted+= currentChild.data +", ";
		}
		System.out.println(toBePrinted);

		for(int i = 0; i < root.children.size(); i++){
			TreeNodes<Integer> currentChild = root.children.get(i);
			print(currentChild);
		}
	}
		
		public static void printlevelwise(TreeNodes<Integer> root) throws QueueEmptyException{
			if(root == null){
				return;
			}
			
			QueueList<TreeNodes<Integer>> pendingNodes = new QueueList<TreeNodes<Integer>>();
			pendingNodes.enqueue(root);
			
			
			while(!pendingNodes.isEmpty()){
				TreeNodes<Integer> currentNode = pendingNodes.dequeue();
				String toBePrinted  = root.data +" : ";
				
			}
		}	
			public static TreeNodes<Integer> getmax(TreeNodes<Integer> root){
				TreeNodes<Integer> max= root;
				for(TreeNodes<Integer> child : root.children){
				    TreeNodes<Integer>tempmax=getmax(child);
					if(tempmax.data>max.data){
						max=tempmax;
					}
					
				}
				return max;
				
			}
			
			
			public static int getheight(TreeNodes<Integer> root){
				if(root==null){
					return 1;
				}
				int height=0;
				for(TreeNodes<Integer> child : root.children){
				    int tempheight=getheight(child);
					if(tempheight>height){
						height=tempheight;
					}
					
				}
				return height+1;
				
			}
			
			public static int nodesGreaterThanX(TreeNodes<Integer> root, int x){
				int count=0;
				if(root.data>x){
					count++;
				}
				for(TreeNodes<Integer> child : root.children){
				    count=count + nodesGreaterThanX(child,x);	
				}
				return count;
			}
			
			
		/*	public static TreeNodes<Integer> nextLarger(TreeNodes<Integer> root, int x){
				
				if(root== null){
					return null;
				}
				TreeNodes<Integer> temp= null;
				if(root.data>x){
					temp= root;
				}
				for(TreeNodes<Integer> child : root.children){
				    TreeNodes<Integer> nextlargerchild = nextLarger(child,x);
					if(child.data>x && child.data<temp.data){
						temp=child;
					}
				}
				
				
				
				return temp;
			}
			*/
			
		
			public static void preOrder(TreeNodes<Integer> root) throws StackEmptyException{
				if(root==null){
					return ;
				}
				
				StackUsingList<TreeNodes<Integer>> pendingNodes = new StackUsingList<TreeNodes<Integer>>();
				pendingNodes.push(root);
				while(!pendingNodes.isEmpty()){
					TreeNodes<Integer> currentNode = pendingNodes.pop();
				    System.out.println(currentNode.data);
				    for(int i=currentNode.children.size()-1; i>=0; i--){
				    	pendingNodes.push(currentNode.children.get(i));
				    	
				    }
				    
					
				}
				
				
				
				
			}
			
			

	

	public static void main(String args[]) throws Exception{
		TreeNodes<Integer> root = takeInputLevelWise();
		//printlevelwise(root);
		//TreeNodes<Integer> root = takeInput();
		//print(root);
		Scanner s = new Scanner(System.in);
		TreeNodes<Integer> max= getmax(root);
		int answer= getheight(root);
		System.out.println("enter x:");
		int x= s.nextInt();
		int count= nodesGreaterThanX(root,x);
		System.out.println("height is "+answer);
		System.out.println(count + " elements are greater than x.");
		preOrder(root);
	//	TreeNodes<Integer> next= nextLarger(root,x);
	//	System.out.println("element next larger than x is" + next.data);
		

	}

	
}
