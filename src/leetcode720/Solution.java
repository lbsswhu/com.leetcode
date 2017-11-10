package leetcode720;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lbsswhu
 * @create 2017 11 08 21:33
 * @Description
 * Given a list of strings words representing an English Dictionary, find the longest word in words that can be built one character at a time by other words in words.
 * If there is more than one possible answer, return the longest word with the smallest lexicographical order.
If there is no answer, return the empty string.
Example 1:
Input:
words = ["w","wo","wor","worl", "world"]
Output: "world"
Explanation:
The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".

Example 2:
Input:
words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
Output: "apple"
Explanation:
Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".
 **/
public class Solution {
    public String longestWord(String[] words) {
        String result ="";
        Set<String> resultset = new HashSet<>();
        Arrays.sort(words);
        for(int i=0;i<words.length;i++){
            if(words[i].length()==1 ||resultset.contains(words[i].substring(0,words[i].length()-1))){
                resultset.add(words[i]);
                if(words[i].length()>result.length())
                    result = words[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        String[] r = {"a", "banana", "app", "appl", "ap", "appla", "apple"};
        System.out.println(test.longestWord(r));
    }
}
