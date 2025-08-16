package JavaFundamentals;

public class J_24_Array_max2Nmin2 {
public static void main(String[] args) {
	int[] arr = {72,63,84,72,86,82,76,87,89,81};
	
	int max1=arr[0];
	int max2=arr[0];
	int min1=arr[0];
	int min2=arr[0];
	
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>max1) {
			max2=max1;
			max1=arr[i];
     	}
		if(arr[i]<min1) {
			min2=min1;
			min1=arr[i];
		}
	}
	System.out.println("Max1:"+max1+" Max2:"+max2+" Min1:"+min1+" Min2:"+min2);
}
}
