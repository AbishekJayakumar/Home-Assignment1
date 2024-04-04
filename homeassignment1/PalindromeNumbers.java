package homeassignment1;

public class PalindromeNumbers {

	public static void main(String[] args) {
		int a = 131;
		int rem = 0;
		
		for (int i = a; i>0 ; i/=10) {
			
		    int t = i%10;
			rem = rem*10+t;
			}
		if (rem==a)
			System.out.println("Palindrome Number");
		
		else
			System.out.println("Not a Palindrome Number");
		
	}

}
