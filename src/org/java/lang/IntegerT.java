package org.java.lang;

public class IntegerT {
	public static void main(String[] args) {
		//�� String �ͱ�����Ϊ�������� Integer ��������Integer a = new Integer("10")
		Integer a = new Integer("10");
		Integer b = new Integer(11);
		
		//�ж��������Ĵ�С
		System.out.println(a.compareTo(b));
		
		float c = a.floatValue();
		System.out.println(c);
		
		String d = "10101110";
		//���ַ���ת��Ϊ��ֵ
        //parseInt(String str) �� parseInt(String str,int radix) �����෽�������������á�
		//��һ��������ʵ�ֽ��ַ������ղ��� radix ָ���Ľ���ת��Ϊ int
		int e = Integer.parseInt(d,2);
		System.out.println(e);
	}

}
