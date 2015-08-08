package com.java.nowcoder;

import java.util.Stack;

import com.java.nowcoder.ReConstructBinaryTree.TreeNode;

public class Convert {
	
	public static TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        else{
            Stack<TreeNode> s = new Stack<TreeNode>();
            TreeNode p = pRootOfTree;
            while(p != null){
                s.push(p);
                p = p.left;
            }
            
            TreeNode head = s.pop();
            TreeNode tail = head;
            head.left = null;
            TreeNode currentNode = head;
            while(!s.isEmpty() || currentNode.right != null){
            	System.out.println(s+"|"+currentNode.val);
                if(currentNode.right != null){
                    p = currentNode.right;
                    while(p != null){
                        s.push(p);
                        p = p.left;
                    }
                }
                currentNode = s.pop();
                tail.right = currentNode;
                currentNode.left = tail;
                tail = currentNode;
            }
            tail.right = null;
            return head;
        }
    }
	
	public static void main(String[] args){
		ReConstructBinaryTree tree = new ReConstructBinaryTree();
		int[] pre = {10,6,4,8,14,12,16};
		int[] in = {4,6,8,10,12,14,16};
		TreeNode root = tree.reConstructBinaryTree(pre, in);
		print(Convert(root));
	}
	
	public static void print(TreeNode root){
		TreeNode p = root;
		while(p != null){
			System.out.print(p.val);
			p = p.right;
		}
	}
}
