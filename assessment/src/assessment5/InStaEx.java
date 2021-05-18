package assessment5;

import java.io.*;

class mymethod {
 
    public static String myName = "";
 
    public static void my(String name)
    {
        myName = name;
    }
}
 
class InStaEx {
    public static void main(String[] args)
    {
 
        // Accessing the static method mymethod()
        // and field by class name itself.
        mymethod.my("Sania");
        System.out.println(mymethod.myName);
 
        // Accessing the static method mymethod()
        // by using Object's reference.
        mymethod obj = new mymethod();
        obj.my("mirza");
        System.out.println(obj.myName);
    }
}

