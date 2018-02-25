package DataStructures;

import java.util.Scanner;

public class InsertionRecursion {


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

	public static Node<Integer> Insertion(Node<Integer> head,int i,int data)
	{
		Node<Integer> CurrNode = new Node<>();
		CurrNode.data=data;
		if(i==1)
		{
			CurrNode.next = head;
			head = CurrNode;
			return head;
		}
		head.next = Insertion(head.next, i-1, data);
		return head;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = take_input();
		print(head);
		System.out.println("");
		head = Insertion(head, 2, 4);
		print(head);
	}

}
