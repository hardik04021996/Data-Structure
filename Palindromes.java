package DataStructures;

import java.util.Scanner;


public class Palindromes {


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




	public static Node<Integer> Reversal(Node<Integer> head)
	{
		Node<Integer> prev = head;
		Node<Integer> next = head;
		Node<Integer> CurrentNode = head;
		CurrentNode = head;
		prev  =  null;
		while(CurrentNode!= null)
		{
			next = CurrentNode.next;
			CurrentNode.next = prev;
			prev = CurrentNode;
			CurrentNode = next;
		}
		head = prev;
		return head;
	}


	public static Node<Integer> Mid(Node<Integer> head)
	{
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node<Integer> ReverseHalf(Node<Integer> head)
	{


		Node<Integer>mid = Mid(head);
		Node<Integer>head1 = mid.next;
		head1 = Reversal(head1);
		return head1;
	}

	public static boolean Palindrome(Node<Integer> head1)
	{
		Node<Integer> temp1 = head1;
		Node<Integer> mid = Mid(head1);
		//Node<Integer> head1 = head;
		Node<Integer>temp2 = mid.next;
		mid.next = null;
		temp2 = Reversal(head1);
		while(temp1!=null && temp2!=null)
		{
			if(temp1.data == temp2.data)
			{
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			else
				return false;
		}
		if(temp1==null && temp2 ==null)
		{
			return true;
		}
		else
			return false;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = take_input();
		print(head);
		System.out.println(" ");
		if(Palindrome(head))
		{
			System.out.println("It is  a Plaindrome");
		}
		else
			System.out.println("Not  a palindrome");
	}

}
