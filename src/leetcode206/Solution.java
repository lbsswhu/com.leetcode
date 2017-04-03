package leetcode206;

import java.util.Stack;

/**
 * Created by Lb on 17-4-3.
 * Reverse Linked List
 * Reverse a singly linked list
 */


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode header = null;
        ListNode tail = null;
        while(head!=null){
            stack.push(head);
            head = head.next;
        }
        if(stack.isEmpty()) return null;
        header = tail = stack.peek();
        while(!stack.isEmpty()){
            stack.pop();
            if(!stack.isEmpty()){
                tail.next = stack.peek();
                tail =tail.next;
            }
            else
                tail.next = null;
        }
        return header;
    }
}
/*
递归java
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode nextNode=head.next;
        ListNode newHead=reverseList(nextNode);
        nextNode.next=head;
        head.next=null;
        return newHead;
    }
}
public ListNode reverseList(ListNode head) {
    /* iterative solution */
/*ListNode newHead = null;
    while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
            }
            return newHead;
            }
  */


