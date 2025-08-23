package stringImmutability;

public class EqualsOperatorDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java program to show the difference between == and equals() for string objects in java.
		StringBuffer a = new StringBuffer("Hello");
		StringBuffer b = new StringBuffer("Hello");
		System.out.println("a==b: "+(a==b));
		System.out.println("Here the a and b are two objects and the '==' operator checks only the refernce numbers"
				+ "of the objects, since every object has unique refernce number we get the result as fasle.");
		
		System.out.println("Using equals() method : "+a.toString().equals(b.toString())); 
		System.out.println("Here the equals method checks the content in the strings but here  a and b are "
				+ "objects so the result will be false it again checks the reference number only so the objects should be converted into "
				+ "strings, hence the result is true after converting to strings.");

		

	}

}
