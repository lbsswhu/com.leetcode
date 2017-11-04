package leetcode257;
import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class Solution {
    public List<String> binaryTreePaths(TreeNode root){
        List<String> result = new ArrayList<>();
        if(root == null)
            return result;
        if(root.left != null){
            List<String> leftpath = binaryTreePaths(root.left);
            for (String path:
                 leftpath) {
                result.add(""+root.val+"->"+path);
            }
        }
        if(root.right != null){
            List<String> rightpath = binaryTreePaths(root.right);
            for (String path:
                    rightpath) {
                result.add(""+root.val+"->"+path);
            }
        }

        if(root.left==null && root.right==null){
                result.add(String.valueOf(root.val));
        }
        return result;
    }
}
