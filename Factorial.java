package corejava2;

import java.util.Scanner;

/**
 * 
 * Factorial program
 * @author se22084
 *
 */
public class Factorial {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the number");
		//int number =sc.nextInt();
		int number=5;
		 int i,fact=1;  
		  
		  for(i=1;i<=number;i++){    
		      fact=fact*i; 
		}
		System.out.println("Factorial of given number is : "+ fact);
		
	}

}
