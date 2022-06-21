package mock;

public class E {

	
	
	public int test() {
		
		int a=30;
		int b=40;
		int c=a+b;
	//	System.out.println(c);
		return a;
		
		
	}
	
	
	public static void main(String[] args) {
		
		E obj = new E();
		
		System.out.println(obj.test());
	//	obj.test();
		
	}
}
