package corejava2;
import java.util.Scanner;

/**
 * 
 * 
 * @author se22084
 *to check the grade based on the given subject marks using if_else-is_else condition.
 */
public class IfElse_IfElse {

	public static void main(String[] args) {
		// Read 5 subjects marks
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Subject1 value..?");
		int subject1=sc.nextInt();
		System.out.println("enter Subject2 value..?");
		int subject2=sc.nextInt();
		System.out.println("Enter Subject3 value..?");
		int subject3=sc.nextInt();
		System.out.println("enter Subject4 value..?");
		int subject4=sc.nextInt();
		System.out.println("enter Subject5 value..?");
		int subject5=sc.nextInt();
		//calculate percentage
		int total=subject1+subject2+subject3+subject4+subject5;
		System.out.println("total = "+total);
		int average=total/5;
		System.out.println("Average = "+average);
		
		//display Student Grades
		if(average>85 && average<=99)
		{
			System.out.println("Grade A+");
		}
		else if(average<85 && average<70)
		{
			System.out.println("Grade A");
		}
		else if(average<71 && average<35)
		{
			System.out.println("Grade B ");
		
		}
		else
		{
			System.out.println("fail");
		}
		sc.close();
	}

}
