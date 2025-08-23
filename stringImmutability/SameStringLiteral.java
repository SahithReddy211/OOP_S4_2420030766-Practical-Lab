package stringImmutability;

public class SameStringLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java program where two string variables refer to the same literal.Change one variable's value. print both variables and explain the output.
		
	        String a = "Myself sahith";
	        String b = a;
	        System.out.println("Initially 'a': "+a);
	         a = "from cse department";
	        System.out.println("Initially 'b': "+b);
	        System.out.println("After changing value of a , the content in 'a' and 'b' are : ");
	        System.out.println("a:"+a);
	        System.out.println("b:"+b);
	        
	        System.out.println("Here two variables 'a' and 'b' are assigned to same string literal, but \n"
	        		+ "after changing the value of 'a' the content in 'b' will not change because \n"
	        		+ "we assigned 'a' value to 'b' before changing the value in 'a'\n"
	        		+ "so changing the content in one varaible doesnot affect the content in another variable\n"
	        		+ "that is why after changing one of the varibale content, both variables doesn't refer to the same literal.");
	        

	}

}
