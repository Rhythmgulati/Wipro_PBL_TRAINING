package JavaFundamentals;

import java.util.Iterator;

public class J_15_isPrime {
public static void main(String[] args) {
	boolean isprime = true;
	for (int i = 10; i < 99; i++) {
		isprime=true;
		for(int j=2;j<i/2;j++) {
			if(i%j==0) {
				isprime=false;
			}
		}
		if(isprime==true) {
			System.out.print(i+"  ");
		}
	}
}
}
