package corejava2;

/**
 * Bitwise Operators
 * 
 */
import java.util.Scanner;

public class BitwiseOperators {

public static void main(String args[]) {
    
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Number-1 Value..?");
	int number1=sc.nextInt();
	System.out.println("Enter Number-2 Value..?");
	int number2=sc.nextInt();
	
    //Bitwise AND
    System.out.println("number1 & number2 = " + (number1 & number2));  
    //Bitwise OR
    System.out.println("number1 ^ number2 = " + (number1 ^ number2)); 
    //Bitwise XOR
    System.out.println("number1 | number2 = " + (number1 | number2)); 
    //Bitwise Compliment
    System.out.println("~number1  " + ~number1); 
	}

}

