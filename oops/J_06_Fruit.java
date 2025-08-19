package oops;

class Fruit{
	String name;
	String taste;
	int size;
	
	Fruit(String name,String taste,int size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	
	void eat() {
		System.out.println("Name is:"+this.name+"Taste is"+this.taste);
	}
}

class Apple extends Fruit{
	public Apple(int size) {
		super("Apple","sWEET",size);
	}
	
	@Override
	void eat() {
	System.out.println("Eating Apple");	
	}
}
class Orange extends Fruit{
	public Orange(int size) {
		super("Orange","sWEET",size);
	}
	@Override
	void eat() {
		super.eat();
	System.out.println("Eating Orange");
	}
}

public class J_06_Fruit {
	public static void main(String[] args) {
		Apple ap = new Apple(4);
		Fruit ap1 = new Apple(10);
		Fruit o1 = new Orange(3);
		ap.eat();
		ap1.eat();
		o1.eat();
	}
}
