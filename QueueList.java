package DataStructures;

public class QueueList<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;


	public QueueList()
	{
		//	  front =-1;
		//	  rear = -1
		size = 0;
	}

	public int size()
	{
		return size;
	}

	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else
			return false;
	}


	public 	T front() throws QueueEmptyException
	{
		if(size==0)
		{
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		return front.data;
	}



	public T dequeue() throws QueueEmptyException
	{
		if(size()==0)
		{
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		T temp = front.data;
		if(size==1)
		{
			front = null;
			rear = null;
			size--;
			return temp;
		}
		
		front = front.next;
		size--;
		return temp;	 
	}


	public void enqueue(T ele)
	{
		Node<T>newNode  = new Node<T>();
		newNode.data = ele;
		if(size==0)
		{
			rear = newNode;
			size++;
			front = newNode;
			newNode.next = null;
			return;
		}
		rear.next = newNode;
		rear = newNode;
		newNode.next = null;
		size++;
	}
}
