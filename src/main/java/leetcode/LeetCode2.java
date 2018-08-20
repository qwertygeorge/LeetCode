package leetcode;

import bean.ListNode;

public class LeetCode2 {

    public static void main(String[] args){
        ListNode a = new ListNode(2);
        ListNode c = new ListNode(5);
        ListNode b = a;
        b.next = new ListNode(4);
        b = b.next;
        b.next = new ListNode(3);
        b = b.next;
        b = c;
        b.next = new ListNode(6);
        b = b.next;
        b.next = new ListNode(4);
        b = b.next;
        ListNode result = addTwoNumbers(a,c);
        do {
            System.out.print(result.val+" ");
            result = result.next;
        }while(result!=null);
    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode head= null;
        ListNode nowNode = head;
        while(l1 != null || l2 != null || flag == 1){
            int l1val;
            int l2val;
            if(l1 == null){
                l1val = 0;
            }else{
                l1val = l1.val;
                l1=l1.next;
            }
            if(l2 == null){
                l2val = 0;
            }else{
                l2val = l2.val;
                l2=l2.next;
            }
            int sum = l1val +l2val+flag;

            flag = sum/10;
            if(nowNode == null){
                head = new ListNode(sum%10);
                nowNode = head;
            }else{
                nowNode.next = new ListNode(sum%10);
                nowNode = nowNode.next;
            }
        }
        return head;
    }
}
