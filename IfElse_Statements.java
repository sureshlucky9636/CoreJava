package corejava2;
import java.util.Scanner;

public class IfElse_Statements {

	public static void main(String[] args) {
		// Read input Values
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number1 value..?");
		int number1=sc.nextInt();
		System.out.println("enter number2 value..?");
		int number2=sc.nextInt();
		//check if_statements
		if(number1>number2)
		{
			System.out.println("number1 value is big : " +number1);
		}
		else
		{
			System.out.println("number2 value is big : " +number2);
		}
	}

}
