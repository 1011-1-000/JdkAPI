package com.java.nowcoder;

public class StrToInt {
	public static int StrToInt(String str) {
		if(str.length() == 0){
			return 0;
		}
		String tmp = str;
		if(str.charAt(0) == '+'||str.charAt(0) == '-'){
			tmp = str.substring(1);
		}
        char[] c = tmp.toCharArray();
        int[] numbers = new int[tmp.length()];
        int result = 0;
        for(int i = 0; i < tmp.length(); i++){
        	if(c[i] - 48 < 0 || c[i] - 48 > 9 ){
        		return 0;
        	}
        	numbers[i] = c[i] - 48;
        }
        
        for(int i = 0; i < tmp.length(); i++){
        	result = result *10 + numbers[i];
        }
        
        if(str.charAt(0) == '-'){
        	result = 0 - result;
        }
        
        return result;
    }
	
	public static int str(String str){
		return Integer.valueOf(str);
	}
	
	public static void main(String[] args){
		System.out.println(StrToInt("1a23"));
	}
}
