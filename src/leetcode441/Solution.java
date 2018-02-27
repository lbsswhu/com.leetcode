package leetcode441;

/**
 * @author lbsswhu
 * @create 2018 02 27 10:25
 * @Description
 **/
public class Solution {
    public int arrangeCoins(int n) {
        return (int)((Math.sqrt(8.0*n+1)-1)/2);
    }
}
