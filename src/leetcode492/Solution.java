package leetcode492;

public class Solution {
	public int[] constructRectangle(int area){
		int[] res = null;
		for(int i=1;i<=(int)Math.sqrt(area);i++){
			if((area%i)!=0)
				continue;
			res[0] = (area/i);
			res[1] = i;
			if(i>(area/i))
				break;
		}
		return res;
	}
}
