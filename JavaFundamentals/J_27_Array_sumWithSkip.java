package JavaFundamentals;

public class J_27_Array_sumWithSkip {
public static void main(String[] args) {
	int arr[] = {10,3,6,1,2,7,9};
	int sum=0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==6) {
		for (int j = i; j < arr.length; j++) {
			if (arr[j]==7) {
				i=j+1;
			}
			
		}	
		}
		sum+=arr[i];
	}
	System.out.println(sum);
}
}
