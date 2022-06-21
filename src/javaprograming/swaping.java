package javaprograming;

public class swaping {

	
	public static void main(String[] args)
	{
		int a=10, b=20;
		
		System.out.println("Before swaping values are.."+a+" "+b);
		
		// Logic1--->Third variable
		
		/* int t=a;
		   a=b;
		   b=t;  */
		
		
		// Logic2----> use + & - without using third statement
		/* a=a+b; //10+20=30
		   b=a-b; //30-20=10
		   a=a-b; //30-10=20  */
		
		// Logic3---> use * and / without using thhird variable 
		// here a & b should be not zero
		   
		/*   a=a*b;  // 10*20=200
		   b=a/b;  // 200/20=10
		   a=a/b;  // 200/10=20  */
		   
		 // Logic4----> bitwise Xor (^)
		
		a=a^b; // 10^20=30
		b=a^b; // 30^20=10
		a=a^b; // 30^10=20
		
		// Logic5---->  single statement
		
	     	// b=a+b - (a=b);
		
		
		
		System.out.println("After swapping values are.."+a+" "+b);
		
	}
}
