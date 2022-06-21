package javaprograming;

import java.util.Scanner;

public class Reverse_number {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int num= sc.nextInt();
		
		// 1 Using algorithm
		/*
    	int rev = 0;                       // at last  0 occurs it fails
		while(num!=0) {
			rev=rev*10 + num%10;
			num = num/10;
		}
		System.out.println("Reverse Number is:" + rev);
		
		*/
		
		// 2  StringBuffer class
		
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse Number is:" + rev);
		
		System.out.println(sb.length());
		System.out.println(sb.charAt(2));
		
		// 3 StringBuilder class
		
/*
		StringBuilder sbl= new StringBuilder();
		sbl.append(num);
		
		StringBuilder rev = sbl.reverse();
				
		System.out.println("Reverse Number is:" + rev);
		
		*/
	}
}
