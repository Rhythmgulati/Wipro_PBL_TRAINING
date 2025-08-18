package oops;

class Animal{
	void eat() {
		System.out.println("eat");
	}
	void sleep() {
		System.out.println("sleep");
	}
}

class Bird extends Animal{
	void fly() {
		System.out.println("fly");
	}
}


public class J_04_Inheritance_Animal {
public static void main(String[] args) {
	Animal animal = new Animal();
	animal.eat();
	animal.sleep();
	Bird bird = new Bird();
	bird.eat();
	bird.sleep();
	bird.fly();
}
}
