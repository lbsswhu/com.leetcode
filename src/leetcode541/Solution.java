package leetcode541;

/**
 * Created by Lb on 17-4-3.
 * 541. Reverse String II
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string.
 * If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse
 * the first k characters and left the other as original.
 Example:
 Input: s = "abcdefg", k = 2
 Output: "bacdfeg"
 */

/*
   public String subString(int beginIndex, int endIndex)
   beginIndex为开始处的索引（包括该位置）。
   endIndex为结束索引（不包括该索引位置）。
 */
public class Solution {
    public static String reverseStr(String s, int k) {
        String res = "";
        String sub = "";
        int i=1;
        while((i*2*k)<=s.length()){
            sub = new StringBuilder(s.substring(i*2*k-2*k,i*2*k-k)).reverse().toString();
            res = res + sub + s.substring(i*2*k-k,i*2*k);
            i++;
        }
        if((i*2*k-s.length())>=k){
            sub = new StringBuilder(s.substring(i*2*k-2*k,s.length())).reverse().toString();
            res = res +sub;
        }
        if((i*2*k-s.length())<k && (i*2*k-s.length())>0){
            sub = new StringBuilder(s.substring(i*2*k-2*k,i*2*k-k)).reverse().toString();
            res = res + sub + s.substring(i*2*k-k,s.length());
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new StringBuilder("abcdefg".substring(0,2)).reverse().toString());
        System.out.println(reverseStr("abcdefg",2));
    }
}
