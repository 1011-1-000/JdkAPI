package com.java.nowcoder;

public class Match {
	public static boolean match(char[] str, char[] pattern)
    {
		int i,j;
        for(i = 0, j = 0; i < str.length && j < pattern.length; i++){
        	if(str[i] == pattern[j]){
        		j++;
        	}
        	else if(pattern[j] == '.'){
        		j++;
        	}
        	else {
        		char tmp = str[i];
        		if(j + 1 < pattern.length && pattern[j + 1] == '*'){
        			
        		}
        		if(j + 1 < pattern.length && pattern[j + 1] == '*'){
        			while(i + 1 < str.length && str[i + 1] == tmp ){
        				i++;
        			}
        			j += 2;
        		}
        		else{
        			break;
        		}
        	}
        }
        
        if(i == str.length  && j == pattern.length ){
        	return true;
        }
        else{
        	return false;
        }
    }
	
	public static void main(String[] args){
		char[] str = "aaa".toCharArray();
		char[] pattern = "ab*ac*a".toCharArray();
		System.out.println(match(str,pattern));
	}
}
