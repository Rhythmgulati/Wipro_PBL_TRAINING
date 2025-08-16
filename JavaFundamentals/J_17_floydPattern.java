package JavaFundamentals;

import java.util.Iterator;
import java.util.Scanner;

public class J_17_floydPattern {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int rows = scanner.nextInt();
	for (int i = 1; i <= rows; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(" * ");
		}
		System.out.println("");
	}
}
}
