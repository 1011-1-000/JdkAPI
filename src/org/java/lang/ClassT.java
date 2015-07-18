package org.java.lang;

public class ClassT {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		/*class类的实例表示Java应用运行时的类或接口。在Java中，每个class都有
		 * 一个对应的Class对象，在生成的.class文件中，就会产生一个Class对象，
		 * 用于表示这个类的类型信息。我们获取Class实例有三种方法。
		 * 1、利用对象调用 getClass()获取该对象的Class实例。
		 * 2、使用Class类的静态方法forName(String className),用类的名字获取
		 * 	    一个Class实例
		 * 3、运用.class的方式来获取Class实例，对于基本数据类型的封装类，还可以
		 *    .TYPE为获取相对应的基本数据类型的Class实例
		*/
		String objString = new String();
		@SuppressWarnings("rawtypes")
		Class objClass;
		objClass = objString.getClass();
		System.out.println("String 对象的类型是："+objClass.getName());
		objClass = String.class;
		System.out.println("String 对象的类型是："+objClass.getName());
		objClass = Class.forName("java.lang.String");
		System.out.println("String 对象的类型是："+objClass.getName());
		objClass = objClass.getSuperclass();
		System.out.println("String 父类对象的类型是："+objClass.getName());
		objClass = Integer.TYPE;
		System.out.println("Integer 对象的类型是："+objClass.getName());
	}

}
