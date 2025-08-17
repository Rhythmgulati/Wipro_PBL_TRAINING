package oops;





class Author{
	String name;
	String email;
	char gender;
	Author(String name,String email,Character gender ){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	@Override
	public String toString() {
		return "Author Name:"+name+"Email"+email+"Gender:"+gender;
	}
	
}

class Book{
	String name;
	Author author;
	double price;
	int qtyinStock;
	Book(String name , Author author ,double price ,int qtyinStock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyinStock=qtyinStock;
	}
	@Override
	public String toString() {
		return "Book Name: "+name+"Price: "+price+"Quantity"+qtyinStock+"Author:"+author;
	}
}



public class J_03_Encapsulation {
public static void main(String[] args) {
Author auth1 = new Author("Rhythm", "rgbacku@gmail.com", 'M');	
Book book1 = new Book("World ih Horrific", auth1, 200, 1000);
System.out.println(book1.toString());

}
}
