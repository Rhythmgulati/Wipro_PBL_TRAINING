package JavaFundamentals;

public class J_06_IsArgsPresent {
public static void main(String[] args) {
	int len=args.length;
	System.out.println(len);
	if(len>0) {
		for (String string : args) {
			System.out.print(string+", ");
		}
	}else {
		System.out.println("No Values");
	}
}
}
