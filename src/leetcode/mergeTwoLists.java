package leetcode;

public class mergeTwoLists {
	public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode num=new ListNode(0);
        ListNode temp=num;
        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
            temp.next = list1;
            list1 = list1.next;
            } 
            else {
            temp.next = list2;
            list2 = list2.next;
            }

        temp = temp.next;
        }
        if(list1 !=null)
        {
            temp.next=list1;
        }
        if(list2 !=null)
        {
            temp.next=list2;
        }
       return num.next ;
    }
}
