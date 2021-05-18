package assessment10;
interface addition{
	public void add();
}
public class statFinEx implements addition {
 public void add() {
	  int a=10;
	 final int b=20;
	 System.out.println(a+b);	 
 }
 public static void main(String args[])
 {
	 statFinEx obj=new statFinEx();
	 obj.add();
 }
}
