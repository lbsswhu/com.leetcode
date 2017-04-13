package leetcode543;

/**
 * Created by Lb on 17-4-13.
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    int res =0;
    public int Max(TreeNode root){
        if (root == null)
            return 0;
        else {
            int left = Max(root.left);
            int right = Max(root.right);
            res = Math.max(res, left + right);
            return Math.max(left,right)+1;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Max(root);
        return res;
    }
}
