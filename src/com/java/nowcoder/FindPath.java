package com.java.nowcoder;

import java.util.ArrayList;
import java.util.Stack;

import com.java.nowcoder.ReConstructBinaryTree.TreeNode;

//FindPath����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
//·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·��
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
