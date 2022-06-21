package javaprograming;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
	
		int org_num=num;
		int sum = 0;
		int r;
		
		while(num !=0)
		{
			r = num%10;
			sum = sum*10 +r;
			num=num/10;
			
		}
		if(org_num==sum) {
			System.out.println("The number is palindrome "+org_num);
		}
		else {
			System.out.println("The number is not palindrome "+org_num);
		}
	}
}
