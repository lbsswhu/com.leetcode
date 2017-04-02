package leetcode242;

/**
 * Created by Lb on 17-4-1.
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.
 */

public class Solution {
    public boolean isAnagram(String s, String t){
        int[] res = new int[123];
        for (int i = 0; i < s.length(); i++) {
            res[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            res[t.charAt(i)]--;
        }
        for (int i = 0; i < 123; i++) {
            if(res[i]!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
