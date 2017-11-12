package leetcode459;
/**
 * @author lbsswhu
 * @create 2017 11 10 15:50
 * @Description
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
 * You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:
Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.
Example 2:
Input: "aba"

Output: False
Example 3:
Input: "abcabcabcabc"

Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 **/
public class Solution {
    //数学推导
//    public boolean repeatedSubstringPattern(String s) {
//        String str = s + s;
//        return str.substring(1, str.length() - 1).contains(s);
//    }

    //kmp算法
    public boolean repeatedSubstringPattern(String str) {
        //This is the kmp issue
        int i=0,j=1;
        char[] s = str.toCharArray();
        int[] next = new int[s.length];
        next[0]=0;
        while(i<s.length && j<s.length){
            if(s[i]==s[j]){
                next[j]=i+1;
                i++;
                j++;
            }else{
                if(i==0){
                    next[j]=0;
                    j++;
                }else{
                    i= next[i-1];
                }
            }
        }
        if(next[s.length-1]>0 && s.length%(s.length-next[s.length-1])==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        if(test.repeatedSubstringPattern("ababa")==true)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

