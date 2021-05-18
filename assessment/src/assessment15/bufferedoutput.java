package assessment15;
import java.io.*;
public class bufferedoutput {
	public static void main(String args[])throws Exception{    
	     FileOutputStream fout=new FileOutputStream("c:/users/sri/desktop/myfile.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Welcome to home....";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success......");    
	}    
}
