package JavaFundamentals;

import java.util.Scanner;

public class J_16_SumOfDigits {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	int sum = 0;
	while(num!=0) {
		int digit = num%10;
		sum+=digit;
		num/=10;
	}
	System.out.println(sum);
}
}
