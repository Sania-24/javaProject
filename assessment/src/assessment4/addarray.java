package assessment4;
import java.util.Arrays;
import java.util.Scanner;
public class addarray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};  
		int n = arr.length; 
		int num;
		int newArr[] = new int[n+1]; 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
        int value= sc.nextInt();
        System.out.println("before adding the elements");
        System.out.println(Arrays.toString(arr));  
		for(int i = 0; i<n; i++) {  
		newArr[i] = arr[i];  
		}  
		newArr[n] = value;  
		System.out.println("After adding the elements");
		System.out.println(Arrays.toString(newArr)); 

	}

}
