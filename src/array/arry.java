package array;

public class arry {

	public static void main(String[] args) {
		
//		int [] marks = new int [5];
//	
//		marks[0] = 100;
//		marks[1] = 90;
//		marks[2] = 84;
//		marks[3] = 88;
//		marks[4] = 92;
		
		int [] marks = {87,58,98,75,98};
		
		//System.out.println(marks[3]);
		
		// display array

		for(int i=0;i<=marks.length-1;i++) {
			System.out.println(marks[i]);
		}
		
//		// display array 
//		for(int element:marks) {
//			System.out.println(element);
//		}
		
		// revers order
		for(int i=marks.length-1;i>=0;i--) {
			System.out.println(marks[i]);
		}
		
	}
}
