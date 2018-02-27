package leetcode9;

/**
 * @author lbsswhu
 * @create 2018 02 27 10:51
 * @Description
 **/
public class Solution {
    public boolean isPalindrome(int x) {
        int temp = 0;
        if(x<0||(x%10==0&&x!=0))
            return false;
        while(x>temp){
            temp = temp*10+x%10;
            x = x/10;
        }
        return x == temp ||x == temp/10;
    }
}
