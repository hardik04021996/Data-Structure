package DataStructures;

import java.util.HashMap;

public class HashMapRemoveDuplicates {

	public static void main(String[] args) {
	  
		HashMap<Integer,Integer> map= new HashMap();
		int[] input1= {7,5,2,1,9,2,7,7};
		int size=0;
		    for(int a: input1){
			  if(!map.containsKey(a)){
			  map.put(a,1);
			  size++;
			  }
	          else{
	        	int freq=map.get(a);
	        	map.put(a,freq+1);
	          }
		   }	
		 
		    int input2[]= new int[size];    
		   
		   int i=0;
		        for(int a: input1){
		    	if(map.get(a)==1){
					input2[i]=a;
		    	}
		    	else if(map.get(a)>1){
		    		input2[i]=a;
		    		map.put(a,-1);
		    		
		    	}
		    	i++;
		    	
		    }
	
		    

		    for(int j=0; j<input2.length;j++){
		    	System.out.println(input2[j]);
		    }

	}

}
