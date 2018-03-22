package leetcode647;

/**
 * @author lbsswhu
 * @create 2018 03 19 16:53
 * @Description
 **/
public class Solution {
    public int countSubstrings(String s) {
        int res = 0,left = 0,right = 0;
        for(int i = 0;i<2*s.length()-1;i++){
            left = i/2;
            right = left+i%2;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                res++;
                left--;
                right++;
            }
        }
        return res;
    }
}
