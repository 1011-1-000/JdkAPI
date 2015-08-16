package com.java.nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Print {
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        int direct = 1;
        if(pRoot == null){
            return null;
        }
        else{
        	queue.offer(pRoot);
        	while(!queue.isEmpty()){
        		
        	}
        }
    }

}
