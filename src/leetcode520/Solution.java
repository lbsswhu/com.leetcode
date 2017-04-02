package leetcode520;

public class Solution {
	public boolean detectCapitalUse(String word) {
    boolean res = false; 
    if(Character.isUpperCase(word.charAt(1))==true)
    	
    for(int i=1;i<word.length();i++){
    	if(Character.isUpperCase(word.charAt(i))==true&&Character.isUpperCase(word.charAt(i-1))==false){
    		res = false;
    		break;
    	}
    	if(Character.isLowerCase(word.charAt(i))==true&&Character.isUpperCase(word.charAt(i-1))==true&&i>1){
    		res = false;
    		break;
    	}
    		
    }
	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
