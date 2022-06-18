package corejava2;

public class ShiftOperators {

	public static void main(String[] args) {
	int number=20, result , number2=40;
	//leftshift operator
	result=number<<2;
	System.out.println(" Leftshift Number= :"+ result);
	//Rightshift Operator
	result=number>>2;
	System.out.println(" rightshift Number= :"+ result);
	//Unsigned Right shift
	result=number>>>2;
	System.out.println(" unsigned rightshift Number= :"+ result);
	
	//Negative value
	result=number2>>2;
	System.out.println(" negative_value Rightshift Number= :"+ result);
	}

}
