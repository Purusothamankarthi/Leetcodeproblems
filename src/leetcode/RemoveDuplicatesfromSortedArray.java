package leetcode;

import java.util.Arrays;


public class RemoveDuplicatesfromSortedArray {
	 public int removeDuplicates(int[] nums) {
		    
         if (nums.length == 0) return 0;

        int k = 1; 

		  for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
		  return k;
    
//		int arr[]= {1,1,2};
//		int arr1[]=new int[arr.length]; 
//		
//		int count=0;int m=0;
//		 for(int i=0;i<arr.length;i++)
//	        {
//	            boolean flag=true;
//	            for(int j=0;j<i;j++)
//	            {
//	                if(arr[i]==arr[j]) flag=false;
//
//	            }
//	            if(flag == true)
//	            {
//	                    count++;   
//	                    arr1[m++]= arr[i];
//	            }
//	        }
//		 String str[] = new String[arr.length];
//
//		 for (int i = 0; i < arr1.length; i++) {
//			 
//		     str[i] = String.valueOf(arr1[i]);
//		 }
//		 System.out.print(Arrays.toString(str));
	}
}
