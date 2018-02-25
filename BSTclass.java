package DataStructures;

public class BSTclass {

	public static BinaryTreeNode<Integer> insertion(BinaryTreeNode<Integer> root,int data){
		BinaryTreeNode<Integer> newNode= new BinaryTreeNode<>();
		newNode.data= data;
		if(root==null){
			root=newNode;
		}
		else if(newNode.data<root.data){
			if(root.left==null){
				root.left=newNode;
			}
			else{
				insertion(root.left,newNode.data);
			}
		}
		else{
			if(root.right==null){
				root.right=newNode;
			}
			else{
				insertion(root.right,newNode.data);
			}
		}
		return root;
	}
	
	
	
public static BinaryTreeNode<Integer> search(BinaryTreeNode<Integer> root, int element){
		
	if(root == null){
		return null;
	}
	BinaryTreeNode<Integer> ele=null;
	if(root.data==element){
		ele= root;
	}
    if(ele==null){
    	if(element<root.data){
    	ele=search(root.left,element);
	   }
    }	
	if(ele==null){
		if(element>root.data){
	    ele=search(root.right,element);
	   }
	}
   return ele;
  }



public static int sizeoftree(BinaryTreeNode<Integer>root){
	if(root==null){
		return 0 ;
	}
	return(sizeoftree(root.left)+ sizeoftree(root.right)+ 1);
  }



public static boolean isempty(BinaryTreeNode<Integer>root){
	if(root==null){
		return true;
	}
	else
		return false;
}

}
