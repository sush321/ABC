package mock;

public class Abc {
	

	public void sushant() {
		System.out.println("non static Method");
	}
	
	public static void sush() {
		System.out.println("Satic Method");
	}
	


	public static void main(String[] args) {
		
		System.out.println("Hello Mini");
		Abc.sush();
		
		Abc obj = new Abc();
		
		obj.sushant();
		
	}
	
}
