package leetcode404;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){val = x;}
}
public class Solution {
	public int sumOfLeftLeaves(TreeNode root){
		int res = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode temp = queue.poll();
			if(temp==null) return 0;
			if(temp.left!= null){
			    if(temp.left.left==null&&temp.left.right==null)
				res = res + temp.left.val;
				queue.offer(temp.left);
			}
			if(temp.right!= null){
				queue.offer(temp.right);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
