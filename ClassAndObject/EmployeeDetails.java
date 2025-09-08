package project8;
/*Create a class Employee with data members id, name, and salary. In the constructor, 
 * use parameter names same as instance variable names and resolve ambiguity using the this keyword. Display employee details.
 */

class Employee{
	int id;
	String name;
	int Salary;
	
	Employee(int id, String name, int Salary){
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	
	void display() {
		System.out.println("Employee id : "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+Salary);
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(1,"Sahith",20000);
		Employee b = new Employee(2,"Ramesh", 30000);
		e.display();
		b.display();

	}

}
