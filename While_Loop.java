package corejava2;
import java.util.Scanner;
/**
 * 
 * 
 * @author se22084
 *To perform print 1 to N natural numbers
 */
public class While_Loop {

	public static void main(String[] args) {
		// Read a number
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number1 value..?");
		int number=sc.nextInt();
		int i=0;
		 while( i<=number){  
		  System.out.println(" "+i);  
		    i++;  
		    sc.close();
		    }  
	}

}
