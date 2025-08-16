package JavaFundamentals;

import java.util.Scanner;

public class J_11_ColorCode {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char code = Character.toUpperCase(sc.next().charAt(0));
	switch (code) {
	case 'R': {
		System.out.println("RED");
		break;
	}
	case 'B': {
		System.out.println("BLUE");
		break;
	}
	case 'G': {
		System.out.println("GREEN");
		break;
	}
	case 'O': {
		System.out.println("ORANGE");
		break;
	}
	case 'Y': {
		System.out.println("YELLOW");
		break;
	}
	case 'W': {
		System.out.println("WHITE");
		break;
	}
	default:
		System.out.println("Invalid code");
	}
}
}
