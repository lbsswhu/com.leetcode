package leetcode53;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lbsswhu
 * @create 2018 03 04 14:15
 * @Description
 **/
/*
DP
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE,sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(sum<0)
                sum = nums[i];
            else
                sum = sum+nums[i];
            if(sum>max)
                max  = sum;
        }
        return max;
    }
}
