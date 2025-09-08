package project8;
/*Create a class Book with attributes title, author, and price.
Use a parameterized constructor to initialize the data and display the book details.*/

class Book{
	String Title;
	String author;
	int price;


Book(String T, String a, int p){
	this.Title=T;
	this.author=a;
	this.price=p;
}
	void display() {
		System.out.println("Book title : "+Title);
		System.out.println("Book author :"+author);
		System.out.println("Book price :"+price);
	}
}

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book("Bhagavatgita","Vyasa", 200);
		Book w = new Book("Lost in life","Sam altmon",500);
		b.display();
		w.display();
	}

}
