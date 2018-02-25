package DataStructures;

import java.util.Scanner;

public class Deletion {


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


	public static Node<Integer> DeletionIth(Node<Integer> head,int i)
	{
		int count = 1;
		Node<Integer> temp = head;
		if(i==1)
		{
			head = head.next;
			return head;
		}
		else
		{
			while(count<i-1)
			{
				temp = temp.next;
				count++;
			}
			temp.next = temp.next.next;
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = take_input();
		head = DeletionIth(head, 2);
		print(head);
	}

}
