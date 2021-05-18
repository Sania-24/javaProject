package assessment15;
import java.io.FileReader;
public class filereaderEx {
	public static void main(String args[])throws Exception{    
        FileReader fr=new FileReader("c:/users/sri/desktop/myfile.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
  }    
}
