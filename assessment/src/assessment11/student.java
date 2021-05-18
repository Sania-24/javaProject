package assessment11;
public class student {  
	//instance variables of the class  
	int id;  
	String name;  
	  
	student(int i, String n){  
	id = i;  
	name = n;  
	}  
	  
	public static void main(String[] args) {  
	//object creation  
	student s = new student(10,"John");  
	//printing instance variables  
	System.out.println(s.id); //prints 10  
	System.out.println(s.name); //prints John  
	}  
	}  
