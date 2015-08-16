package com.java.nowcoder;

import com.java.nowcoder.ReConstructBinaryTree.TreeNode;

public class TreeDepth {
	
    public static int treeDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        else{
            int leftDepth = treeDepth(root.left);
            int rightDepth = treeDepth(root.right);
            int childDepth = (leftDepth >= rightDepth ? leftDepth : rightDepth);
            childDepth++;
            return childDepth;
        }
    }
	
	public static void main(String[] args){
		ReConstructBinaryTree tree = new ReConstructBinaryTree();
		int[] pre = {1,2,4,5,7,3,6};
		int[] in = {4,2,7,5,1,3,6};
		TreeNode root = tree.reConstructBinaryTree(pre, in);
		System.out.println(treeDepth(root));
	}
}
