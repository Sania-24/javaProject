package assessment15;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
 
public class outputstream {
	 public static void main(String[] args) {
		 try{    
             FileOutputStream fout=new FileOutputStream("c:/users/sri/desktop/myfile.txt");    
             String s="Hi I am sania mirza.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
	         
	    }

