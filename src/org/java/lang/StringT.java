package org.java.lang;

public class StringT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���Դ�Сд�Ƚ��ַ���
		String s = new String("Java");
		String m = "java";
		System.out.println("�����Դ�Сд��"+s.equals(m));
		System.out.println("���Դ�Сд��"+s.equalsIgnoreCase(m));
		//�ַ������ӳ���ֱ��������⣬������ʹ�ú���concat
		
		System.out.println(s.concat(m));
		//�ַ�������ȡ����6������
		
		/*
		 * �������������ʵ������3��String����"Hello "��"World!"��"Hello World!"��
		 * ��2�����ȷʵ������"Hello World"�ַ���������û��ָ���Ѹ��ַ��������ø���˭��
		 * ���û�иı�s���á���3�������ݲ����ԣ���û�иı�"Hello "��JVM������һ����
		 * �Ķ��󣬰�"Hello "��"World!"�����Ӹ�����s���ã�������ñ��ˣ�����ԭ����û�䡣
		 */
		
		String t ="Hello";
		t.concat("world");
		System.out.println(t);
		t = t.concat("world");
		System.out.println(t);
		
		//String����Ĵ������࣬����ʹ��StringBuffer��StringBuilder������
		//�򵥿�һ��StringBuffer�г��õ�һЩ����
		StringBuffer sb = new StringBuffer("I");
		sb.append("coding");
		sb.insert(1, " am ");
		String ts = sb.toString();
		System.out.println(ts);
	}

}
