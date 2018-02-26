package leetcode172;

/**
 * @author lbsswhu
 * @create 2018 02 26 10:30
 * @Description
 *
 * Given an integer n, return the number of trailing zeroes in n!.
Note: Your solution should be in logarithmic time complexity.
 **/
public class Solution {
    public int trailingZeroes(int n){
        int intg5 = 0;

            while(n>= 5){
                intg5+=n/5;
                n = n/5;
            }

        return intg5;
    }
}
