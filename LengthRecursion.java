package DataStructures;

import java.util.Scanner;

public class LengthRecursion {


	public static Node<Integer> take_input()
	{
		Node<Integer>head = null,tail = null;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the next Element :");
		int data = s.nextInt();

		while(data!=-1)
		{
			Node<Integer>newNode  = new Node<Integer>();
			newNode.data = data;
			newNode.next  =null;
			if(head==null)
			{
				head = newNode;
				tail = newNode;
			}
			else
			{
				tail.next = newNode;
				tail = newNode;
			}

			System.out.println("Enter the next Element :");
			data = s.nextInt();
		}
		return head;

	}

	public static int Length(Node<Integer> head)
	{
		//Node<Integer> temp =head;
		if(head ==null)
		{
			return 0;
		}
		else
		{	
			//head = head.next;
			return 1+Length(head.next);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = take_input();
		System.out.println(Length(head));
	}



}
