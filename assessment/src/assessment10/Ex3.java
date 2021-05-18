package assessment10;
interface show {
    public void draw();
}

interface display {
    public void draw();
}
	public class Ex3 implements show,display {
	    
	    public void draw() {
	    	System.out.println("this is java programming");
	    }
	    public static void main(String args[])
	    {
	    	Ex3 obj=new Ex3();
	    	obj.draw();
	    }
}
