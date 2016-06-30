package xyz.johntsai.leetcode._19;

import xyz.johntsai.leetcode.ListNode;

/**
 * Created by JohnTsai on 16/6/30.
 */
public class RemoveNthNodeFromEndofList {
    /**
     *   1 2 3  4 5
     *   0 1 2  3 4
     *   5 4 3 2 1
     * 0-1-2-3-4-5 remove 2th(4)
     * 1-2-3-5
     *
     * lenth:5
     *
     * 5-2=3
     * 3-1=2
     *
     *
     * 1,2 length 2 n:1
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int fromStart = length - n;
        ListNode cur = head,pre = dummyHead;
        while(cur!=null){
            if(fromStart==0){
                pre.next = cur.next;
                break;
            }
            pre = cur;
            cur = cur.next;
            fromStart--;
        }
        return dummyHead.next;
    }
}
