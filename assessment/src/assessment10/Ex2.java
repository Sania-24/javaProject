package assessment10;
 interface disp {
    public void draw();
}

interface Radio {
    public void startRadio();
    public void stopRadio();
}

public class Ex2 implements disp,Radio {
    public void draw() {
    	System.out.println("this is my method");
    }
    public void startRadio() {
    	System.out.println("start radio");
      // start Radio
    }
    public void stopRadio() {
    	System.out.println("stop playing radio");

        // stop Radio
    }
    public static void main(String args[]) {
    	Ex2 obj=new Ex2();
    	obj.draw();
    	obj.startRadio();
    	obj.stopRadio();
}
}
