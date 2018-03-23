package leetcode712;

/**
 * @author lbsswhu
 * @create 2018 03 23 15:35
 * @Description
 **/
//DP[i][j]  the result for the i chars of s1 ,j chars of s2
   /*
    Intuition and Algorithm

            Let dp[i][j] be the answer to the problem for the strings s1[i:], s2[j:].

            When one of the input strings is empty, the answer is the ASCII-sum of the other string. We can calculate this cumulatively using code like dp[i][s2.length()] = dp[i-1][s2.length()] + s1.codePointAt(i).

            When s1[i] == s2[j], we have dp[i][j] = dp[i-1][j-1] as we can ignore these two characters.

            When s1[i] != s2[j], we will have to delete at least one of them. We'll have dp[i][j] as the minimum of the answers after both deletion options.

            The solutions presented will use bottom-up dynamic programming.
            */
public class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];

        for(int i = 1;i<=s1.length();i++)
            dp[i][0] = dp[i-1][0]+s1.charAt(i-1);
        for(int i = 1;i<=s2.length();i++)
            dp[0][i] = dp[0][i-1]+s2.charAt(i-1);

        for(int i =1;i<=s1.length();i++){
            for(int j =1;j<=s2.length();j++){
                int cost  = s1.charAt(i-1) == s2.charAt(j-1)?0:s1.charAt(i-1)+s2.charAt(j-1);
                dp[i][j] = Math.min(dp[i-1][j-1]+cost,Math.min(dp[i-1][j]+s1.charAt(i-1),dp[i][j-1]+s2.charAt(j-1)));
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
