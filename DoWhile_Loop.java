package corejava2;
import java.util.Scanner;
/**
 * 
 * 
 * @author se22084
 * to Print Natural Numbers Using Do While loop
 */

public class DoWhile_Loop {

	public static void main(String[] args) {
		// Read a number
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number value..?");
		int number=sc.nextInt();
		 int i=1;    
		    do{    
		        System.out.println(i);    
		    i++;    
		    }while(i<=number); 
		    sc.close();
	}

}
