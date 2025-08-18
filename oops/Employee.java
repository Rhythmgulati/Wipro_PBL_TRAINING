package oops;



public class Employee extends Person{
	double annualsalary;
	String year;
	String Inumber;
	
	void getDetail() {
		System.out.println(super.name+" "+this.year);
	}
}
