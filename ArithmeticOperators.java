package corejava2;
import java.util.Scanner;
public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number1 value..?");
		int num1=sc.nextInt();
		System.out.println("enter number2 value..?");
		int num2=sc.nextInt();
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		int mod=num1%num2;
		System.out.println("sum= : "+sum);
		System.out.println("sub= : "+sub);
		System.out.println("mul= : "+mul);
		System.out.println("div= : "+div);
		System.out.println("mod= : "+mod);

	}

}
