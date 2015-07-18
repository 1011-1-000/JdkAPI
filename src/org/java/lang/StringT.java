package org.java.lang;

public class StringT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//忽略大小写比较字符串
		String s = new String("Java");
		String m = "java";
		System.out.println("不忽略大小写："+s.equals(m));
		System.out.println("忽略大小写："+s.equalsIgnoreCase(m));
		//字符串连接除了直接相加以外，还可以使用函数concat
		
		System.out.println(s.concat(m));
		//字符串的提取，有6个函数
		
		/*
		 * 下面三条语句其实产生了3个String对象，"Hello "，"World!"，"Hello World!"。
		 * 第2条语句确实产生了"Hello World"字符串，但是没有指定把该字符串的引用赋给谁，
		 * 因此没有改变s引用。第3条语句根据不变性，并没有改变"Hello "，JVM创建了一个新
		 * 的对象，把"Hello "，"World!"的连接赋给了s引用，因此引用变了，但是原对象没变。
		 */
		
		String t ="Hello";
		t.concat("world");
		System.out.println(t);
		t = t.concat("world");
		System.out.println(t);
		
		//String对象的大量冗余，可以使用StringBuffer及StringBuilder来代替
		//简单看一下StringBuffer中常用的一些方法
		StringBuffer sb = new StringBuffer("I");
		sb.append("coding");
		sb.insert(1, " am ");
		String ts = sb.toString();
		System.out.println(ts);
	}

}
