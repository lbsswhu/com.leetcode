package leetcode66;

/**
 * Created by Lb on 17-11-8.
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

 You may assume the integer do not contain any leading zero, except the number 0 itself.

 The digits are stored such that the most significant digit is at the head of the list.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length+1];
        for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else
                digits[i]=0;
        }

        res[0]=1;//如果数组的每一位都有进位，像999这种的情况
        return  res;
    }
}
