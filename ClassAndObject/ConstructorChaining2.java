package project8;
/* 6. Create a class Box with attributes length, width, and height. Implement:
Default constructor (all = 1).
Constructor with two parameters (length, width, height = 1).Constructor with three parameters.
Use constructor chaining and the this keyword where necessary. Compute the volume of the box.
*/

class Box{
	int length;
	int width;
	int height;
	
	Box(){
		this(1,1,1); // using this keyowrd 3 parameter constructor is called 
	}
	Box(int length,int width){
		this(length,width,1); // using this keyword here 3 parameter constructor is called 
	}
	
	Box(int length,int width,int height){
		this.length=length;
		this.width =width;
		this.height=height;
	}
	
	void display() {
		System.out.println("Volume= "+(length*width*height));
	}
}
public class ConstructorChaining2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box();
		Box b2 = new Box(20,30);
		Box b3 =new Box(20,30,10);
		
		b1.display();
		b2.display();
		b3.display();

	}

}
