package org.java.test;

public class TestReturn {
	//看到一道题说是finally是在return之前执行
	//我个人的看法是在return之后执行，return只是一个语句告诉接收参数的对象我准备返回这个值
	//然后再去执行这里的finally 并不是return就直接返回了 
	public static void main(String[] args) {
        int k = f_test();
        System.out.println(k);
    }
     
    @SuppressWarnings("finally")
	public static int f_test(){
        int a = 0;
        try{
            a = 2;
            return a;
        }
        finally{
            System.out.println("It is in final chunk.");
            a = 1;
            return a;
        }
    }
}
