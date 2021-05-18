package assessment8;
class privcls{  
private int data=40;  
private void msg(){
	System.out.println("Hello java");
  }  
public void access() {
	msg();
	System.out.println(data);
}
} 

	class privateEx extends privcls{
	    public static void main(String args[]) {
	        System.out.println("In the subclass");
	        privateEx sb = new privateEx();
	        sb.access();
           }
	   }
