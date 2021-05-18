package asssessment16;
import java.util.*;
public class HashSetEx {
	public static void main(String args[]) {
	HashSet<String> set=new HashSet<String>();  
    set.add("Ravi");  
    set.add("Vijay");  
    set.add("Arun");  
    set.add("Sumit");
    set.add("Suman");  
    set.add("Anil");  
    set.add("tara");  
    set.add("Sushma");  
    set.add("mounika");  
    set.add("tarun");  

    System.out.println("An initial list of elements: "+set);
    System.out.println();

    //Removing specific element from HashSet  
    set.remove("Ravi");  
    System.out.println("After invoking remove(object) method: "+set);  
    System.out.println();
    HashSet<String> set1=new HashSet<String>();  
    set1.add("Ajay");  
    set1.add("Gaurav");  
    set.addAll(set1);  
    System.out.println("Updated List: "+set);  
    System.out.println();

    //Removing all the new elements from HashSet  
    set.removeAll(set1);  
    System.out.println("After invoking removeAll() method: "+set);
    System.out.println();

    //Removing elements on the basis of specified condition  
    set.removeIf(str->str.contains("Vijay"));    
    System.out.println("After invoking removeIf() method: "+set); 
    System.out.println();

    //Removing all the elements available in the set  
    set.clear();  
    System.out.println("After invoking clear() method: "+set);  
}  
}
