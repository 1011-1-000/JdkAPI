package org.java.lang;

public class CharacterT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		
		char[] values = {'*','_','%','8','L','l'};
		
		for(count = 0;count<values.length;++count){
			if(Character.isDigit(values[count])){
				System.out.println(values[count]+"��һ������");
			}
			if(Character.isLetter(values[count])){
				System.out.println(values[count]+"��һ����ĸ");
			}
			if(Character.isUpperCase(values[count])){
				System.out.println(values[count]+"��һ����д��ĸ");
			}
			if(Character.isLowerCase(values[count])){
				System.out.println(values[count]+"��һ��Сд��ĸ");
			}
			if(Character.isUnicodeIdentifierStart(values[count])){
				System.out.println(values[count]+"��unicode��־���ĵ�һ����Ч�ַ�");
			}
		}
	}

}
