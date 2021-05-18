package assessment3;

import java.util.Scanner;

public class switchEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
        int num= sc.nextInt();
		
		
		switch(num%2){//this will return 0
		case 0:
		    System.out.println(num+" is an Even number");
		    break;
		case 1:
		    System.out.println(num+" is an Odd number");
		}
	}

}
