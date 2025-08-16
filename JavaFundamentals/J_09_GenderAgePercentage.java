package JavaFundamentals;

import java.util.Scanner;

public class J_09_GenderAgePercentage {
public static void main(String[] args) {
	String gender = args[0].toLowerCase();
	Integer age = Integer.parseInt(args[1]);
	System.out.println(gender+" "+age);
	if(gender.equals("female") && age>0 && age<58) {
		System.out.println("8.2%");
	}else if(gender.equals("female") && age>58 && age<100) {
		System.out.println("9.2%");
	}else if(gender.equals("male") && age>0 && age<58) {
		System.out.println("8.4%");
	}else if(gender.equals("male") && age>58 && age<100) {
		System.out.println("10.5%");
	}else {
		System.out.println("Enter valid input");
	}
	
}
}
