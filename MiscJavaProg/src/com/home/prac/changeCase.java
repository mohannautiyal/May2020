package com.home.prac;

public class changeCase {

	public static void main(String[] args) {

		String str = "geeksForgEeks";
        char ch;
        int asc =0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
             if(ch > 'A' && ch <'Z')
            	asc = ch + 32;
             if(ch > 'a' && ch <'z')
            	 asc = ch -32;
             ch = (char)asc;
             
             System.out.print(ch);
            	 
             
             
		}
	}

}
