package leetcode303;

/**
 * @author lbsswhu
 * @create 2018 03 04 14:05
 * @Description
 **/
public class NumArray {
    int[] data;
    public NumArray(int[] nums){
        data = new int[nums.length+1];
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = sum+nums[i];
            data[i+1] = sum;
        }
    }
    public int sumRange(int i, int j) {
        return data[j+1]-data[i];
    }
}
