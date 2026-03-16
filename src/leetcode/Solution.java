package leetcode;
import java.util.*;
class Solution {
    public int maximumGap1(int[] nums) {
        int ans=0;
       
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++)
            {
                if(ans<(nums[i+1]-nums[i]))
                {
                    ans=nums[i+1]-nums[i];
                }
            }
        return ans;
    }
}
