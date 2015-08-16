package com.java.nowcoder;

import java.util.ArrayList;
import java.util.Stack;

import com.java.nowcoder.ReConstructBinaryTree.TreeNode;

//FindPath输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
//路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径
public class FindPath {
	public static void main(String[] args){
		
	}
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		Stack<Integer> path = new Stack<Integer>();
		if(root == null){
			return null;
		}
		int sum = 0;
		TreeNode node = root;
		Stack<TreeNode> s = new Stack<TreeNode>();
		while(node.left != null){
			s.push(node);
			path.push(node.val);
			sum += node.val;
		}
		
		while(!s.isEmpty()){
			if(sum > target){
				s.pop();
				sum -= path.pop();
				node = s.peek();
				if(node.right != null){
					
				}
			}
			if(sum < target){
				node = 
			}
		}
    }
}
