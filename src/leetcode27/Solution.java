package leetcode27;

/**
 * Created by Lb on 17-10-27.
 */
public class Solution {
    public int removeElement(int[] nums,int val){
        int prelength = nums.length;
        int i=0;
        while(i<prelength){
            if(nums[i]==val){
                for(int j=i;j<nums.length-1;j++)
                    nums[j]=nums[j+1];
                prelength--;
                continue;
            }
            i++;
        }
        return prelength;
    }
}
