package leetcode;
import java.util.*;
public class rotatematrix {
	public void rotate(int[][] arr1) {
		
		int n=arr1.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int temp=arr1[i][j];
				arr1[i][j]=arr1[j][i];
				arr1[j][i]=temp;
				
			}
		}
		for(int i=0;i<n;i++)
		{
			int l=0,r=n-1;
			while(l<r)
			{
				int temp = arr1[i][l];
				arr1[i][l]=arr1[i][r];
				arr1[i][r]=temp;
				l++;r--;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
	}

	
}
