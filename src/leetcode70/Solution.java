package leetcode70;

/**
 * Created by Lb on 17-5-15.
 */
public class Solution {
    public static int climbStairs(int n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        int[] a = new int[n];
        int i;
        for ( i=2;i<n+1;i++){
            a[i] = a[i-1]+a[i-2];
        }
        return a[i-1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
}

//public class Solution {
//    public static int climbStairs(int n) {
//        if(n == 1)
//            return 1;
//        if(n == 2)
//            return 2;
//        return climbStairs(n-1)+climbStairs(n-2);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(climbStairs(44));
//    }
//}

