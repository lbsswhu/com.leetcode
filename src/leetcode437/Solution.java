package leetcode437;

import java.util.HashMap;

/**
 * Created by Lb on 17-5-17.
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    private int findSum(TreeNode root, int sum){
        int res = 0;
        if(root == null)
            return res;
        if(sum == root.val)
            res++;
        res += findSum(root.left,sum-root.val);
        res += findSum(root.right,sum-root.val);
        return res;
    }
    public int pathSum(TreeNode root, int sum) {
        if(root == null)
            return 0;
        else
            return findSum(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
}

//    public int pathSum(TreeNode root, int sum) {
//        HashMap<Integer, Integer> preSum = new HashMap();
//        preSum.put(0,1);
//        return helper(root, 0, sum, preSum);
//    }
//
//    public int helper(TreeNode root, int currSum, int target, HashMap<Integer, Integer> preSum) {
//        if (root == null) {
//            return 0;
//        }
//
//        currSum += root.val;
//        int res = preSum.getOrDefault(currSum - target, 0);
//        preSum.put(currSum, preSum.getOrDefault(currSum, 0) + 1);
//
//        res += helper(root.left, currSum, target, preSum) + helper(root.right, currSum, target, preSum);
//        preSum.put(currSum, preSum.get(currSum) - 1);
//        return res;
//    }
