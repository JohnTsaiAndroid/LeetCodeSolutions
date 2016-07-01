package xyz.johntsai.leetcode._24;

import xyz.johntsai.leetcode.ListNode;

/**
 * Created by JohnTsai on 16/7/2.
 */
public class SwapNodesinPairs {
    /**
     * 1->2->3->4
     * 2->1->4->3
     *         val  next
     * cur:1    1    2
     * next:2   2    3
     *
     * cur:2    2    1
     * next;1   1    3
     *
     *
     * 思路:哑节点 http://www.jiuzhang.com/solutions/swap-nodes-in-pairs/K
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while(head.next!=null&&head.next.next!=null){
            ListNode l1 = head.next,l2 = head.next.next;
            head.next = l2;
            l1.next = l2.next;
            l2.next = l1;
            head = l1;
        }
        return dummy.next;
    }
}
