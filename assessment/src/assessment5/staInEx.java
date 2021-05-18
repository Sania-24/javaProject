package assessment5;
import java.io.*;
 
class Foo {
 
    String name = "";
 
    // Instance method to be called within the
    // same class 
    public void geek(String name) 
    {
    	this.name = name; 
    }
}
 
class staInEx {
    public static void main(String[] args)
    {
 
        // create an instance of the class.
        Foo ob = new Foo();
 
        // calling an instance method in the class 'Foo'.
        ob.geek("hello world");
        System.out.println(ob.name);
    }
}