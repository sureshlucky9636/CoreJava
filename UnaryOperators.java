package corejava2;

public class UnaryOperators {

	public static void main(String[] args) {
		/**
		 * unary operators are categorized two types
		 * 			1.prefix Operators
		 * 				a.pre-incre
		 * 				b.pre-decre
		 * 			2.postfix operators
		 * 				a.post-incre
		 * 				b.post-decre
		 */
		int a=100;
		
		//pre-incre
		++a;
		System.out.println("++a : "+a--+--a);
		//pre-decre
		--a;
		System.out.println("--a : "+a);
		//post-incre
		a++;
		System.out.println("a++ : "+a);
		//post-decre
		a--;
		System.out.println("a-- : "+a);
		--a;
		System.out.println("++a : "+a);	
	}
      
}
