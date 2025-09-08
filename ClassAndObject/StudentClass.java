package project8;
        //Create a class Student with attributes rollNo, name, and marks.Aaccept details from the user. 
		//Create multiple student objects and print their details.
import java.util.Scanner;
class student{
	int rollno;
	String name;
	int marks;
	
	void DetailsDisplay() {
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
		System.out.println();
	}
}
public class StudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n= sc.nextInt();
		student[] std = new student[n];
		
	
		for(int i=0;i<n;i++) {
			std[i] = new student();
		System.out.print("Enter student "+i+" roll no: ");
		std[i].rollno = sc.nextInt();
		System.out.print("Enter student "+i+" name: ");
	    std[i].name = sc.next();
		System.out.print("Enter student "+i+" marks: ");
		std[i].marks = sc.nextInt();
		System.out.println();
		}
		  System.out.println("\nStudent Details:");
	        for (int i = 0; i < n; i++) {
	            std[i].DetailsDisplay();
	        }

		sc.close();
	}
}
