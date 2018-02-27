package leetcode26;

/**
 * @author lbsswhu
 * @create 2018 02 27 10:37
 * @Description
 **/
public class Solution {
    public int removeDuplicates(int[] nums) {
        int wirte = 0;
        int read;
        for(read = 0;read<nums.length;read++){
            if(read == nums.length-1 || nums[read+1] != nums[read]){
                nums[wirte++] = nums[read];
            }
        }
        return wirte;
    }
}
