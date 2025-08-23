package stringImmutability;

public class StringAppending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java program using a StringBuffer class with "hello" and append "world" print before and after appending
		StringBuffer a = new StringBuffer("Hello");
		System.out.println("The original string before appending: "+a);
		a= a.append(" World");
		System.out.println("After appending 'world' to string a : "+a);

	}

}
