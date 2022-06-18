package corejava2;


/**
 * 
 * 
 * If Statement 
 * @author se22084
 *
 */
import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) {
		// Read Input Values
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number1 value..?");
		int number1=sc.nextInt();
		System.out.println("enter number2 value..?");
		int number2=sc.nextInt();
		sc.close();
		if(number1>number2)
		{
			System.out.println("number1 is greater value of number2");
		}
		System.out.println("Enter any number try again");
	}

}
