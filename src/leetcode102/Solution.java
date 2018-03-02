package leetcode102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lbsswhu
 * @create 2018 03 01 21:42
 * @Description
 **/
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
//BFS
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        if(root == null)
            return res;
        q1.add(root);
        while (!q1.isEmpty() || !q2.isEmpty()){
            if(!q1.isEmpty() &&q2.isEmpty()){
                List<Integer> temp  = new ArrayList<>();
                while(!q1.isEmpty()){
                    TreeNode x = q1.poll();
                    temp.add(x.val);
                    if(x.left!=null)
                        q2.add(x.left);
                    if(x.right!=null)
                        q2.add(x.right);
                }
                res.add(temp);
            }
            if(q1.isEmpty() &&!q2.isEmpty()){
                List<Integer> temp  = new ArrayList<>();
                while(!q2.isEmpty()){
                    TreeNode x = q2.poll();
                    temp.add(x.val);
                    if(x.left!=null)
                        q1.add(x.left);
                    if(x.right!=null)
                        q1.add(x.right);
                }
                res.add(temp);
            }
        }
        return res;
    }
}

/*DFS
public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        levelHelper(res, root, 0);
        return res;
    }

    public void levelHelper(List<List<Integer>> res, TreeNode root, int height) {
        if (root == null) return;
        if (height >= res.size()) {
            res.add(new LinkedList<Integer>());
        }
        res.get(height).add(root.val);
        levelHelper(res, root.left, height+1);
        levelHelper(res, root.right, height+1);
    }
 */
