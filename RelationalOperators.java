package corejava2;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		// Relational Operators
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number-1 Value..?");
		int number1=sc.nextInt();
		System.out.println("Enter Number-2 Value..?");
		int number2=sc.nextInt();
		
		// == operator
	    System.out.println(number1 == number2);  

	    // != operator
	    System.out.println(number1 != number2);

	    // > operator
	    System.out.println(number1 > number2);  

	    // < operator
	    System.out.println(number1 < number2); 

	    // >= operator
	    System.out.println(number1 >= number2); 

	    // <= operator
	    System.out.println(number1 <= number2); 
	   

	}
}
