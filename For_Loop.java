package corejava2;
import java.util.Scanner;
/**
 * 
 * 
 * @author se22084
 *to Print 1 to N Natural Number using For Loop 
 */
public class For_Loop {

	public static void main(String[] args) {
		// Read a number
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number value..?");
		int number=sc.nextInt();
		sc.close();
		//print natural numbers 
		 for(int i=1;i<=10;i++){  
		  System.out.println(i); 
		  sc.close();
	}
	}
}
