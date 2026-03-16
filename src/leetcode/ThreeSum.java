package leetcode;
import java.util.*;

public class ThreeSum {
	
	public static void main(String[] args)
	{
		int arr[]= {-1,0,1,2,-1,-4};
		int arr1[]= {1,0,-1,0,-2,2};
		int arr2[]= {2,2,2,2,2};
		int target=8;
		threesum1 ans=new threesum1();	
//		System.out.print(ans.threesum2(arr));
		foursum1 ans1= new foursum1();
		System.out.print(ans1.foursum2(arr2, target));
	}
}

