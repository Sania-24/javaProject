package assessment3;

import java.util.Scanner;

public class malefemale{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the gender:");
        char gender= sc.next().charAt(0);
        switch(gender)
        {
        case 'M':
        case 'm':
        	System.out.println("you are a male");
        	break;
        case 'F':
        case 'f':
        	System.out.println("you are a female");
        	break;
        default:
        	System.out.println("unspecified gender");
        }
        System.out.println();
	}
}

