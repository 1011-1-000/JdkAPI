package org.java.lang;

public class IntegerT {
	public static void main(String[] args) {
		//以 String 型变量作为参数创建 Integer 对象，例如Integer a = new Integer("10")
		Integer a = new Integer("10");
		Integer b = new Integer(11);
		
		//判断两个数的大小
		System.out.println(a.compareTo(b));
		
		float c = a.floatValue();
		System.out.println(c);
		
		String d = "10101110";
		//将字符串转换为数值
        //parseInt(String str) 和 parseInt(String str,int radix) 都是类方法，由类来调用。
		//后一个方法则实现将字符串按照参数 radix 指定的进制转换为 int
		int e = Integer.parseInt(d,2);
		System.out.println(e);
	}

}
