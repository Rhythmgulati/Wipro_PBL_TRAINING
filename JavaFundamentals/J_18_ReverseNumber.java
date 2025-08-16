package JavaFundamentals;

public class J_18_ReverseNumber {
public static void main(String[] args) {
	int num = 555656543;
	int ans = 0;
	while(num!=0) {
		int digit=num%10;
		ans=ans*10+digit;
		num/=10;
	}
	System.out.println(ans);
}
}
