package javaprograming;

public class Plaindrome_String {

	public static void main(String[] args) {
		
       // String a= "mom";  // palindromestring
        String a= "madam";
		int b= a.length();  // b---store length of string a
	
		
		String org_string=a;  // Store string 'a' to 'org_string'
		
		String check= "";  // create string to store reversed string of 'a'

		
		for(int i=b-1; i>=0;i--)   // For reversing  string 
		{
			 check = check + a.charAt(i); 
		}
		
	   if(org_string.equals(check))  // Compare two Strings
	   {
		   System.out.println("Given string is palindromestring");
	   }
	   else
	   {
		   System.out.println("Given string is not palindromestring");
	   }
	}
}
