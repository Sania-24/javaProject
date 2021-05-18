package assessment14;

public class handleExc {
	 public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=10/0;  
		   }catch(ArithmeticException e){
			   System.out.println(e);
			   }  
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }  
		}  

