package leetcode;

public class longcommonperfix {
	  public String longestCommonPrefix(String[] strs) {
	        String perfix=strs[0];
	        for(int i=1;i<strs.length;i++)
	        {
	            while(strs[i].indexOf(perfix)!=0)
	            {
	                perfix=perfix.substring(0,perfix.length()-1);
	            }
	        }
	        return perfix;
	    }
}
