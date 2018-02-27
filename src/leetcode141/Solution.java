package leetcode141;

/**
 * @author lbsswhu
 * @create 2018 02 27 11:08
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
    public boolean hasCycle(ListNode head) {
        ListNode firt = head;
        if(head==null || head.next==null)
            return false;
        head = head.next;
        while (firt!=head){
            if(head == null || head.next==null)
                return false;
            else {
                firt = firt.next;
                head = head.next.next;
            }
        }
        return true;
    }
}
