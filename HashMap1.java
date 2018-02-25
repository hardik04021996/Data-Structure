package DataStructures;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args){
		
		
		HashMap<Integer,Integer> map= new HashMap();
		int[] input1= {7,5,2,1,9,2,7,7};
		int[] input2= {6,3,2,7,7,7,7};
		
		for(int a: input1){
			if(!map.containsKey(a))
			map.put(a,1);
	        else{
	        	int freq=map.get(a);
	        	map.put(a,freq+1);
	        }
		}	
		
		for(int a : input2){
			if(map.containsKey(a)){
				if(map.get(a)>0){
					System.out.println(a);
					int freq= map.get(a);
					map.put(a,freq-1);
				}
			}
		}
	}
}
