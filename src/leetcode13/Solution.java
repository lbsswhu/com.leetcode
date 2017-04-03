package leetcode13;

/**
 * Created by Lb on 17-4-3.
 * Given a roman numeral, convert it to an integer.
 Input is guaranteed to be within the range from 1 to 3999.
 */
public class Solution {
    public static int romanToInt(String s) {
        int res =0;
        int[] sum = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'I':sum[i] = 1; break;
                case 'V':sum[i] = 5; break;
                case 'X':sum[i] = 10; break;
                case 'L':sum[i] = 50; break;
                case 'C':sum[i] = 100; break;
                case 'D':sum[i] = 500; break;
                case 'M':sum[i] = 1000; break;
            }
        }
        for (int i = 0; i < s.length()-1; i++) {
            if(sum[i]<sum[i+1])
                res -= sum[i];
            else
                res += sum[i];
        }
        return res+sum[s.length()-1];
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MDCCC"));
    }
}
