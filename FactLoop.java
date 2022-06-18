package corejava2;
import java.util.Scanner;
/**
 * 
 * Factorial Using Loop
 * @author se22084
 *
 */
public class FactLoop {

	public static void main(String[] args) {
		//
		long number,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");	
		number=sc.nextLong();
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+number+" is : "+fact);
	}

}
