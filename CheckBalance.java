package DataStructures;

import java.util.Scanner;

public class CheckBalance {

	public static <T> boolean CheckParenthesis(String input) throws StackEmptyException
	{
		char a = 0;
		StackUsingList<Character> s  =new StackUsingList<>();
		for(int  i =0;i<input.length();i++)
		{
			if(input.charAt(i)=='(' || input.charAt(i)=='{' || input.charAt(i)=='[')
			{
				s.push(input.charAt(i));
				//i++;

			}
			else if(input.charAt(i)==')' || input.charAt(i)=='}' || input.charAt(i)==']')
			{
				if(s.top()=='(' )
				{
					s.pop();
					//i++;
				}
				else if(s.top()=='{')
				{
					s.pop();
					//i++;
				}
				else if(s.top()=='[')
				{
					s.pop();
					//i++;
				}
				else	
					return false;
			}
		}

		return s.isEmpty();
	}

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = s.next();
		if(CheckParenthesis(input))
		{
			System.out.println("Parenthesis are balanced");
		}
		else
			System.out.println("Parenthesis are not balanced");
	}

}
