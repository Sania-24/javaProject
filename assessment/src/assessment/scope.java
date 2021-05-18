package assessment;

public class scope {

		/* local variable declaration */
		static void method() {
		int n=10;
		 System.out.println("n="+n);
		}
		public static void main(String args[]) {

		  /* global variable declaration */
		  int n=15;
		 System.out.println("n="+n);
		 method();
		 
	}

}
