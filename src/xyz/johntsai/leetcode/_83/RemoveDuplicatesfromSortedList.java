package xyz.johntsai.leetcode._83;

import xyz.johntsai.leetcode.ListNode;

/**
 * Created by JohnTsai on 16/7/1.
 */
public class RemoveDuplicatesfromSortedList {
    /**
     * 1,1
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode cur = head,end=head;
        while(cur.next!=null){
            if(end.val==cur.next.val){
                cur.next = cur.next.next;
            }else{
                end=cur.next;
                cur = cur.next;
            }
        }
        return head;
    }
}
