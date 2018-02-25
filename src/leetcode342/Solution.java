package leetcode342;
/**
 * Created by Lb on 17-11-8.
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 Example:
 Given num = 16, return true. Given num = 5, return false.
 Follow up: Could you solve it without loops/recursion?
 */
public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<0) return false;
        if((num & (num - 1))!=0) return false;//判断是否是2的幂，而4的幂的二进制特点是1加上偶数个0
        if((num & 0x55555555)!=0) return true;//判断1是否在奇数位上
        else
            return false;
    }
}
