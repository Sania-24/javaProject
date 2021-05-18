package assessment10;
interface Sayable{  
    // Default method   
    default void say(){  
        System.out.println("Hello, this is default method");  
    }      
}  
public class defaultEx implements Sayable
{    
    public static void main(String[] args) {  
        defaultEx dm = new defaultEx();  
        dm.say();   // calling default method    
    }  
}  
