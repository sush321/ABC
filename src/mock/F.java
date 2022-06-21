package mock;

public class F {

	public static void main(String[] args) {

//		for(int i=0; i<=5; i++) {
//			for(int b=i; b>=0; b--) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
//		for(int i =1; i<=5;i++) {
//			for(int b =i;b<=5;b++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
		
		for (int i = 5; i>=0; i--) {
			for(int c=i; c>=0;c--) {
				System.out.print("  ");
			}
			for(int b = i; b<=5;b++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
}
