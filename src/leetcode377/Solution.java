package leetcode377;

/**
 * @author lbsswhu
 * @create 2018 03 04 19:36
 * @Description
 **/
/*
recursive solution
*/

//public class Solution {
//    public int combinationSum4(int[] nums, int target) {
//        int res = 0;
//        if(target ==0)
//            return 1;
//        for(int i=0;i<nums.length;i++)
//            if(target>=nums[i])
//                res = res+combinationSum4(nums,target-nums[i]);
//        return res;
//    }
//}
    /*

    DP
     */
public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] tmp = new int[target+1];
        tmp[0] = 1;
        if(target ==0)
            return 1;
        for(int i=1;i<=target;i++)
            for(int j = 0;j<nums.length;j++)
                if(i >= nums[j])
                    tmp[i] = tmp[i-nums[j]] + tmp[i];
        return tmp[target];
    }
}