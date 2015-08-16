package com.java.nowcoder;

import java.util.Arrays;

public class IsContinuous {
	public static boolean isContinuous(int [] numbers) {
		if(numbers.length != 5){
			return false;
		}
		Arrays.sort(numbers);
		int count = 0;
		int pre = -1;
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] == 0){
				count++;
				if(count > 4){
					return false;
				}
			}
			else{
				if(pre == -1){
					pre = numbers[i];
				}
				else if(pre + 1 != numbers[i] && numbers[i] > pre){
					int distance = numbers[i] - pre -1;
					if(distance <= count){
						count -= distance;
						if(count < 0){
							return false;
						}
						else{
							pre = numbers[i];
						}
					}
					else{
						return false;
					}
				}
				else{
					if(numbers[i] > pre){
                        pre++;
                    }
                    else{
                        return false;
                    }
				}
			}
		}
		return true;
    }
	
	public static void main(String[] args){
		int[] numbers = {1,0,0,1,0};
		System.out.println(isContinuous(numbers));
	}
}
