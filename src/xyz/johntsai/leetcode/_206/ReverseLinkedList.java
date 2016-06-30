package xyz.johntsai.leetcode._206;

import xyz.johntsai.leetcode.ListNode;

/**
 * Created by JohnTsai on 16/6/30.
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    /**
     * 1->2->3->4->5 head 1
     *
     * 5->4->3->2->1 head 5
     *
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
         if(head==null||head.next ==null)
             return head;
        ListNode pre = head,cur = head.next;
        while (cur!=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = null;
        return pre;
    }
}
