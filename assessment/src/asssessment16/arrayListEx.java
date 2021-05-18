package asssessment16;

import java.util.ArrayList;

public class arrayListEx {
	public static void main(String args[]){  
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
		      list.add("Mango");//Adding object in arraylist    
		      list.add("Apple");    
		      list.add("Banana");    
		      list.add("Grapes");
		      list.add("carrot");
		      list.add("orange");
		      list.add("potato");
		      list.add("tomato");
		      list.add("car");
		      list.add("bus");
              
		      //Printing the arraylist object 
		      System.out.println(list);
		      System.out.println("Iterating the elements:");
		      for(String fruit:list)    
		    	    System.out.println(fruit);   
		      System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0  
		      list.set(1,"Dates"); 
		      System.out.print("after adding the elements:");
		      System.out.println(list);
		      System.out.println("The element APPLE is available in ArrayList? " + list.contains("C"));
		      System.out.println("The size of the ArrayList is: " + list.size());
		        String ElementName = list.get(0);         
              System.out.println(ElementName);
              list.clear();

      }
}
