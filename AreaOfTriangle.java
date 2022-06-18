package corejava2;

/**
 * 
 * Area of Triangle
 * @author se22084
 *
 */
import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		//read width of the triangle
		System.out.println("Enter the Width of the traingle");
		double width=sc.nextDouble();
		//read height of triangle
		System.out.println("Enter the Height of the traingle");
		double height=sc.nextDouble();
		//display area of triangle 
	double Area_Of_triangle=(width*height)/2;
	System.out.println("Area_Of_triangle : "+Area_Of_triangle);
	}

}
