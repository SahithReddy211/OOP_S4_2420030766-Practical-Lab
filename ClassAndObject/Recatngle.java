package project8;

import java.util.Scanner;
// Question: Write a class Rectangle with data members length and breadth. Add methods to calculate and return the area and perimeter.
//Create objects of Rectangle and demonstrate the results.

class Rectangle{
	int length;
	int breadth;
	
	void area() {
		int area= length*breadth;
		System.out.println("The area is : "+area);
	}
	void perimeter() {
		int perimeter = 2*(length+breadth);
		System.out.println("The perimeter is : "+perimeter);
	}

}
public class Recatngle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		r.length = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle: ");
		r.breadth = sc.nextInt();
		r.area();
		r.perimeter();
		sc.close();

	}

}
