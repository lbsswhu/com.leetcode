package software;
/**
 * 微软笔试第一题
 * 括号对序列，添加最少的括号对让其配对
 * （1）最少多少个
 * （2）最后的配对的括号对有多少种
 */
public class Solution {
	public static int minS(String s){
		int i=0,j=0,k=0;
		while(k<s.length()){
			if(s.charAt(k)==')'){
				if(i>0)
					i--;
				else
					j++;
			}
			if(s.charAt(k)=='(')
				i++;
			k++;
		}
		return i+j;
	}
	@SuppressWarnings("unused")
	public static int sumS(String s,int num){
		int res = 0;
		int total = s.length()+num;
		int i=0,j=0;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(()())";
		int minres = minS(s);
		System.out.println(minres);
	}

}
