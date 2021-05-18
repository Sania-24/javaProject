package assessment15;
import java.io.FileWriter;
public class FileWriterEx {
	 public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("c:/users/sri/desktop/myfile.txt");    
           fw.write("Welcome to my world.....");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}
