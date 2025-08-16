package JavaFundamentals;

public class J_20_Array_sumNaverage {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0]=5;
		arr[1]=2;
		arr[2]=7;
		arr[3]=6;
		arr[4]=5;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("Sum:"+sum+" Average: "+sum/arr.length);
	}
}
