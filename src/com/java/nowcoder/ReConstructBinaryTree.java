package com.java.nowcoder;

public class ReConstructBinaryTree {
	
	private static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
//	输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
//	假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
//	例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
//	则重建二叉树并输出它的后序遍历序列。
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		return reConstructBinaryTree(pre, 0, in, in.length - 1, in.length);
    }
	
	public static TreeNode reConstructBinaryTree(int[] pre,int start,int[] in,int end,int length){
		if (pre == null || pre.length == 0 || in == null  
                || in.length == 0 || length <= 0) {  
            return null;  
        }
		
		TreeNode t = new TreeNode(pre[start]);
		
		if(length == 1){
			return t;
		}
		
		int i = 0;
		while(i < length){
			if(t.val == in[end - i]){
				break;
			}
			i++;
		}
		
		t.left = reConstructBinaryTree(pre,start+1,in,end-i-1,length-1-i);
		t.right = reConstructBinaryTree(pre, start+length-i, in, end, i);
		
		return t;
	}
	
	public static void printTree(TreeNode t){
		if(t != null){
			printTree(t.left);
			printTree(t.right);
			System.out.println(t.val);
		}
	}
	
	public static void main(String[] args){
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		printTree(reConstructBinaryTree(pre,in));
	}
}
