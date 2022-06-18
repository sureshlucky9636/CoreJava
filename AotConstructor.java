package corejava2;
import java.util.Scanner;
public class AotConstructor {

	long area;
	AotConstructor(long b,long h){
		area=(b*h)/2;
	}
}

class Surya
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//read width of the triangle
		System.out.println("Enter the width of the triangle");
		long width=sc.nextLong();
		
		//read height of the triangle
		System.out.println("Enter the height of the triangle");
		long height=sc.nextLong();
		AotConstructor a =new  AotConstructor( width,height);
		System.out.println("Area of traingle is :"+a.area);
		
	}
}