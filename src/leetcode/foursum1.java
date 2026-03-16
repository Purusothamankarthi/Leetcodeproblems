package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class foursum1 {
	public List<List<Integer>> foursum2(int nums[], int target){
		List<List<Integer>> re =new ArrayList<>();
		int t=target;
		Arrays.sort(nums);
		for(int i=0;i<nums.length-3;i++)
		{
			if(i>0 && nums[i]==nums[i-1]) continue;
			for(int  j=i+1;j<nums.length-2;j++)
			{
				
				if(j>i+1 && nums[j]==nums[j-1]) continue;
				int l=j+1;
				int r=nums.length-1;
				while(l<r)
				{
					int sum=nums[i]+nums[j]+nums[l]+nums[r];
					if(sum==t)
					{
						re.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
						while(l<r && nums[l]==nums[l+1]) l++;
						while(l<r && nums[r]== nums[r-1]) r--;
						l++;
						r--;
					}
					else if(sum<target)
					{
						l++;
					}
					else
					{
						r--;
					}
				}
			}
			
		}
		return re;
		
	}
}
