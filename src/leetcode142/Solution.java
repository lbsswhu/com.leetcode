package leetcode142;

import java.util.HashSet;

/**
 * @author lbsswhu
 * @create 2018 02 27 11:35
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
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> dectect = new HashSet<>();
        while(head!=null && head.next!=null){
            if(dectect.contains(head))
                return head;
            else
                dectect.add(head);
            head = head.next;
        }
        return null;
    }
}
