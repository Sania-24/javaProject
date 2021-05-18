package assessment14;

public class ownmsg { 
		   static void validate(int age){  
		     if(age<18)  
		      throw new ArithmeticException("not valid");  
		     else  
		      System.out.println("Eligible to vote");  
		   }  
		   public static void main(String args[]){  
		      validate(19);  
		  }  
		}  

