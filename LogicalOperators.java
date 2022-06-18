package corejava2;

/**
 * 
 * Logical Operators programs
 * @author se22084
 *
 */
public class LogicalOperators {
	public static void main(String args[]) {
	
	
			// && operator
		    System.out.println((5 > 3) && (8 > 7));  
		    System.out.println((5 > 3) && (8 < 5));

		    // || operator
		    System.out.println((5 < 3) || (8 > 5));
		    System.out.println((5 > 3) || (8 < 5));
		    System.out.println((5 < 3) || (8 < 5));

		    // ! operator
		    System.out.println(!(5 == 3));
		    System.out.println(!(5 > 3)); 
              
}
}
