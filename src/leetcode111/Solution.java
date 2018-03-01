package leetcode111;

/**
 * @author lbsswhu
 * @create 2018 03 01 21:13
 * @Description
 **/
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int leftlength = minDepth(root.left);
        int rightlength = minDepth(root.right);
        return (leftlength==0||rightlength==0)?leftlength+rightlength+1:Math.min(leftlength,rightlength)+1;
    }

}
