package leetcode226;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	 }
public class Solution {
	 public TreeNode invertTree(TreeNode root) {
	    	if(root==null) return root;
	        Queue<TreeNode> queue = new LinkedList<>();
	    	queue.offer(root);
	        while(!queue.isEmpty()){
	                TreeNode q = queue.poll();
	                TreeNode temp = q.left;
	            	q.left = q.right;
	            	q.right = temp;
	            	if(q.left!=null){
	            		queue.offer(q.left);
	            	}
	            	if(q.right!=null){
	            		queue.offer(q.right);
	            	}
	        	}
	        	return root;   
	    	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
