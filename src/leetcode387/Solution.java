package leetcode387;
public class Solution {
	public int firstUniqChar(String s){
		int[] temp = new int[128];
		for(int i=0;i<s.length();i++){
			temp[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++){
			if(temp[s.charAt(i)]==1)
				return i;
		}
		return -1;
	}
}
