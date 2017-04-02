package leetcode217;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Lb on 17-4-2.
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if
 * any value appearsat least twice in the array, and it should return false if every element is distinct.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num:nums
             ) {
            if(set.contains(num))
                return false;
            else
                set.add(num);
        }
        return true;
    }
}
