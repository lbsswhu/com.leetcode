package leetcode231;

/**
 * Created by Lb on 17-5-12.
 */

public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n &(n-1)) == 0;
    }
}

//public class Solution {
//    public boolean isPowerOfTwo(int n) {
//        return (Math.log10(n)/Math.log10(2))%1 == 0;
//    }
//}
