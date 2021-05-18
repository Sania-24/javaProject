package asssessment16;

import java.util.*;

public class HashMapEx {
	public static void main(String args[]) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();    
   // System.out.println("Initial list of elements: "+hm);  
      hm.put(101,"Amit");    
      hm.put(102,"Vijay");    
      hm.put(103,"sonia");   
      hm.put(104,"Raju");   
      hm.put(105,"Raghu");   
      hm.put(106,"amreen");   
      hm.put(107,"Rakesh");   
      hm.put(108,"mirza");   
      hm.put(109,"bhavana");   
      hm.put(110,"junaid");   
      System.out.println("Initial list of elements: "+hm);  

      //System.out.println("After invoking put() method ");  
      //for(Map.Entry m:hm.entrySet()){    
       //System.out.println(m.getKey()+" "+m.getValue()); 
      System.out.println();
       System.out.println("The cloned map look like this: " + hm.clone());
       String val = (String)hm.get(103);
       System.out.println("Value for key 103 is: " + val);
       

      }  
}

