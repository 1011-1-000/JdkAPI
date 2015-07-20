package org.java.test;

import org.java.util.MyArrayStack;
import org.java.util.MyListStack;

public class StackTest {
    public static void main(String[] args) {
        MyListStack stack = new MyListStack(); // 创建堆栈对象 
        System.out.println("11111, absdder, 29999.3 三个元素入栈"); 
        stack.push(new Integer(11111)); //向 栈中 压入整数 11111
        System.out.println(stack);  //显示栈中的所有元素

        stack.push("absdder"); //向 栈中 压入
        System.out.println(stack);  //显示栈中的所有元素

        stack.push(new Double(29999.3)); //向 栈中 压入
        System.out.println(stack);  //显示栈中的所有元素

        String s = new String("absdder");

        System.out.println("11111, absdder, 29999.3 三个元素出栈"); //弹出 栈顶元素 
        System.out.println("元素"+stack.pop()+"出栈");
        System.out.println(stack);  //显示栈中的所有元素
        System.out.println("元素"+stack.pop()+"出栈");
        System.out.println(stack);  //显示栈中的所有元素
        System.out.println("元素"+stack.pop()+"出栈");
        System.out.println(stack);  //显示栈中的所有元素
    }
}
