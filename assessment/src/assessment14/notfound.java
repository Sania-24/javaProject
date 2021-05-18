package assessment14;

public class notfound {
	public static void main(String args[]) {
        try 
        {
            Class.forName("sania mirza");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
    }
}
