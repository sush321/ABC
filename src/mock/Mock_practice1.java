package mock;

public class Mock_practice1 extends Mock_practice {  

	public  void test(){
		
		System.out.println("I am completed method of  Mock_practice1");
	}
	
	public void demo() {
		System.out.println("I am Happy ");
		super.demo();
	}
	
	
	static public  void main(String[] args) {
		
		
		Mock_practice1 obj = new Mock_practice1();
		
		obj.test();
		obj.test1();
		obj.demo();
		
	}

}
