package assessment3;
import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {
		int number, i = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		while(i <= number)
		{
			System.out.print(i +"\t"); 
			i++;
		}	

}
}
