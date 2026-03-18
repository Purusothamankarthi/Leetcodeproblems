package leetcode;

import java.util.Arrays;
import java.util.List;

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
//		System.out.print(closest.findthreeSumClosest(num3, target));
		int num4[]= {1,3,5};
		int num5[]= {2,4,6};
		 ListNode list1 = new ListNode(num4[0]);
	        ListNode temp1 = list1;

	        for (int i = 1; i < num4.length; i++) {
	            temp1.next = new ListNode(num4[i]);
	            temp1 = temp1.next;
	        }

	        // list2
	        ListNode list2 = new ListNode(num5[0]);
	        ListNode temp2 = list2;

	        for (int i = 1; i < num5.length; i++) {
	            temp2.next = new ListNode(num5[i]);
	            temp2 = temp2.next;
	        }
//		mergeTwoLists ms=new mergeTwoLists();
//		ListNode head =ms.mergeTwoLists1(list1,list2);
//		print(head);    
//	}
//    static void print(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
	        String s="({)}";
	        validparenthess parenthess=new validparenthess();
//	        System.out.print(parenthess.isValid(s));
	        String word="leetcode";
	        List<String> wordDict = Arrays.asList("leet", "code");
	        wordbreak answer=new wordbreak();
	        System.out.print(answer.wordBreak1(word, wordDict));
    }
}
