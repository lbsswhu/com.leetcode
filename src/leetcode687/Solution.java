package leetcode687;

/**
 * @author lbsswhu
 * @create 2018 03 02 14:25
 * @Description
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    int preLength = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null)
            return preLength;
        helper(root,root.val);
        return preLength;
    }
    public int helper(TreeNode root,int preV){

        if(root == null)
            return 0;
        int leftlength = helper(root.left,root.val);
        int rightLength = helper(root.right,root.val);
        if(root.val == preV)
            return Math.max(leftlength,rightLength)+1;
        preLength = Math.max(preLength,leftlength+rightLength);

        return 0;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(2);
//        root.left.right = new TreeNode(2);
//        root.right.left = new TreeNode(2);
//        root.right.right = new TreeNode(2);
//        root.left.left.left = new TreeNode(2);
        System.out.println(test.longestUnivaluePath(root));
    }
}
