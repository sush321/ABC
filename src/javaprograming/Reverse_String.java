package javaprograming;

public class Reverse_String {

	public static void main(String[] args) {
		
		// 1) using + (String concatenation) operator
		
//		String str= "ABCD";
//		
//		String rev="";
//		
//		int len = str.length(); // 4
//		
//		for(int i= len-1; i>=0;i--)   
//		{
//			rev= rev+ str.charAt(i);
//			                            // DCBA
//		}
//		System.out.println(" Reversed String is " +rev);
		
		// 2) Using character array
		
//		String str = "ABCD";
//		String rev="";
//		
//		char a[] = str.toCharArray(); // string into multiple character and form character array
//		                              // A-0, B-1,C-2;D-3
//		
//		int len = a.length;  // 4
//		
//		for(int i=len-1;i>=0;i--)  //3
//		{
//			rev= rev+a[i];
//		}
//		System.out.println("Reversed string is "+rev);
		
		
		// 3) String buffer Class
		String str = "ABCD";
		String rev="";
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
	}
}
