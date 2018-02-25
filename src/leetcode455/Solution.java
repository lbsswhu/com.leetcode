package leetcode455;

import java.util.Arrays;

public class Solution {
	public static void lsort(int[] a){
		int temp = 0;
		int length=a.length;
		for(int i =0;i<length-1;i++){
			for(int j=0;j<length-i-1;j++){
				if(a[j]>a[j+1]){
					temp = a[j+1];
				    a[j+1] = a[j];
				    a[j] = temp;
				}		
			}
		}
	}
	public int findContentChildren(int[] g,int[] s){
		int res = 0;
		//?צד????
		Arrays.sort(g);
		Arrays.sort(s);
		//???????
		lsort(g);
		lsort(s);
		for(int i = 0;i<g.length;i++){
			for(int j = 0;j<s.length;j++){
				if(g[i]<=s[j]){
					s[j] = -1;
					res++;
					break;
				}	
			}
		}
		return res;
	}
	public static void main(String[] args){
		int[] a = {1,5,3,6};
		lsort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
