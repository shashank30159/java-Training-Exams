package com.vm.training.java.exam;

public class CountWordsChar {

	public static void main(String[] args) {
		String text="Hello welcome to india"; 
		int count=0;
		String words[]=text.split("\\s");  
		int length=words.length;
		System.out.println("Word ->"+length);
		for(int i = 0; i < text.length(); i++) {  
            if(text.charAt(i) != ' ')  
                count++;  
        }  
		System.out.println("Charecter ->"+count);

	}

}
