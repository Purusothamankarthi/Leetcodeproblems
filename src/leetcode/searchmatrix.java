package leetcode;

public class searchmatrix {
	 public boolean searchMatrix(int[][] arr1, int target) {
	        boolean flag=false;
	    
	        for(int i=0;i<arr1.length;i++)
	        {
	            for(int j=0;j<arr1[i].length;j++)
	            {
	                if(arr1[i][j]==target)
	                {
	                    flag=true;
	                }
	            }
	        }
	        return flag;
	    }
}
