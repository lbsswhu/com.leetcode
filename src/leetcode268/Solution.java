package leetcode268;

/**
 * Created by Lb on 17-4-3.
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int sums = nums.length*(nums.length+1)/2;
        for (int i = 0; i < nums.length; i++) {
            sums -=  nums[i];
        }
        return sums;
    }
}
/*
XOR
public int missingNumber(int[] nums) { //xor
    int res = nums.length;
    for(int i=0; i<nums.length; i++){
        res ^= i;
        res ^= nums[i];
    }
    return res;
}

public int missingNumber(int[] nums) { //binary search
    Arrays.sort(nums);
    int left = 0, right = nums.length, mid= (left + right)/2;
    while(left<right){
        mid = (left + right)/2;
        if(nums[mid]>mid) right = mid;
        else left = mid+1;
    }
    return left;
}
 */
