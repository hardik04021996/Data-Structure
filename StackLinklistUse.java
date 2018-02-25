package DataStructures;

public class StackLinklistUse {

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		StackUsingList<Integer> s  =new StackUsingList<>();
		//System.out.println(s.size());
		for(int i = 0;i<5;i++)
		{
			s.push(i);
		}
		System.out.println(s.size());
		for(int i = 0;i<5;i++)
		{
			System.out.println(s.pop());
		}
	}

}
