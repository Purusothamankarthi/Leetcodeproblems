package leetcode;
import java.util.*;
public class MergekSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null ) {return null;}
        
        ListNode head=new ListNode(0);
        ListNode temp=head;
        List<Integer> ans=new ArrayList<>();
        for(ListNode list:lists)
        {
            while(list!=null)
            {
                ans.add(list.val);
                list=list.next;
            }
        }
        Collections.sort(ans);
        for(int a:ans)
        {
            temp.next=new ListNode(a);
            temp=temp.next;
        }
        
        return head.next;
    }
}
