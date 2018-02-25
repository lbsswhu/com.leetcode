package leetcode643;

/**
 * @author lbsswhu
 * @create 2018 02 25 15:05
 * @Description
 **/
public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum  = 0;
        double max = 0;
        for(int i=0;i<k;i++){
            sum = nums[i]+sum;
        }
        max = sum;
        for(int i = k;i<nums.length;i++){
            sum = sum+nums[i]-nums[i-k];
            if(sum>max)
                max = sum;
        }
        return max/k;
    }
}
/*

public class Solution {
	public double findMaxAverage(int[] nums, int k) {
		int[] sum = new int[nums.length];
		sum[0] = nums[0];
		for (int i = 1; i < nums.length; i++)
		sum[i] = sum[i - 1] + nums[i];
		double res = sum[k - 1] * 1.0 / k;
		for (int i = k; i < nums.length; i++) {
			res = Math.max(res, (sum[i] - sum[i - k]) * 1.0 / k);
		}
		return res;
	}
}
 */

/*

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++)
            sum+=nums[i];
        double res=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
                res=Math.max(res,sum);
        }
        return res/k;
    }
}

 */
