package leetcode680;

/**
 * @author lbsswhu
 * @create 2018 03 05 16:14
 * @Description
 **/
public class Solution {
    public boolean validPalindrome(String s) {
        int l = -1, r = s.length();
        while (++l < --r)
            if (s.charAt(l) != s.charAt(r)) return isPalindromic(s, l, r+1) || isPalindromic(s, l-1, r);
        return true;
    }

    public boolean isPalindromic(String s, int l, int r) {
        while (++l < --r)
            if (s.charAt(l) != s.charAt(r)) return false;
        return true;
    }

    public static void main(String[] args) {
        Solution re = new Solution();
        System.out.println(re.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}
