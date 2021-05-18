package assessment8;
import assessment7.*;
public class ProtectedTest {
	   // variables that are protected
	   protected int age = 20;
	   protected String name = "sneha";

	   /**
	    * This method is declared as protected.
	    */
	   protected String getInfo() {
	      return name +" is "+ age +" years old.";
	   }
	   public static void main(String[] args) {
		   privcls obj=new privcls();
		   obj.access();
	      System.out.println(new ProtectedTest().getInfo());
	   }
	}

