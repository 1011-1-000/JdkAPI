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
		ArrayList<Integer> path = new ArrayList<Integer>();
		if(root == null){
			return null;
		}
		int sum = 0;
		TreeNode node = root;
		Stack<TreeNode> s = new Stack<TreeNode>();
		while(node.left != null){
			
		}
    }
}
