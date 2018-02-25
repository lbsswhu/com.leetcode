package leetcode367;

/**
 * @author lbsswhu
 * @create 2017 11 08 20:28
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
Note: Do not use any built-in library function such as sqrt.
 **/
public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0||num ==1) return true;
        int x = num >> 1;
        while(x*x >num){
            x = (x +(num/x)) >> 1;
        }
        return  x*x == num;
    }
}

/*
上面是牛顿法
注意到 n^2 = (2n-1 +1)n/2，故每个平方数可以分解成从1开始的连续几个奇数的和。
 */