package JavaFundamentals;

public class J_19_isPalindrome {
	
	private static int reverse(int num) {
		int ans = 0;
		while(num!=0) {
			int digit=num%10;
			ans=ans*10+digit;
			num/=10;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int num = 123331321;
		
		if(num==reverse(num)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
