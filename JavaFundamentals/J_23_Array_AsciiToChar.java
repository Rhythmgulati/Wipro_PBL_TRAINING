package JavaFundamentals;

public class J_23_Array_AsciiToChar {
public static void main(String[] args) {
	int[] arr = {72,63,84,72,86,82,76,87,89,81};
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println((char)arr[i]);
	}
}
}
