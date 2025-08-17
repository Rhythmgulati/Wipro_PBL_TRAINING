package JavaFundamentals;

import java.util.Arrays;

public class J_28_Array_remove10s {
public static void main(String[] args) {
	int arr[]= {10,2,10};
	int arr2[]=new int[arr.length];
	int j=0;
	for (int i = 0; i < arr.length; i++){
		if(arr[i]==10) {
			continue;
		}else {
		arr2[j]=arr[i];
		j++;
		}
	}
	System.out.println( Arrays.toString(arr2));
}
}
