package leetcode2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author lbsswhu
 * @create 2018 03 01 16:46
 * @Description
 **/
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode result = new ListNode(0);
       ListNode temp = result;
       int carry = 0;
       while(l1!=null || l2 !=null|| carry!=0){
           int sum = carry;
           ListNode curNode = new ListNode(0);
           sum = sum +(l1==null?0:l1.val)+(l2==null?0:l2.val);
           curNode.val = sum %10;
           carry = sum/10;
           temp.next = curNode;
           temp = temp.next;

           l1 = (l1==null)?l1:l1.next;
           l2 = (l2==null)?l2:l2.next;
       }
       return result.next;
    }

    public static void main(String[] args) {
        Solution re  = new Solution();

    }
}
