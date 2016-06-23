package xyz.johntsai.leetcode._160;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by JohnTsai on 16/6/23.
 */
public class GetIntersectionNode {
    //Move the longer List (Max-Min) Nodes;
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode result = null;
        if(headA!=null&&headB!=null){
            int lengthA= getLength(headA);
            int lengthB = getLength(headB);
            if(lengthA>lengthB){
                while(lengthA!=lengthB){
                    lengthA--;
                    headA = headA.next;
                }
            }else{
                while (lengthB!=lengthA){
                    lengthB--;
                    headB = headB.next;
                }
            }
            while(headA!=null) {
                if (headA == headB) {
                    result = headA;
                    break;
                }
                headA = headA.next;
                headB = headB.next;
            }
        }

        return result;
    }

    //HashSet
    public ListNode getIntersectionNodeByHashSet(ListNode headA,ListNode headB){
        ListNode result = null;
        if(headA==null||headB==null)
            return result;
        HashSet<ListNode> hashSet = new HashSet<>();
        while(headA!=null){
            hashSet.add(headA);
            headA = headA.next;
        }
        while(headB!=null){
            if(hashSet.contains(headB)) {
                result = headB;
                break;
            }
            headB = headB.next;
        }
        return result;
    }

    public int getLength(ListNode head){
        int length = 0;
        while(head!=null){
            length++;
            head = head.next;
        }
        return length;
    }
    
    public static void main(String[] args) {

    }
}
