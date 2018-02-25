package DataStructures;

import java.util.Scanner;

public class ReverseRecursion {


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

	public static void print(Node<Integer> head)
	{
		Node<Integer> temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("");
	}



	public static Node<Integer> Reverse(Node<Integer> head)
	{
		Node<Integer> temp1 = head;
		Node<Integer> temp2 = head;
		if(temp1.next==null)
		{
			//temp1 = head;
			return head;
		}
		head = Reverse(temp1.next);
		temp2 = temp1.next;
		temp2.next = temp1;
		temp1.next = null;
		
		return head;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = take_input();
		print(head);
		System.out.println("");
		head = Reverse(head);
		print(head);
	}

}
