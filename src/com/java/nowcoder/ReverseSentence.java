package com.java.nowcoder;

public class ReverseSentence {
	public static String ReverseSentence(String str) {
		if(str.trim().equals("")){
            return str;
        }
        String[] words = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = words.length - 1; i >= 1; i--){
        	sb.append(words[i]+" ");
        }
        sb.append(words[0]);
        return sb.toString();
    }
	
	
	public static void main(String[] args){
		System.out.println(ReverseSentence("I am a student."));
	}
}
