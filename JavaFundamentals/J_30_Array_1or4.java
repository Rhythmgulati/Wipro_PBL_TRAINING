package JavaFundamentals;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class J_30_Array_1or4 {
public static void main(String[] args) {
	int arr[] = new int[5];
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	boolean ans = true;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=1 && arr[i]!=4) {
			ans = false;
			break;
		}
	}
	System.out.println(ans);
}
}
