package assessment15;
import java.io.*;
public class bufferedInputEx {
	public static void main(String args[]){    
		  try{    
		    FileInputStream fin=new FileInputStream("c:/users/sri/desktop/myfile.txt");    
		    BufferedInputStream bin=new BufferedInputStream(fin);    
		    int i;    
		    while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    bin.close();    
		    fin.close();    
		  }catch(Exception e){System.out.println(e);}    
		 }    
}
