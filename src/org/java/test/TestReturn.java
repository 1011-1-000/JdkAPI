package org.java.test;

public class TestReturn {
	//����һ����˵��finally����return֮ǰִ��
	//�Ҹ��˵Ŀ�������return֮��ִ�У�returnֻ��һ�������߽��ղ����Ķ�����׼���������ֵ
	//Ȼ����ȥִ�������finally ������return��ֱ�ӷ����� 
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
