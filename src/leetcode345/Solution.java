package leetcode345;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lb on 17-11-8.
 *Write a function that takes a string as input and reverse only the vowels of a string.
 Example 1:
 Given s = "hello", return "holle".
 Example 2:
 Given s = "leetcode", return "leotcede".
 */
public class Solution {
    public String reverseVowels(String s) {
        String vowel = "aoeiuAOEIU";
        char[] res = s.toCharArray();
        int start = 0,end = res.length-1;
        while(start < end){
            while (start<end && !vowel.contains(res[start]+""))
                start++;
            while (start<end && !vowel.contains(res[end]+""))
                end--;
            char temp = res[start];
            res[start] = res[end];
            res[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(res);
    }
}
