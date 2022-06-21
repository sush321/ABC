package mock;

public abstract class Mock_practice {

	
	// public abstract static  void test ();  // static can't be abstract
	
	public void test1() {
		System.out.println("I am complete method");
	}
		
	public abstract void test();
		
	
	public void demo() {
		System.out.println("I am Sad ");
	}
	
	 Mock_practice(){
		 System.out.println("i am constructor");
	 }
	
	public static void main(String[] args) {
		
	//	 Mock_practice obj = new  Mock_practice ();
		 
		
		
		int n =542;
        int a=0,b=0;
		int c=n;
		
		while(n>0)
		{
			c=c%10;
			b=b+(c*c*c);
			break;	
		}
		if(b==c)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("NOt Palindrome Number");
		}
	
		 
	}
}
