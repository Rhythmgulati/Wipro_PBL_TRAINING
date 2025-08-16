package JavaFundamentals;

public class J_22_Array_isPresent {
public static void main(String[] args) {
	int[] arr = {72,3,4,32,56,32,66,33,2,1};
	
	int num = 400;
	int idx=-1;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==num) {
			idx=i;
			break;
		}
	}
	System.out.println(idx);

}
}
