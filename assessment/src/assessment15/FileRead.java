package assessment15;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
 

public class FileRead {
     	public static void main(String[] args) {  
            try  {  
                FileInputStream stream = new FileInputStream("c:/users/sri/desktop/myfile.txt");  
                InputStreamReader reader = new InputStreamReader(stream);  
                int data = reader.read();  
                while (data != -1) {  
                    System.out.print((char) data);  
                    data = reader.read();  
                }  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  

}
