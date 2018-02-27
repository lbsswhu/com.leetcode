package leetcode112;

/**
 * @author lbsswhu
 * @create 2018 02 27 14:19
 * @Description
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        if(root.right==null && root.left==null && (sum -root.val)==0)
            return true;
        else
            return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
}
