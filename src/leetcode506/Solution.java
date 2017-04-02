package leetcode506;

import java.util.ArrayList;

public class Solution {
	public String[] findRelativeRanks(int[] nums){
		String[] res = new String[nums.length] ;
		int max = -1,length = 0;
		while(length<nums.length){
			int i,j=0;
			for(i = 0;i<nums.length;i++){
				if(max<nums[i]){
					max = nums[i];
					j=i;
				}	
			}
			max = -1;
			nums[j] = -1;
			if(length == 0)
				res[j] = "Gold Medal";
			else if(length == 1)
				res[j] = "Silver Medal";
			else if(length == 2)
				res[j] = "Bronze Medal";
			else{
				res[j] = String.valueOf(length+1);
			}
			length++;
		}
		
		return res;
	}
}
