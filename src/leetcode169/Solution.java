package leetcode169;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Lb on 17-4-1.
 *s
 * 169. Majority Element
 * Given an array of size n, find the majority element. The majority element is the element that
 * appears more than ? n/2 ? times.
 *You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class Solution {
    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        int k = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i-1]) {
                k++;
            }
            if(k>=nums.length/2)
                return nums[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println();

    }
}
