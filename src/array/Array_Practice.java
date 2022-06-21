package array;

public class Array_Practice {

	public static void main(String[] args) {
		
		
		// 1) create array of 5 float and calculate their sum
		
		float[] mark = {45.8f, 78.8f, 24.5f, 50.5f,80.8f};
		float sum = 0;
		for(float element:mark)
		{
			sum = sum + element;
		}
		System.out.println("The value of sum is "+sum);
		
		
		
		// 2) Find out whether a given integer is present in an array or not
		
		int[] age = {45,78,80,65,80};
		
		int num = 178;
		boolean isInArray = false;   // variable initialization & declaration
		
		for(int element:age)         // for each loop
		{
			if(num==element)
			{
				isInArray = true;    // value assign
				break;
			}
		}
		if(isInArray)
		{
			System.out.println("The number is present in Array");
		}
		else
		{
			System.out.println("The number is not present in Array");
		}
		
		
		
		// 3) calculate avg marks from an array containing marks of all students in physics using for each loop
		
		float[] marks = {45.8f, 78.8f, 24.5f, 50.5f,80.8f};
		float sum1 = 0;
		for(float element:marks)
		{
			sum1 = sum1 + element;
		}
		System.out.println("The value of Average marks  is "+sum1/marks.length);
		
		
		
		// 4) create java pgm to add two matrices of size 2*3
		
		// 2D array in java
		
		int[] [] mat1 = { {1, 2, 3},        // 2 rows & 3 columns
			            	{4,5,6}	} ;
		
		int [][] mat2 = { { 2, 6, 13},
		                   { 3, 7,1} };
		
		int [][] result = { { 0, 0, 0},
                             {0, 0 , 0} };
		
//		for(int i=0; i<mat1.length;i++)            // row number of times
//		{
//			for(int j=0; j<mat1[i].length; j++)     // column number of times 
//			{
//				System.out.format("Setting value for i=%d and j=%d\n", i,j);
//				result[i][j] = mat1[i][j] + mat2[i][j];
//			}
//		}
		
		// 2D array print
		
		for(int i =0; i<mat1.length; i++ )   // row number of times
		{
			for (int j =0;j<mat1[i].length;j++)  // column number of times 
			{
				result[i][j] = mat1[i][j] + mat2[i][j];
				
				System.out.print(result[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
		
		// 5) reverse array 
		
		int arr[]= {1,2,3,4,5,6};
		int n = Math.floorDiv(arr.length, 2);
		int l = arr.length;
		int temp;
		for(int i = 0; i<n; i++)
		{
			// swap a[i] & a[l-a-i]
			
			temp = arr[i];
			arr[i] = arr[l-1-i];
			arr[l-i-1] = temp;
			
		}
		for(int element:arr)
		{
			System.out.print(element + " ");
		}
		
		
		
		
		
	}
}
