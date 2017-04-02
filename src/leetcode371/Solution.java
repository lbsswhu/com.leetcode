package leetcode371;

import java.util.Scanner;

public class Solution {
	
	public static int getSum(int a, int b) {
		if(b==0) return a;
		if(a==0) return b;
		while(b!=0){
			int carry = a&b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
    }
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入第一个值");
		int a = in.nextInt();
		System.out.println("请输入第二个值");
		int b = in.nextInt();
		System.out.println(getSum(a,b));
	}
}
