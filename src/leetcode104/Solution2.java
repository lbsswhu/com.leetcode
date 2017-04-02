package leetcode104;

import java.util.LinkedList;
import java.util.Queue;


public class Solution2 {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	 }
	public class Solution {
	    public int maxDepth(TreeNode root) {
	         int res = 0;
	        Queue<TreeNode> queue = new LinkedList<>();
	        if(root==null)
	        	return 0;
	        queue.offer(root);
	        while(queue.size()>0){
	        	res ++;
	        	for(int i=0;i<queue.size();i++){
	        		TreeNode q = queue.element();
	        		if(q.left!=null)
	        			queue.offer(q.left);
	        		if(q.right!=null)
	        			queue.offer(q.right);
	        	}
	        	queue.poll();
	        }
	        return res;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
