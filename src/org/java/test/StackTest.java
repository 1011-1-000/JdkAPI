package org.java.test;

import org.java.util.MyArrayStack;
import org.java.util.MyListStack;

public class StackTest {
    public static void main(String[] args) {
        MyListStack stack = new MyListStack(); // ������ջ���� 
        System.out.println("11111, absdder, 29999.3 ����Ԫ����ջ"); 
        stack.push(new Integer(11111)); //�� ջ�� ѹ������ 11111
        System.out.println(stack);  //��ʾջ�е�����Ԫ��

        stack.push("absdder"); //�� ջ�� ѹ��
        System.out.println(stack);  //��ʾջ�е�����Ԫ��

        stack.push(new Double(29999.3)); //�� ջ�� ѹ��
        System.out.println(stack);  //��ʾջ�е�����Ԫ��

        String s = new String("absdder");

        System.out.println("11111, absdder, 29999.3 ����Ԫ�س�ջ"); //���� ջ��Ԫ�� 
        System.out.println("Ԫ��"+stack.pop()+"��ջ");
        System.out.println(stack);  //��ʾջ�е�����Ԫ��
        System.out.println("Ԫ��"+stack.pop()+"��ջ");
        System.out.println(stack);  //��ʾջ�е�����Ԫ��
        System.out.println("Ԫ��"+stack.pop()+"��ջ");
        System.out.println(stack);  //��ʾջ�е�����Ԫ��
    }
}
