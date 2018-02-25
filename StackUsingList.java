package DataStructures;

public class StackUsingList<T> {

	private Node<T> head;
	private int size;

	public StackUsingList()
	{
		size = 0;
	}

	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		return false;
	}

	public int size()
	{
		return size;
	}
	public T top() throws StackEmptyException 
	{

		if(size==0)
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.data;
	}

	public  void push(T ele)
	{
		Node<T>newNode  = new Node<T>();
		newNode.data = ele;
		newNode.next  =head;
		head = newNode;
		size++;
	}

	public T pop() throws StackEmptyException
	{
		if(size==0)
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}

