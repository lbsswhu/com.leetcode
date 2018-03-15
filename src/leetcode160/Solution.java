package leetcode160;

import java.util.HashSet;

/**
 * @author lbsswhu
 * @create 2018 03 15 9:13
 * @Description
 **/
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> setListNode = new HashSet<>();
        while(headA!=null || headB != null){
            if(headA!=null){
                if(setListNode.contains(headA))
                    return headA;
                else
                    setListNode.add(headA);
                headA = headA.next;
            }
            if(headB!=null){
                if(setListNode.contains(headB))
                    return headB;
                else
                    setListNode.add(headB);
                headB = headB.next;
            }
        }
        return null;
    }
}
