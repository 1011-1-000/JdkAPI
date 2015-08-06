package com.java.nowcoder;
//输入两颗二叉树A，B，判断B是不是A的子结构
public class HasSubtree {
	public static class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		
		public TreeNode(int val){
			this.val = val;
		}
	}
	
	public boolean solution(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null){
            return false;
        }else{
            return isSubtree(root1,root2) || solution(root1.left,root2) || solution(root1.right,root2);
        }
    }
    
    public boolean isSubtree(TreeNode root1,TreeNode root2) {
        
        if(root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        
        if(root1.val == root2.val){
            return isSubtree(root1.left,root2.left) && isSubtree(root1.right,root2.right);
        }
        else{
            return false;
        }
    }
}
