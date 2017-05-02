package leetcode108;

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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        else
            return mid(nums,0,nums.length-1);
    }
    public TreeNode mid(int[] num,int low,int high){
        if(low>high)
            return null;
        int mid = (low+high)/2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = mid( num, low, (mid-1));
        node.right = mid(num,mid+1,high);
        return node;
    }
}
