package leetcode234;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author lbsswhu
 * @create 2018 03 02 9:49
 * @Description
 **/
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Solution {
    public boolean isPalindrome(ListNode head) {
        Queue<ListNode> que = new LinkedList<>();
        Stack<ListNode> sta = new Stack<>();
        while (head!=null){
            que.offer(head);
            sta.push(head);
            head = head.next;
        }
        while (!que.isEmpty()&&!sta.empty()){
            if(que.poll().val == sta.pop().val)
                continue;
            else
                return false;
        }
        return true;
    }
}
