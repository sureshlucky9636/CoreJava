package corejava2;
import java.util.Scanner;
/**
 * 
 * 
 * @author se22084
 * to perform Arithmetic Operations using Switch_Case
 */

public class Switch_Case {

	public static void main(String[] args) {
		//Read input values
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number1 value..?");
		int number1=sc.nextInt();
		System.out.println("enter number2 value..?");
		int number2=sc.nextInt();
		System.out.println("Choose an operator: +, -, *, or /");
	    
		
		int operator = sc.next().charAt(0);
	    // choose particular Arithmetic Operation
	    switch(operator)
		{
		
	    case '+':
	    {
	    	System.out.println("Addition = "+ (number1+number2));
	    	break;
	    }
	    case '-':
	    {
	    	System.out.println("Subtraction= "+ (number1-number2));
	    	break;
	    }
	    case '*':
	    {
	    	System.out.println("Multiplication = "+ (number1*number2));
	    	break;
	    }
	    case '/':
	    {
	    	System.out.println("Division = "+ (number1/number2));
	    	break;
	    }
	    case '%':
	    {
	    	System.out.println("Module Division = "+ (number1%number2));
	    	break;
	    }
	    default: 
	    	System.out.println("enter valid operator in the above list");
	    }
sc.close();
}
}
