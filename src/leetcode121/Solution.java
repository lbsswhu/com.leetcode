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
