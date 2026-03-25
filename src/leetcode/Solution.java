package leetcode;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Solution {
    
    public static void main(String[] args)
	{
    	
//		int nums[]= {3,6,9,1};
//		maximumGap m=new maximumGap();
////		System.out.print(m.maximumGap1(nums));
///
///
//		int nums1[]= {1,2};
//		int nums2[]= {3,4};
//		MedianSortedArrays median=new MedianSortedArrays();
////		System.out.print(median.findMedianSortedArrays(nums1, nums2));
///
///
//		int num3[]= {-1,2,1,-4};
//		int target=2;
//		threeSumClosest closest=new threeSumClosest();
////		System.out.print(closest.findthreeSumClosest(num3, target));
		
		
		
//		int num4[]= {1,3,5};
//		int num5[]= {2,4,6};
//		 ListNode list1 = new ListNode(num4[0]);
//	        ListNode temp1 = list1;
//	        for (int i = 1; i < num4.length; i++) {
//	            temp1.next = new ListNode(num4[i]);
//	            temp1 = temp1.next;
//	        }
//	        // list2
//	        ListNode list2 = new ListNode(num5[0]);
//	        ListNode temp2 = list2;
//
//	        for (int i = 1; i < num5.length; i++) {
//	            temp2.next = new ListNode(num5[i]);
//	            temp2 = temp2.next;
//	        }
//		mergeTwoLists ms=new mergeTwoLists();
//		ListNode head =ms.mergeTwoLists1(list1,list2);
//		print(head);    
//	}
//    static void print(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
//	        String s="({)}";
//	        validparenthess parenthess=new validparenthess();
//	        System.out.print(parenthess.isValid(s));
//	        String word="leetcode";
//	        List<String> wordDict = Arrays.asList("leet", "code");
//	        wordbreak answer=new wordbreak();
//	        System.out.print(answer.wordBreak1(word, wordDict));
//	       											 23. Merge k Sorted Lists
	      /*  int a[]= {1,4,5,6};
	        int b[]= {1,7};
	        int c[]= {3,4,5};
	        ListNode l1 = new ListNode(a[0]);
	        ListNode t1 = l1;

	        for (int i = 1; i < a.length; i++) {
	            t1.next = new ListNode(a[i]);
	            t1 = t1.next;
	        }
	        ListNode l2 = new ListNode(b[0]);
	        ListNode t2 = l2;

	        for (int i = 1; i < b.length; i++) {
	            t2.next = new ListNode(b[i]);
	            t2 = t2.next;
	        }
	        ListNode l3 = new ListNode(c[0]);
	        ListNode t3 = l1;

	        for (int i = 1; i < c.length; i++) {
	            t3.next = new ListNode(c[i]);
	            t3 = t3.next;
	        }
	        MergekSortedLists ms=new MergekSortedLists();
	        ListNode[] lists = {l1, l2, l3};
			ListNode head =ms.mergeKLists(lists);
			print(head);

			
    
    
    }
    static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }*/
	        
//        									26. Remove Duplicates from Sorted Array
	        
//	        int arr[]= {0,0,1,1,1,2,2,3,3,4};
//	        RemoveDuplicatesfromSortedArray ans= new RemoveDuplicatesfromSortedArray();
//	        
//	      int k=ans.removeDuplicates(arr);
//	        System.out.print(k);
	        
//	        								48. Rotate Image
//	        rotatematrix ans1 =new rotatematrix();
//	        int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
//	        ans1.rotate(arr1);    
//	        								74. Search a 2D Matrix
//	        searchmatrix ans=new searchmatrix();
//	        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//	        int target1= 3;
//	        System.out.print( ans.searchMatrix(arr, target1));
	        
//	        								35. Search Insert Position
//	        int arr2[]= {1,3,5,6};
//	        int target1=5;
//	        searchinsert ans=new searchinsert();
//	        System.out.print(ans.searchInsert(arr2, target1));
	        
//	        								29. Divide Two Integers
//	        int dividdividend=-2147483648;
//	        int divisor=-1;
//	        dividetwointeger ans2=new dividetwointeger();
//	        System.out.print(ans2.divide(dividdividend, divisor));
	        
//	        								27. Remove Element
	        
//	        int arr3[]= {3,2,2,3};
//	        int val=3;
//	        removeelement ans4=new removeelement();
//	        System.out.print(ans4.removeElement(arr3, val));
    	
    
//    								287. Find the Duplicate Number
//	        int arr[]= {1,3,4,2,2};
//	        findduplicate ans=new findduplicate();
//	        System.out.print(ans.findDuplicate(arr));
	        
//	        List<Integer> list = Arrays.asList(1,2,3,2,4,5,3,6);
//
//	        list.stream()
//	            .filter(n -> Collections.frequency(list, n) > 1)
//	            .distinct()
//	            .forEach(System.out::println);
//	        List<Integer> list = Arrays.asList(1,2,2,3,3,3);
//
//	        Map<Integer, Long> map = list.stream()
//	            .collect(Collectors.groupingBy(
//	                Function.identity(),
//	                Collectors.counting()
//	            ));
//
//	        System.out.println(map);
    	
    	
//    											14. Longest Common Prefix
    	String arr[]= {"flower","flow","flight"};
    	longcommonperfix ans=new longcommonperfix();
    	System.out.print(ans.longestCommonPrefix(arr));
	        
    }
}
