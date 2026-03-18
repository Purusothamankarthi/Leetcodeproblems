package leetcode;
class Solution {
    
    public static void main(String[] args)
	{
		int nums[]= {3,6,9,1};
		maximumGap m=new maximumGap();
//		System.out.print(m.maximumGap1(nums));
		
		int nums1[]= {1,2};
		int nums2[]= {3,4};
		MedianSortedArrays median=new MedianSortedArrays();
//		System.out.print(median.findMedianSortedArrays(nums1, nums2));
		int num3[]= {-1,2,1,-4};
		int target=2;
		threeSumClosest closest=new threeSumClosest();
		System.out.print(closest.findthreeSumClosest(num3, target));
	}
}
