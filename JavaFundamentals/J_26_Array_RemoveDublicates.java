package JavaFundamentals;

import java.util.Arrays;

public class J_26_Array_RemoveDublicates {
public static void main(String[] args) {
	int[] arr = {2,3,43,53,43,2,3,23};
	int[] arr2 = new int[arr.length];
	System.out.println(Arrays.toString(arr2));
	int j = 0;
    for (int i = 0; i < arr.length; i++) {
        boolean found = false;
        for (int k = 0; k < j; k++) {
            if (arr2[k] == arr[i]) {
                found = true;
                break;
            }
        }
        if (!found) {
            arr2[j] = arr[i];
            j++;
        }
    }
    
    int[] arrans = Arrays.copyOf(arr2, j);
    
    System.out.println(Arrays.toString(arrans));

}
}
