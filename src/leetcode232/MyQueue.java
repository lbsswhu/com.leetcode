package leetcode232;

import java.util.Stack;

/**
 * @author lbsswhu
 * @create 2018 02 25 13:52
 * @Description
 **/
public class MyQueue {
    /** Initialize your data structure here. */
    Stack<Integer> s;
    Stack<Integer> t;
    public MyQueue() {
        s = new Stack<>();
        t = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s.empty())
            s.push(x);
        else{
            while(!s.empty())
                t.push(s.pop());
            t.push(x);
            while(!t.empty()){
                s.push(t.pop());
            }
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       return s.pop();
    }

    /** Get the front element. */
    public int peek() {
        return s.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.empty();
    }
}
