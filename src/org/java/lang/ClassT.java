package org.java.lang;

public class ClassT {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		/*class���ʵ����ʾJavaӦ������ʱ�����ӿڡ���Java�У�ÿ��class����
		 * һ����Ӧ��Class���������ɵ�.class�ļ��У��ͻ����һ��Class����
		 * ���ڱ�ʾ������������Ϣ�����ǻ�ȡClassʵ�������ַ�����
		 * 1�����ö������ getClass()��ȡ�ö����Classʵ����
		 * 2��ʹ��Class��ľ�̬����forName(String className),��������ֻ�ȡ
		 * 	    һ��Classʵ��
		 * 3������.class�ķ�ʽ����ȡClassʵ�������ڻ����������͵ķ�װ�࣬������
		 *    .TYPEΪ��ȡ���Ӧ�Ļ����������͵�Classʵ��
		*/
		String objString = new String();
		@SuppressWarnings("rawtypes")
		Class objClass;
		objClass = objString.getClass();
		System.out.println("String ����������ǣ�"+objClass.getName());
		objClass = String.class;
		System.out.println("String ����������ǣ�"+objClass.getName());
		objClass = Class.forName("java.lang.String");
		System.out.println("String ����������ǣ�"+objClass.getName());
		objClass = objClass.getSuperclass();
		System.out.println("String �������������ǣ�"+objClass.getName());
		objClass = Integer.TYPE;
		System.out.println("Integer ����������ǣ�"+objClass.getName());
	}

}
