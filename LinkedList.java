package DataStructures;

import java.util.Scanner;

public class LinkedList {

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


	public static void printIth(Node<Integer> head,int n)
	{
		int count = 0;
		Node<Integer> temp =head;
		while(temp!=null)
		{
			
			count++;
			//System.out.println(count);
			if(count==n)
			{
				System.out.println(temp.data);
			}
			temp = temp.next;
		}
	}



	public static void main(String args[])
	{
		Node<Integer>head = take_input();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the position ");
		int N = s.nextInt();
		printIth(head, N);
	}








}
