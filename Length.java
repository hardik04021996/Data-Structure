package DataStructures;

import java.util.Scanner;

public class Length {
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

	public static int LinkedLength(Node<Integer> head)
	{

		int count = 0;	
		Node<Integer> temp =head;
		while(temp!=null)
		{
			count++;
			temp = temp.next;
		}
		head = head.next;
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = take_input();
		System.out.println(LinkedLength(head));
	}

}
