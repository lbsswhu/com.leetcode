package leetcode202;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Lb on 17-5-12.
 */
public class Solution {
    public boolean isHappy(int n) {
        int end = n, sum = n;
        Set<Integer> set = new HashSet<>();
        while(true){
            if(set.contains(n))
                return false;
            else
                set.add(n);
            if(sum == 1){
                return true;
            }
            n = sum; sum = 0;
            while(n!=0){
                int y = n % 10;
                 n = n / 10;
                sum = sum + y*y;
            }
        }
    }
}
//optimization for code
//public class Solution {
//    public boolean isHappy(int n) {
//        int end,sum;
//        Set<Integer> set = new HashSet<>();
//        while(set.add(n)){
//            sum = 0;
//            while(n!=0){
//                int y = n % 10;
//                n = n / 10;
//                sum = sum + y*y;
//            }
//            if(sum == 1)
//                return true;
//            else
//                n = sum;
//        }
//        return false;
//    }
//}
