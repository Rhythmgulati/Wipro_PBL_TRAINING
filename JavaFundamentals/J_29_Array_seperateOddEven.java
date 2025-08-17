package JavaFundamentals;

import java.util.Arrays;

public class J_29_Array_seperateOddEven {
public static void main(String[] args) {
	int arr[]= {3,3,2};
	int res[] = new int[arr.length];
	
	int start = 0;
	int end = arr.length-1;
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2==0) {
			res[start]=arr[i];
			start++;
		}else {
			res[end]=arr[i];
			end--;
		}
	}
	System.out.println(Arrays.toString(res));
}
}
