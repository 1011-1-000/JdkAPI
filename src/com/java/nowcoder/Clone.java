package com.java.nowcoder;

//����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
//����ڵ��Ӧ��ϵ �����ϵͨ���ٴα���ʵ��
import java.util.HashMap;
import java.util.Map;

public class Clone {
	
	public class RandomListNode {
	    int label;
	    RandomListNode next = null;
	    RandomListNode random = null;

	    RandomListNode(int label) {
	        this.label = label;
	    }
	}
	
	public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        Map<RandomListNode,RandomListNode> relation = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode cHead = new RandomListNode(pHead.label);
        cHead.next = null;
        RandomListNode cTail = cHead;
        relation.put(pHead, cHead);
        RandomListNode p = pHead.next;
        while(p != null){
        	RandomListNode randomListNode = new RandomListNode(p.label);
        	randomListNode.next = cTail.next;
        	cTail.next = randomListNode;
        	cTail = randomListNode;
        	relation.put(p, randomListNode);
        	p = p.next;
        }
        
        p = pHead;
        cTail = cHead;
        while(p != null){
        	cTail.random = relation.get(p.random);
        	p = p.next;
        	cTail = cTail.next;
        }
        
        return cHead;
    }
}
