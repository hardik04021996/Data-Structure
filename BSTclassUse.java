package DataStructures;

import java.util.Scanner;

public class BSTclassUse {

	
	public static void main(String[] args) throws QueueEmptyException{
		BinaryTreeNode<Integer> root= BinaryTreeUse.takeinput();
		
		boolean checkifempty=BSTclass.isempty(root);
		if(checkifempty==true){
			System.out.println("tree is empty");
		}
		else
			System.out.println("tree is not empty");
		
		
		BinaryTreeUse.print(root);
	    Scanner s = new Scanner(System.in);
		
	    int size=BSTclass.sizeoftree(root);
		System.out.println("size of tree is:" + size);
		
		
		System.out.println("enter element to be inserted");
		int data= s.nextInt();
		root= BSTclass.insertion(root, data);
		BinaryTreeUse.print(root);
		
		
		size=BSTclass.sizeoftree(root);
		System.out.println("size of tree is:" + size);
		
		
		System.out.println("enter the element to be searched");
		int element= s.nextInt();
		BinaryTreeNode<Integer>result= BSTclass.search(root,element);
		if(result!=null){
			System.out.println("element found");
		}
		else
			System.out.println("element not found");
		
		
		
		
		
		
	}
	
	
}
