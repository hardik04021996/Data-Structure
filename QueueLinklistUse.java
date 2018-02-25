package DataStructures;

public class QueueLinklistUse {

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		QueueList<Integer> s = new QueueList<>();
	 for(int i = 0;i<5;i++)
		{
			s.enqueue(i);;
		}
		System.out.println(s.size());
		System.out.println(s.front());
		//System.out.println(s.size());
		for(int i = 0;i<5;i++)
		{
			System.out.println(s.dequeue());
		}
		//s.enqueue(1);
		//System.out.println(s.dequeue());
		
	}

}
