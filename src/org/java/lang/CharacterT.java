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
				System.out.println(values[count]+"是一个数字");
			}
			if(Character.isLetter(values[count])){
				System.out.println(values[count]+"是一个字母");
			}
			if(Character.isUpperCase(values[count])){
				System.out.println(values[count]+"是一个大写字母");
			}
			if(Character.isLowerCase(values[count])){
				System.out.println(values[count]+"是一个小写字母");
			}
			if(Character.isUnicodeIdentifierStart(values[count])){
				System.out.println(values[count]+"是unicode标志符的第一个有效字符");
			}
		}
	}

}
