package leetcode;

import java.util.*;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

 class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }

        return dummy.next;
    }
}

 class Main {

    public static void main(String[] args) {

        String input1 = "[2,4,3]";
        String input2 = "[5,6,4]";

        ListNode l1 = buildList(input1);
        ListNode l2 = buildList(input2);

        Solution1 obj = new Solution1();
        ListNode result = obj.addTwoNumbers(l1, l2);

        print(result);
    }

    static ListNode buildList(String input) {
        input = input.replace("[", "").replace("]", "");
        String[] parts = input.split(",");

        ListNode head = null, temp = null;

        for (String p : parts) {
            int val = Integer.parseInt(p.trim());

            ListNode node = new ListNode(val);

            if (head == null) {
                head = temp = node;
            } else {
                temp.next = node;
                temp = node;
            }
        }

        return head;
    }

    static void print(ListNode head) {
        System.out.print("[");
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(",");
            head = head.next;
        }
        System.out.println("]");
    }
}
