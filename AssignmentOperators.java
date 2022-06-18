package corejava2;
/**
 *Assignment operators
 * 
 */
import java.util.Scanner;

public class AssignmentOperators {

	public static void main(String[] args) {
	    //
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number-1 Value..?");
		int number1=sc.nextInt();
		System.out.println("Enter Number-2 Value..?");
		int number2=sc.nextInt();	
		
		// Assignment Operator
		System.out.println("Assignment Operator : "+(number1=number2));
		
		//Add and Assignment Operator
		System.out.println("Assignment Operator : "+(number1+=number2));
		
		//Subtract and Assignment Operator
		System.out.println("Assignment Operator : "+(number1-=number2));
		
		// multiply and Assignment Operator
		System.out.println("Assignment Operator : "+(number1*=number2));
		
		// div and Assignment Operator
		System.out.println("Assignment Operator : "+(number1/=number2));
		
		// module and Assignment Operator
		System.out.println("Assignment Operator : "+(number1%=number2));
		
			}

}
