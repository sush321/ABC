package mock;

public class D implements C{

	
	public void demo() {
		System.out.println("Hello Java");
		
	}

	
	public int demo1() {
		System.out.println("Java");
		return 0;
	}

	
	public String demo2() {
		System.out.println("Velocity");
		return null;
	}

	
	public static void main(String[] args) {
		
		D obj = new D();
		
		obj.demo();
		obj.demo1();
		obj.demo2();
		C.demo5();
	}
}
