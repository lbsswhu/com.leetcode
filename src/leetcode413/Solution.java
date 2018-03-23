package leetcode413;

/**
 * @author lbsswhu
 * @create 2018 03 22 20:26
 * @Description
 **/
public class Solution {
    int res;
    public int numberOfArithmeticSlices(int[] A) {
//        for(int i =0;i<A.length-1;i++){
//            int temp = A[i+1]-A[i];
//            int pre = A[i+1];
//            for(int k =i+2;k<A.length;k++){
//                if(A[k] - pre == temp){
//                    res++;
//                    pre = A[k];
//                }else
//                    break;
//            }
//        }
        helper(A,A.length);
        return res;
    }
    public int helper(int[] A,int length){
        if(length<=2)
            return 0;
        int ap = 0;
        if(A[length-1] -A[length-2] == A[length-2]-A[length-3]) {
            ap = 1 + helper(A, length - 1);
            res = res + ap;
        }
        else
            helper(A,length-1);
        return ap;
    }

//    public int numberOfArithmeticSlices(int[] A) {
//        int[] dp = new int[A.length];
//        int sum = 0;
//        for (int i = 2; i < dp.length; i++) {
//            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
//                dp[i] = 1 + dp[i - 1];
//                sum += dp[i];
//            }
//        }
//        return sum;
//    }

    public static void main(String[] args) {
//        System.out.println(Solution.numberOfArithmeticSlices(new int[]{1,2,3,4,5,6}));
    }
}
