package array;

public class MaxElement {

	public static void main(String[] args) {
		
		int arr[]= {43,66,89,12,4,5,6,84,9};
		
		// method 1 to find max element in array
		// method 1 to find min element in array
		
		int max=0;
		int sum=0; // For find sum of array elements
		int temp=0; //To perform sorting
		// int min = 0;
		for(int i=0;i<arr.length;i++) 
		{
		    sum=sum+arr[i];    // sum of  array
		    if(arr[i]>max)
		                      //  if(arr[i]<max) -----> we use < to print minimum value
	    	max=arr[i];
		} 
		
		System.out.println("largest element in Array is "+max);
		// System.out.println("smallest element in Array is "+min);
		System.out.println("Sum of array elements is "+sum);
		
		
	}
}
