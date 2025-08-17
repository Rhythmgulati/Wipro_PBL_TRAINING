package JavaFundamentals;

import java.util.Arrays;

public class J_31_Array_MiddleElementNewArray {
public static void main(String[] args) {
	int arr1[] = {4,8,2};
	int arr2[] = {5,4,7};
	int res[] = new int[2];
	
	int mid1=arr1[arr1.length/2];
	int mid2=arr2[arr2.length/2];
	
    res[0]=mid1;
    res[1]=mid2;
    
    System.out.println(Arrays.toString(res));
}
}
