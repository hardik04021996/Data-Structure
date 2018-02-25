package DataStructures;

import java.util.Scanner;

public class Duplicating {

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


	public static Node<Integer> Duplicate(Node<Integer> head)
	{
		Node<Integer> temp = head;
		Node<Integer> temp1 = head;
		Node<Integer> temp2 = head;
		while(temp1!=null)
		{
			while(temp2!=null)
			{
				if(temp1.data==temp2.data)
				{
					temp.next = temp.next.next;
				}
				else
				{
					temp=temp.next;
					temp1 = temp1.next;
					temp2 =temp2.next;
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
		return head;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = take_input();
		print(head);
		System.out.println("");
		head = Duplicate(head);
		print(head);
	}

}
