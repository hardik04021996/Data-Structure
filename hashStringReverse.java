package DataStructures;

import java.util.Scanner;

public class hashStringReverse {

	public static void main(String[] args){
		
	
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.nextLine();
		String result=reverse(input);
	}

	private static String reverse(String input) {
		
		int size=input.length();
		
		for(int index= size-1; index>=0; index--){
			int count=0;
			while(input.charAt(index)!= ' '){
				count++;
			}
			for(index=0; index<size-count; i++){
				
			}
		}
		
	}
	
	
}
