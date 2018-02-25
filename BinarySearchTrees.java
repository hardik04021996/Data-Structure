package DataStructures;

public class BinarySearchTrees {

	
	public static boolean checkbst(BinaryTreeNode<Integer> root){
		if(root== null){
			return true;
		}
		
		if(root.data>findmax(root.left) && root.data<findmin(root.right) && checkbst(root.left) && checkbst(root.right)){
			return true;
		 }

		return false;
		
	}
	
	public static int findmax(BinaryTreeNode<Integer> root){
		if(root==null){
			return Integer.MIN_VALUE;
		}
		int max=0;
		int max1= Math.max(findmax(root.left), findmax(root.right));
		max= Math.max(root.data, max1);
		return max;
	}
	public static int findmin(BinaryTreeNode<Integer> root){
		if(root==null){
			return Integer.MAX_VALUE;
		}

		int min= findmax(root);
		int min1= Math.min(findmin(root.left), findmin(root.right));
		min= Math.min(root.data, min1);
		return min;
	}
	
	public static void printInGivenRange(BinaryTreeNode<Integer> root, int k1, int k2){
		
		if(root== null){
			return;
		}
		
		//if(root.data>=k1 && root.data<=k2)
		//	System.out.println(root.data);
		if(root.data>k2 ){
			printInGivenRange(root.left, k1, k2);
		}
		else if(root.data<k1){
			printInGivenRange(root.right, k1, k2);
		}
		else if(root.data>=k1 && root.data<=k2)
		{
			//System.out.println(root.data);
			printInGivenRange(root.left, k1, k2);
			System.out.println(root.data);
			printInGivenRange(root.right, k1, k2);
		}
	}
	
	public static BinaryTreeNode<Integer> construct(int[] array, int beg, int end){
		if(beg>end){
			return null;
		}
		int mid= (beg+end)/2;
		BinaryTreeNode<Integer> root= new BinaryTreeNode<>();
		root.data=array[mid];
		root.left= construct(array,beg,mid-1);
		root.right= construct(array,mid+1,end);
		
		return root;
	}
	
	public static void print(BinaryTreeNode<Integer> root){
		
		if(root == null){
			return;
		}
		String tobeprinted = root.data + " : ";
		if(root.left!= null){
			tobeprinted+= root.left.data;
		}
		if(root.right!= null){
			tobeprinted+="," +root.right.data;
		}
		System.out.println(tobeprinted);
		print(root.left);
		print(root.right);			
}
		
   public static void main(String args[]) throws QueueEmptyException{
	  BinaryTreeNode<Integer> root= BinaryTreeUse.takeinput();
	   boolean check= checkbst(root);
	   int k1=7;
	   int k2= 13;
	   printInGivenRange(root,k1,k2); 
	   System.out.println(check);
	
	   int[] array= {1,2,3,4,5,6};
	   BinaryTreeNode<Integer> Root =construct(array, 0, array.length-1);
	   print(Root);
	  
   }
	
}
