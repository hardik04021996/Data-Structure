package DataStructures;

import java.util.Scanner;

public class Swapping {

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

	public static Node<Integer> Swap(Node<Integer> head)
	{
		Node<Integer> temp = head;
		if(head==null ||head.next==null)
		{
			return head;
		}

		Node<Integer> prev = head;
		Node<Integer> CurrentNode = head.next;
		head = CurrentNode;
		while(temp!= null)
		{
			Node<Integer> next1 = CurrentNode.next;
			CurrentNode.next = prev;
			if(next1==null||next1.next==null)
			{
				prev.next = next1;
				break;
			}
			prev.next = next1.next;
			prev = next1;
			CurrentNode = prev.next;


		}
		return head;
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = take_input();
		print(head);
		System.out.println("");
		head = Swap(head);
		print(head);
	}

}
