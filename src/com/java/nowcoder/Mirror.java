package com.java.nowcoder;

import com.java.nowcoder.ReConstructBinaryTree.TreeNode;


public class Mirror {
	public void solution(TreeNode root) {
        if(root != null){
        	solution(root.left);
        	solution(root.right);
            mirrorSubTree(root);
        }
    }
    
    public TreeNode mirrorSubTree(TreeNode root){
        TreeNode tmp = null;
        if(root.left != null || root.right != null){
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
        return root;
    }
}
