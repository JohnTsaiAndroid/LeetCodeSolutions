package xyz.johntsai.leetcode._203;

/**
 * Created by JohnTsai on 16/6/24.
 */
public class RemoveElements {
    /**
     * before:1->2->6->3->4->5->6 val =6
     * after:1->2->3->4->5
     *
     * head:1
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head,int val) {
        if(head==null) return head;
        //哑节点
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy,cur = head;
        while (cur!=null){
            if(cur.val==val){
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;

    }

    public static void main(String[] args) {
    }
}
