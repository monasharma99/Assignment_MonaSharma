package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	 public static void print(Map<String, Integer> map) 
	    {
	        if (map.isEmpty()) 
	        {
	            System.out.println("map is empty");
	        }
	         
	        else
	        {
	            System.out.println(map);
	        }
	    }
	
	public static void main(String[] args) 
   {
    
       HashMap<String, Integer> map = new HashMap<>();
        
       print(map);
       map.put("Tim", 10);
       map.put("John", 30);
       map.put("Sam", 20);
        
       System.out.println("Size of map is:- " + " ");
    
       print(map);
       if (map.containsKey("Tim")) 
       {
           Integer a = map.get("Tim");
           System.out.println("value for key \"Tim\" is:- " + a );
       }
        
       map.clear();
       print(map);
   }
    
  
}
