package homeassignment1;

import java.util.Arrays;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int a [] = {1,4,3,2,8,6,7};
		Arrays.sort(a);
		
		int b=1;
		
		//after sorting {1,2,3,4,6,7,8}
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]!=b) {
			
			System.out.println("The Missing Number is : " + b);
			break;
			}
		
			b++;			
			
					
		}
		
		
	}
		
	}

