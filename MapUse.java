package DataStructures;

public class MapUse {

	public static void main(String[] args){
		Map<String,Integer> map= new Map<>();
	    map.put("abc",5);
	    map.put("def",2);
	    int size1=map.size();
	    System.out.println(size1);
	    map.put("ghi",3);
	    map.put("abc",7);
	    map.put("xyz", 8);
	    
	    boolean answer= map.isEmpty();
	    System.out.println(answer);
	   // map.remove("ghi");
	    size1= map.size();
	    System.out.println(size1);
	    System.out.println(map.get("abc"));
	    System.out.println(map.get("ghi"));
	    
	    
	    
	    
	    
		
	}
	
}
