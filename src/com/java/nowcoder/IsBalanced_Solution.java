package com.java.nowcoder;

import com.java.nowcoder.ReConstructBinaryTree.TreeNode;

public class IsBalanced_Solution {
	
	public static boolean isBalanced_Solution(TreeNode root){
		if(root == null){
			return true;
		}
		if(isBalanced_Solution(root.left) && isBalanced_Solution(root.right)){
			int left = treeDepth(root.left);
			int right = treeDepth(root.right);
			if(Math.abs(left - right) >= 2){
				return false;
			}else{
				return true;
			}
		}
		else{
			return false;
		}
	}
	
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
		int[] pre = {1,2,4,5,7,3};
		int[] in = {4,2,7,5,1,3};
		TreeNode root = tree.reConstructBinaryTree(pre, in);
		System.out.println(isBalanced_Solution(root));
	}
}
