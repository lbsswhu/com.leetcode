package leetcode167;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int index1 = 0,index2 = numbers.length-1;
        while(index1<index2){
        	int temp = numbers[index1]+numbers[index2];
        	if(target == temp){
        		res[0] = index1+1;
        		res[1] = index2+1;
        		break;
        	}
        	if(target > temp)
        		index1++;
        	if(target < temp)
        		index2--;
        }
        return res;
    }
}
