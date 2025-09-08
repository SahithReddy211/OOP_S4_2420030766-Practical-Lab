package project8;
/*Create a class Car with three constructors:
Default constructor (brand = "Unknown", price = 0).
Constructor with one parameter (brand).
Constructor with two parameters (brand, price).
Use constructor chaining with this() to avoid code duplication and display details.
*/
class Car{
	String Brand;
	int price;
	
	Car(){
	this("Unknown",0);               // using this keyword here 2 parameter constructor is called 
	}
	Car(String Brand){
		this(Brand,0);                // using this keyword here 2 parameter constructor is called 
	}
	Car(String Brand , int price){
		this.Brand =Brand;
		this.price= price;
	}
	
	void display() {
		System.out.println("Brand: "+Brand+"  Price: "+price);
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car("Toyoto");
		Car c3 = new Car("Benz",20000000);
		c1.display();
		c2.display();
		c3.display();

	}

}
