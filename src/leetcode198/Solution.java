package leetcode198;

public class Solution {
    public int rob(int[] nums) {
        int preNo = 0;
        int preYes = 0;
        for (int n:
             nums) {
            int temp = preNo;
            preNo = Math.max(preNo,preYes);
            preYes = n + temp;
        }
        return Math.max(preNo,preYes);
    }
}
