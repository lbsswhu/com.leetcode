package leetcode258;

public class Solution {
public int addDigits(int num) {
	int rem = 0,temp = 0;
	while(num>9){
		while(num!=0){
			rem = num%10;
			num = (num - rem)/10;
			temp = temp + rem;
		}
		num = temp;
		temp = 0;
	}
	return num;      
    }
}
