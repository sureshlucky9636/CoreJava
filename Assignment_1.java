package corejava2;
import java.util.Scanner;

/**
 * 
 * 
 * @author se22084
 * to perform Age Calculate Assignment_1
 */
  	public class Assignment_1 {
  	static double calculateAge(double birthYear ,double birthMonth) {
  	double curentAge=2022-birthYear;
  	double age=((12*curentAge+birthMonth)/12);
  	if(birthMonth<1 || birthYear<1 ) {

  		return-1;
  	}
  	else if (birthMonth>6||birthYear>2022) {
  		return-2;
  	}
	return age;			
	
    }
  	   public static void main(String[] args) {
  		Scanner sc=new Scanner(System.in);
  		System.out.println("enter the your birth year");
  		int birthYear=sc.nextInt();
  		System.out.println("enter the your birth month");
  		int birthMonth=sc.nextInt();
  		System.out.println(calculateAge(birthYear,birthMonth));
  		sc.close();
  	}
  	}
