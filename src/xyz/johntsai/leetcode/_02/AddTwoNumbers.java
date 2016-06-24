package xyz.johntsai.leetcode._02;

/**
 * Created by JohnTsai on 16/6/24.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null||l2==null)
            return null;
        int length1 = getLength(l1);
        int length2 = getLength(l2);
        ListNode result = length1>=length2?l1:l2;
        ListNode longer = result;
        ListNode shorter = length1<length2?l1:l2;
        boolean needCarry = false;
        while(result!=null){
              if(shorter==null){
                  result.val = result.val+(needCarry?1:0);
                  needCarry = result.val>9;
                  result.val = result.val%10;
                  if(result.next ==null&&needCarry){
                      ListNode next = new ListNode(1);
                      result.next = next;
                      next.next = null;
                      break;
                  }
                  result = result.next;
                  continue;
              }
            result.val = result.val+shorter.val+(needCarry?1:0);
            needCarry = result.val>9;
            if(needCarry) {
                result.val = result.val % 10;
                if(result.next ==null){
                    ListNode next = new ListNode(1);
                    result.next = next;
                    next.next = null;
                    break;
                }
            }
            result = result.next;
            shorter = shorter.next;
        }
        return longer;
    }
    public int getLength(ListNode head){
        int length = 0;
        while(head!=null){
            length++;
            head = head.next;
        }
        return length;
    }

}
