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
������ţ�ٷ�
ע�⵽ n^2 = (2n-1 +1)n/2����ÿ��ƽ�������Էֽ�ɴ�1��ʼ���������������ĺ͡�
 */