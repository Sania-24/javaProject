package assessment14;
import java.io.*;  
class M{  
 void method()throws IOException{  
  System.out.println(" operation performed");  
 }  
}  
class throwsEx{  
   public static void main(String args[])throws IOException{//declare exception  
     M m=new M();  
     m.method();  
    System.out.println("normal flow of program...");  
  }  
}  



