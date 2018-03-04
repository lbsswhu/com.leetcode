package leetcode219;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lbsswhu
 * @create 2018 03 04 11:10
 * @Description
 **/
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])!=i &&Math.abs(map.get(nums[i])-i) <=k)
                    return true;
                else
                    map.put(nums[i],i);
            }else
                map.put(nums[i],i);
        }
        return false;
    }
}
