package leetcode101;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public boolean isSymmetric(TreeNode root){
        if(root==null || root.left==null&&root.right==null)
            return true;
        else {
            Queue<TreeNode> que = new LinkedList<>();
            que.add(root.left);
            que.add(root.right);
            while(!que.isEmpty()){
                TreeNode left = que.poll();
                TreeNode right = que.poll();
                if(left == null && right == null)
                    continue;
                if((left==null && right !=null) ||(left!=null && right==null))
                    return false;
                if(left.val != right.val)
                    return false;
                que.add(left.left);
                que.add(right.right);
                que.add(left.right);
                que.add(right.left);
            }
        }
        return true;
    }
}
