package software;
/**
 * ΢����Ե�һ��
 * ���Ŷ����У�������ٵ����Ŷ��������
 * ��1�����ٶ��ٸ�
 * ��2��������Ե����Ŷ��ж�����
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
