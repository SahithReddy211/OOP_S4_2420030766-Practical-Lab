package stringImmutability;

public class AllMethods {

	public static void main(String[] argv) {
		
		StringBuffer k = new StringBuffer();
		System.out.println("Capacity of the string intially: "+k.capacity());
		System.out.println("Appended the empty string with: "+k.append("Hello everyone, this session is about string buffer class."));
		
		System.out.println("Length of the string: "+k.length());
		System.out.println("Character at index 10: "+k.charAt(10));
		k.setCharAt(10,'x');
		System.out.println("After replacing character at index 10 with x: "+k);
		System.out.println("Substring from index 24: "+k.substring(24));
		System.out.println("Substring from index 5 to index 15: "+k.substring(5,15));
		System.out.println("value of the string: "+k.toString());
		StringBuffer m = new StringBuffer("Java");
		System.out.println("Reversing the string (m): "+m.reverse());
		System.out.println();
		
		// Ensuring desired capacity
		System.out.println("Original Capacity is: "+k.capacity());
		k.ensureCapacity(59);
		System.out.println("After setting capacity (59): "+k.capacity());
		System.out.println();
		
		// setting length
		System.out.println("Original Length is : "+k.length());
		k.setLength(70);
		System.out.println("After setting length: "+k.length());
		System.out.println();
		
		System.out.println("After deleting character at index 10: "+k.deleteCharAt(10) );
		System.out.println("Replaced 'everyone' with Students: "+k.replace(6,13,"Students"));
		
		
		



	}
}
