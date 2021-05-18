package assessment15;
import java.util.Properties;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStream;
public class propertiesRead {
	
	public static void main(String[] args) {
		readPropertiesFile();
	}
	 public static void readPropertiesFile() {
        Properties prop=new Properties();
        try {
			InputStream input=new FileInputStream("C:\\Users\\sri\\eclipse-workspace\\assessment\\src\\assessment15\\config.properties");
		    prop.load(input);
            System.out.println(prop.getProperty("browser"));
		    
		    
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  

}