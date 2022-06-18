package corejava2;
/**
 * 
 * Area of triangle user Defined method
 * @author se22084
 *
 */
import java.util.Scanner;
public class AotUDMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//read width of the triangle
		System.out.println("Enter the Width of the traingle");
		double width=sc.nextDouble();
		//read height of triangle
		System.out.println("Enter the Height of the traingle");
		double height=sc.nextDouble();
		//display area of triangle 
		double area= AOT(width,height);
		System.out.println("Area of Triangle is : "+area);
	}

	static double AOT(double width, double height) {
		
		return ((width*height)/2);
	}

}
