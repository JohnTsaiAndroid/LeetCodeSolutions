package xyz.johntsai.leetcode._237;

import xyz.johntsai.leetcode.ListNode;

/**
 * Created by JohnTsai on 16/6/24.
 */
public class DeleteNode {
    /**
     *
     *       0-->3-->0-->1
     *       0   1   2   3
     *
     *        remove 0                 remove 1
     * b:
     *   val 0   3   0  1
     *   next1   2   3  null
     *
     * a:
     *   val 3   0  1               0   0   1
     *   next2   3  null            2   3   null
     *
     *
     *
     * @param listNode
     */
    public void deleteNode(ListNode listNode){
         if(listNode==null) return;
         listNode.val = listNode.next.val;
         listNode.next = listNode.next.next;
    }
}
