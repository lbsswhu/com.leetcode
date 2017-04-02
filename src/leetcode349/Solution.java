package leetcode349;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int[] intersection(int[] nums1,int[] nums2){
		Set<Integer> interset = new HashSet<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0,j = 0;
		while(i<nums1.length||j<nums2.length){
			if(nums1[i] == nums2[j]){
				interset.add(nums1[i]);
				i++;j++;
			}else if(nums1[i] > nums2[j]){
				j++;
			}else{
				i++;
			}
		}
		int[] res = new int[interset.size()];
		int k=0;
		for(int num:interset){
			res[k++] = num;
		}
		return res;
	}
}
