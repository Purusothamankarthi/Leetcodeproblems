package leetcode;
import java.util.*;
public class findduplicate {
	class Solution {
	    public int findDuplicate(int[] nums) {
	        //  List<Integer> list = Arrays.asList(nums);

	        Set<Integer> set = new HashSet<>();

	         return Arrays.stream(nums)   // correct for int[]
	                     .filter(n -> !set.add(n))
	                     .findFirst()   // get first duplicate
	                     .getAsInt();  
	    }
	}
}
