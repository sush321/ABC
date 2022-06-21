package array;

import java.util.HashSet;

public class ArryDuplicateRemove {

	public static void main(String[] args) {
		
		// remove duplicate element from array
		
		// 1) for sorted array
		
//		int [] marks =  {25,30,30,42,55,55,65,78,30};
//		
//		int [] temp = new int[marks.length];     // create fixed size  temp array same size  as marks array
//		
//		int j =0;
//		
//		for(int i=0; i < marks.length-1;i++) 
//		{
//			if(marks[i] != marks[i+1])           // checking duplicate array
//			{
//				temp[j]=marks[i];                // not duplicate then add to temp array
//				j++;                             // store array  in different place			
//			}		
//		}
//		
//		temp[j] = marks[marks.length-1];          // for last element add in temp
//		
//		for(int i=0;i<marks.length;i++)            // print the temp array which not duplicate element
//		{
//			System.out.print(temp[i]+" ");
//		}
		
		
//		// 2) for sorted array without using new array 
//		
//		int [] age = {25,30,30,40,45,55,55,60,60,60};
//		
//		int k=0;
//		for(int i=0; i<age.length-1;i++)
//		{
//			if(age[i] != age[i+1])            // checking duplicate array
//			{
//				age[k]=age[i];
//				k++;
//			}		
//		}
//		
//		age[k]=age[age.length-1];            // for last element add 
//		
//		for(int i=0; i<k+1; i++)             // print  array which not duplicate element
//		{
//			System.out.print(age[i]+" ");
//		}
//		
//		
//		
//		System.out.println();
//		
		
		// 3) unsorted array and sorted array by using HashSet
		
		//int [] s = {1,2,2,3,4,5,5,7};     // unsorted 
		
		int [] p = {2,3,3,4,5,5,6,7,7,3,2};    // sorted
		
		HashSet<Integer> hs = new HashSet<>();  // hashset is class we create object 
		
		for(int i=0; i<p.length; i++)
		{
			hs.add(p[i]);                         // dont add duplicate element
		}
		
		for(int no:hs)
		{
			System.out.print(no+" ");
		}
		
		
	}
}
