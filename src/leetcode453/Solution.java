package leetcode453;

public class Solution {
	public int minMoves(int[] nums){
		int res = 0,min = nums[0];
		for(int num:nums){
			if(min>num)
				min = num;
		}
		for(int num:nums){
			res = res+(num-min);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
