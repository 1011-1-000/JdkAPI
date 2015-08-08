package com.java.nowcoder;

//输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点）。
//保存节点对应关系 随机关系通过再次遍历实现
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
