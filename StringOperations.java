package corejava2;
/**
 * 
 * 
 * @author se22084
 *To Perform
 */
public class StringOperations {

	public static void main(String[] args) {
		
		String str="Hyderabad";
		String str1="welcomes you ";
		System.out.println("String Length : "+str.length());
		System.out.println("0 index Character"+str.charAt(0));
		System.out.println(" 'd'character index value : "+str.indexOf('d'));
		System.out.println(" bad is there is str : "+str.contains("bad"));
		System.out.println("sub String  : "+str.substring(6,9));
		System.out.println("String UPPERCASE : "+str.toUpperCase());
		System.out.println("String LowerCase : "+str.toLowerCase());
		System.out.println("String Concatenation : "+str1.concat(str));
		System.out.println("String equal or not : "+str.equals(str1));
		System.out.println("String replaceall : "+str.replace("Hyde","Bang"));
		System.out.println("String Trim : "+str.trim());
	}

}
