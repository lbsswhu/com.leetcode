package leetcode20;

import java.util.Stack;

/**
 * @author lbsswhu
 * @create 2018 02 28 16:09
 * @Description
 **/
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '(' ||c == '[' || c == '{')
                stack.push(c);
            else{
                if(!stack.empty()){
                    if(c==')' && stack.peek() == '(')
                        stack.pop();
                    else if(c==']' && stack.peek() == '[')
                        stack.pop();
                    else if(c=='}' && stack.peek() == '{')
                        stack.pop();
                    else
                        stack.push(c);
                }
                else
                    return false;
            }
        }
        if(stack.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Solution r = new Solution();
        System.out.println(r.isValid("()[]{}"));
    }
}
