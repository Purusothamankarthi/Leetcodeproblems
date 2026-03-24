package leetcode;

import java.util.Arrays;

public class coinchange {
	public static void main(String[] args)
	{
		int arr[]= {1,5,2};
		int amount=11;
		int ans[]=new int[amount+1];
		Arrays.fill(ans, amount+1);
		ans[0]=0;
		for(int k:arr)
		{
			for(int i=k;i<=amount;i++)
			{
				ans[i]=Math.min(ans[i], ans[i-k]+1);
			}
		}
		if(ans[amount]==amount+1)
		{
			System.out.print(-1);
		}
		else System.out.print(ans[amount]);
	}
}
