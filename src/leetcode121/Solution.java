package leetcode121;

/**
 * Created by Lb on 17-5-10.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int max,min;
        if(prices.length<=1)
            return 0;
        max = min = prices[0];
        int dis =0;
        for (int i = 1; i < prices.length; i++) {
            if((prices[i]-min)>dis){
                max = prices[i];
                dis = max - min;
            }
            else{
                if(prices[i]<min)
                min = prices[i];
            }
        }
        return dis;
    }
}
//卡登算法 求最大子串和 动态规划
//The logic to solve this problem is same as "max subarray problem" using Kadane's Algorithm. Since no body has mentioned this so far,
// I thought it's a good thing for everybody to know.
//
//        All the straight forward solution should work, but if the interviewer twists the question slightly by giving the difference array of prices,
// Ex: for {1, 7, 4, 11}, if he gives {0, 6, -3, 7}, you might end up being confused.
//
//        Here, the logic is to calculate the difference (maxCur += prices[i] - prices[i-1]) of the original array, and find a contiguous subarray
// giving maximum profit. If the difference falls below 0, reset it to zero.
//
//public int maxProfit(int[] prices) {
//        int maxCur = 0, maxSoFar = 0;
//        for(int i = 1; i < prices.length; i++) {
//        maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
//        maxSoFar = Math.max(maxCur, maxSoFar);
//        }
//        return maxSoFar;
//        }
//        *maxCur = current maximum value
//
//        *maxSoFar = maximum value found so far
