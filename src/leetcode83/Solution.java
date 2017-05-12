package leetcode83;
/**
 * Created by Lb on 17-5-12.
 */

/**
 * Definition for singly-linked list. */
 class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp!=null&&temp.next!=null){
            if(temp.val == temp.next.val)
                if(temp.next.next == null)
                    temp.next = null;
                else
                    temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }
}
//public ListNode deleteDuplicates(ListNode head) {
//    if(head == null || head.next == null)return head;
//    head.next = deleteDuplicates(head.next);
//    return head.val == head.next.val ? head.next : head;
//}
