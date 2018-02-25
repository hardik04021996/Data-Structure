package DataStructures;

import java.util.Scanner;

public class MergeSort {



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



	public static Node<Integer> Merging(Node<Integer> head1, Node<Integer> head2)
	{
		Node<Integer> temp1 = head1;
		Node<Integer>temp2 = head2;
		Node<Integer> mergeHead = null ;
		Node<Integer> mergeTail = null ;
		if(head1==null)
		{
			return head2;
		}
		if(head2==null)
		{
			return head1;
		}

		while(temp1!= null && temp2!=null)
		{
			if(mergeHead==null)
			{
				if(temp1.data>temp2.data)
				{
					mergeHead = temp2;
					mergeTail = temp2;
					temp2 = temp2.next;
					//mergeTail = mergeTail.next;

				}
				else
				{
					mergeHead= temp1;
					mergeTail = temp1;
					temp1 = temp1.next;
					//mergeTail = mergeTail.next;

				}
			}
			else {


				if(temp1.data>temp2.data)
				{
					//mergeHead = temp1;
					mergeTail.next = temp2;
					temp2 = temp2.next;
					//mergeTail = mergeTail.next;

				}
				else
				{
					//mergeHead= temp2;
					mergeTail.next = temp1;
					temp1 = temp1.next;
				}
				mergeTail = mergeTail.next;

			}
		}
		if(temp1==null)
		{
			mergeTail.next = temp2;
		}
		if(temp2==null)
		{
			mergeTail.next = temp1;
		}



		return mergeHead;

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




	public static Node<Integer> MSort(Node<Integer>head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node<Integer> mid = Mid(head);
		Node<Integer> head1 = head;
		Node<Integer>head2 = mid.next;
		mid.next = null;
		head1 = MSort(head1);
		head2 = MSort(head2);
		Node<Integer>head6 = Merging(head1, head);
		return head6;	
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
		print(head);
		System.out.println("");
		head = MSort(head);
		print(head);
	}

}
