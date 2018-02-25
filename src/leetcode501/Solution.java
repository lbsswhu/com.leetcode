package leetcode501;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author lbsswhu
 * @create 2018 02 25 14:06
 * @Description
 **/
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val = x;}
}
public class Solution {
    int count = 1;
    int max = 0;
    Integer prev = null;
    public int[] findMode(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null)
            return new int[0];
        find(root,result);
        return result.stream().mapToInt(i->i).toArray();
    }

    public void find(TreeNode root,ArrayList<Integer> res){
        if(root==null)
            return;
        find(root.left,res);
        if(prev != null){
            if(root.val == prev)
                count++;
            else
                count = 1;
        }
        if(count>max){
            max = count;
            res.clear();
            prev = root.val;
            res.add(root.val);
        }else if(count==max)
            res.add(root.val);
        prev = root.val;
        find(root.right,res);

    }
}
