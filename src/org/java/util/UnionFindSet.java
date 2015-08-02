package org.java.util;

public class UnionFindSet {
	
	private int[] s;
	
	public UnionFindSet(int numElements){
		s = new int[numElements];
		
		for(int i = 0; i < s.length; i++){
			s[i] = -1;
		}
	}
	
//	��ͨ����
//	public void union(int root1, int root2){
//		s[root2] = s[root1];
//	}
	
//	���߶���
	public void union(int root1,int root2){
		if(s[root2] < s[root1]){
			s[root1] = root2;
		}
		else{
			if(s[root1] == s[root2]){
				s[root1]--;
			}
			s[root2] = root1;
		}
	}
	
	//·��ѹ��
	public int find(int x){
		if(s[x] < 0){
			return x;
		}
		else{
			return s[x] = find(s[x]);
		}
	}
	
	//��ͨ�Ĳ��鼯
//	public int find(int x){
//		if(s[x] < 0){
//			return x;
//		}
//		else{
//			return find(s[x]);
//		}
//	}
}
