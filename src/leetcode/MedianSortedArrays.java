package leetcode;
import java.util.*;
public class MedianSortedArrays {
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
	        int n1 = nums1.length;
	        int n2 = nums2.length;

	        int[] merged = new int[n1 + n2];

	        // copy elements
	        for (int i = 0; i < n1; i++) {
	            merged[i] = nums1[i];
	        }

	        for (int i = 0; i < n2; i++) {
	            merged[n1 + i] = nums2[i];
	        }

	        // sort
	        Arrays.sort(merged);

	        int n = merged.length;

	        // find median
	        if (n % 2 == 1) {
	            return (double) merged[n / 2];
	        } else {
	            return (double) (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
	        }
	    }
}
