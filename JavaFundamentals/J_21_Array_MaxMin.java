package JavaFundamentals;

public class J_21_Array_MaxMin {
public static void main(String[] args) {
	int[] arr = {2,45,3,5,1,3,5};
	
	int min=arr[0];
	int max=arr[0];

	for (int i = 0; i < arr.length; i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("Min:"+min+" Max: "+max);

}
}
