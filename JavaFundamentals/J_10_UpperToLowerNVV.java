package JavaFundamentals;

public class J_10_UpperToLowerNVV {
public static void main(String[] args) {
	char ch = 'K';
	if(Character.isLowerCase(ch)) {
		System.out.println(Character.toUpperCase(ch));
	}else {
		System.out.println(Character.toLowerCase(ch));
	}
}
}
