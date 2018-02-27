package leetcode113;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author lbsswhu
 * @create 2018 02 27 16:00
 * @Description
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public void allPath(TreeNode root,int sum,Stack<Integer> tem){
        tem.push(root.val);
        if(root.left==null && root.right==null && sum-root.val==0){
            result.add(new ArrayList<>(tem));
        }
        if(root.left!=null){
            allPath(root.left,sum-root.val,tem);
        }
        if(root.right!=null){
            allPath(root.right,sum-root.val,tem);
        }
        tem.pop();
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        Stack<Integer> temp = new Stack<>();
        if(root==null)
            return result;
        allPath(root,sum,temp);
        return  result;
    }

}
