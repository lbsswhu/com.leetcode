package leetcode746;

/**
 * @author lbsswhu
 * @create 2018 03 04 16:23
 * @Description
 **/
/*
        int [] mc = new int[cost.length + 1];
        mc[0] = cost[0];
        mc[1] = cost[1];

        for(int i = 2; i <= cost.length; i++){
            int costV = (i==cost.length)?0:cost[i];
            mc[i] = Math.min(mc[i-1] + costV, mc[i-2] + costV);
        }
        return mc[cost.length];
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[]  spend = new int[cost.length+1];
        spend[0] = cost[0];
        spend[1] = cost[1];
        for(int i = 2;i<=cost.length;i++){
            if(i==cost.length)
                spend[i] = spend[i-2]>spend[i-1]?spend[i-1]:spend[i-2];
            else
                spend[i] = spend[i-2]>spend[i-1]?spend[i-1]+cost[i]:spend[i-2]+cost[i];
        }
        return spend[cost.length];
    }
}
