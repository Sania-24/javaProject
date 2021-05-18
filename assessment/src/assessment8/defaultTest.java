package assessment8;

	public class defaultTest {
		   // variables that have no access modifier
		   int age = 21;
		   String name = "sania";

		   /**
		    * This method is declared with default access specifier
		    */
		   String getInfo() {
		      return name +" is "+ age +" years old.";
		   }
		   public static void main(String[] args)
		   {
		      System.out.println(new defaultTest().getInfo());
		   }
		}

