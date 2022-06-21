package mock;

public class B1 extends A1{
	

	
	public void test() {
		
		System.out.println("Hi");
	}


	public void test2() {
		System.out.println("Hello");
		
	}
	

	public static void main(String[] args) {
		
		B1 obj = new B1();
		
		obj.test();
		obj.test2();
		obj.test3();

		
	}
}
