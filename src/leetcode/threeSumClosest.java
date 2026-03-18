package leetcode;
import java.util.*;
public class threeSumClosest {
	  public int findthreeSumClosest(int[] nums, int target) {
	       Arrays.sort(nums);
	           int closest = nums[0] + nums[1] + nums[2];
	       for(int i=0;i<nums.length-2;i++)
			{
				if(i==0 || (i>0 && nums[i]!=nums[i-1]))
				{
					int l=i+1;
					int r=nums.length-1;
					int t=-nums[i];
					while(l<r)
					{
	                    int sum = nums[i] + nums[l] + nums[r];
	                      if (Math.abs(target - sum) < Math.abs(target - closest)) {
	                    closest = sum;
	                }
	                if (sum < target) {
	                    l++;
	                } else {
	                    r--;
	                }
	                }
	            }
	        }
	            return closest;

	    }
}
