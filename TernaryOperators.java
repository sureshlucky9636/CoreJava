package corejava2;
/**
 * 
 * Ternary Operators
 * @auther22084
 */

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		//Reading input Values
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number-1 Value..?");
		int number1=sc.nextInt();
		System.out.println("Enter Number-2 Value..?");		
		int number2=sc.nextInt();	
		
        // Largest among number1  and number2
       int Largest = (number1 > number2) ? number1 : number2;
 
        // Print the largest number
        System.out.println("Largest number is = " + Largest);
	}

}
