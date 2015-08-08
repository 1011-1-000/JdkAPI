package com.java.nowcoder;

import java.util.ArrayList;

import com.java.nowcoder.ReConstructBinaryTree.TreeNode;


public class PrintFromTopToBottom {
	
//	public class TreeNode {
//	    int val = 0;
//	    TreeNode left = null;
//	    TreeNode right = null;
//	    public TreeNode(int val) {
//	        this.val = val;
//
//	    }
//	}
	
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        int i = 0;
        int size = 0; //标记队列中元素的个数
        TreeNode node = null;
        if(root != null){
            queue.add(root);
        	size++;
        }
        while(size > 0){
            node = queue.get(i++);
            result.add(node.val);
            size--;
            if(node.left != null){
                queue.add(node.left);
                size++;
            }
            if(node.right != null){
                queue.add(node.right);
                size++;
            }
        }
        return result;
    }
	
	public static void main(String[] args){
		ReConstructBinaryTree tree = new ReConstructBinaryTree();
		int[] pre = {10,6,4,8,14,12,16};
		int[] in = {4,6,8,10,12,14,16};
		TreeNode root = tree.reConstructBinaryTree(pre, in);
		System.out.println(PrintFromTopToBottom(root));
	}
	
}
