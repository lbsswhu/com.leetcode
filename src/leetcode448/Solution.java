package leetcode448;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> temp = new ArrayList<Integer>();
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
        	temp.add(i,0);
        }
        for(int j=0;j<nums.length;j++){
        	int k = nums[j];
        	temp.set(k-1, 1);
        }
        for(int i=0;i<nums.length;i++){
        	if(temp.get(i) == 0)
        		res.add(i+1);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
