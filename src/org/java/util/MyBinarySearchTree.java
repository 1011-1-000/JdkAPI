package org.java.util;

public class MyBinarySearchTree<AnyType extends Comparable<? super AnyType>> {
	private static class BinaryNode<AnyType>{
		
		AnyType element;
		BinaryNode<AnyType> left;
		BinaryNode<AnyType> right;
		
		BinaryNode(AnyType theElement){
			this(theElement,null,null);
		}
		
		BinaryNode(AnyType theElement,BinaryNode<AnyType> lt,BinaryNode<AnyType> rt){
			element = theElement;
			left = lt;
			right = rt;
		}
	}
	
	private BinaryNode<AnyType> root;

	public MyBinarySearchTree() {
		this.root = null;
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public boolean contains(AnyType x){
		return contains(x,root);
	}
	
	public AnyType findMin(){
		if(isEmpty()){
			throw new IndexOutOfBoundsException();
		}
		return findMin(root).element;
	}
	
	public AnyType findMax(){
		if(isEmpty()){
			throw new IndexOutOfBoundsException();
		}
		return findMax(root).element;
	}
	
	public void insert(AnyType x){
		root = insert(x,root);
	}
	
	public void remove(AnyType x){
		root = remove(x,root);
	}
	
	public void printTree(){
		//todo
		if(isEmpty()){
			System.out.println("Empty Tree");
		}
		else{
			printTree(root);
		}
	}
	
	private boolean contains(AnyType x,BinaryNode<AnyType> t){
		if(t == null){
			return false;
		}
		
		int compareResult = x.compareTo(t.element);
		
		if(compareResult < 0){
			return contains(x,t.left);
		}
		else if(compareResult > 0){
			return contains(x,t.right);
		}
		else{
			return true;
		}
	}
	
	private BinaryNode<AnyType> findMin(BinaryNode<AnyType> t){
		if(t == null){
			return null;
		}
		else if(t.left == null){
			return t;
		}
		
		return findMin(t.left);
		
	}
	
	//�÷ǵݹ�ķ�ʽ
	private BinaryNode<AnyType> findMax(BinaryNode<AnyType> t){
		if(t!=null){
			while(t.right!=null){
				t = t.right;
			}
		}
		return t;
	}
	
	private BinaryNode<AnyType> insert(AnyType x,BinaryNode<AnyType> t){
		if(t == null){
			return new BinaryNode<AnyType>(x,null,null);
		}
		
		int compareResult = x.compareTo(t.element);
		
		if(compareResult<0){
			t.left = insert(x,t.left);
		}
		else if(compareResult > 0){
			t.right = insert(x,t.right);
		}
		else{
			//do nothing
		}
		
		return t;
	}	
	
	private BinaryNode<AnyType> remove(AnyType x,BinaryNode<AnyType> t){
		if(t == null){
			return t;
		}
		
		int compareResult = x.compareTo(t.element);
		
		if(compareResult < 0){
			t.left = remove(x,t.left);
		}
		else if(compareResult > 0){
			t.right = remove(x,t.right);
		}
		else if(t.left != null && t.right != null){
			t.element = findMin(t.right).element;
			t.right = remove(t.element,t.right);
		}
		else{
			t = (t.left != null)? t.left:t.right;
		}
		return t;
	}
	
	private void printTree(BinaryNode<AnyType> t){
		if(t!=null){
			printTree(t.left);
			System.out.println(t.element);
			printTree(t.right);
		}
	}
}
