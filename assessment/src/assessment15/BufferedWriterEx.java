package assessment15;
import java.io.*;
public class BufferedWriterEx {
	public static void main(String[] args) throws Exception {     
	    FileWriter writer = new FileWriter("c:/users/sri/desktop/myfile.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("java programming......");  
	    buffer.close();  
	    System.out.println("Success............");  
	    } 
}
