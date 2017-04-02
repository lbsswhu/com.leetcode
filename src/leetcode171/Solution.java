package leetcode171;

public class Solution {
    public int a(int length){
		int resu = 1;
		if(length == 0)  
		    return resu;
		while(length > 0){
			resu = resu * 26;
			length --;
		}
		return resu;
	}
	public int titleToNumber(String s){
		int res =0,length = s.length()-1;
		if(length <=0)
			return (s.charAt(0)-64);
		int i=0;
		while(length>=0){
			res = res + (s.charAt(i)-64)*a(length);
			i++;
			length--;
		}
		return res;
	}
}
