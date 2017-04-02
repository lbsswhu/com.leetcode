package leetcode409;

/**
 * Created by Lb on 17-4-1.
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that
 * can be built with those letters.
 This is case sensitive, for example "Aa" is not considered a palindrome here.

 Note:
 Assume the length of given string will not exceed 1,010.

 Example:

 Input:
 "abccccdd"

 Output:
 7

 Explanation:
 One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class Solution {
    public int longestPalindrome(String s) {
        int[] res = new int[123];
        int ress = 0,max = 0;
        for (int i = 0; i < s.length(); i++) {
            res[s.charAt(i)]++;
        }
        for (int i = 0; i < 123; i++) {
            ress = ress + (res[i]/2)*2;
        }
        return ress==s.length()?ress:(ress+1);
    }
}
