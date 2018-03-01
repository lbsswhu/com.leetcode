package leetcode22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lbsswhu
 * @create 2018 03 01 14:46
 * @Description
 **/
/*
回溯法
 */
public class Solution {
    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList();
        Backtracking(res,"",n,n);
        return res;
    }
    public void Backtracking(List<String> result,String str,int left,int right){
        if(left == 0 && right == 0){
            result.add(str);
            return;
        }
        if(left>0)
            Backtracking(result,str+"(",left-1,right);
        if(left<right && right>0)
            Backtracking(result,str+")",left,right-1);
    }
}
