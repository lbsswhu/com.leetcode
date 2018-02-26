package leetcode1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lbsswhu
 * @create 2018 02 25 16:05
 * @Description
 **/
public class Solution {
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> temp = new HashMap<>();
        for(int i= 0;i<nums.length;i++)
            temp.put(nums[i],i);
        for(int i=0;i<nums.length;i++){
            if(temp.containsKey((target-nums[i])) && temp.get(target-nums[i])!=i)
                return new int[]{i,temp.get((target-nums[i]))};
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
