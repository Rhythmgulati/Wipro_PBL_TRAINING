package JavaFundamentals;

public class J_32_2dArray_reverse {

public static void reverse(int arr[][]) {
	for (int i = arr.length-1; i >= 0 ; i--) {
		for (int j = arr[i].length-1; j >= 0 ; j--) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
}

	
public static void main(String[] args) {
	int[][] arr = new int[2][2];
	int idx=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j]=Integer.parseInt(args[idx++]);
		}
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println("");
	}
	reverse(arr);
	
	
}
}
