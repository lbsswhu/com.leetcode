package leetcode633;

/**
 * @author lbsswhu
 * @create 2018 03 05 19:20
 * @Description
 **/
public class Solution {
    public boolean judgeSquareSum(int c) {
        int a = (int)Math.sqrt(c);
        for(int i = 0;i<=a;i++){
            double b = Math.sqrt(c - a*a);
            if(b == (int)b)
                return true;
        }
        return false;
    }
}
