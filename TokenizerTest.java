package com.godoro.string;

import java.util.StringTokenizer;

public class TokenizerTest {
	public static void main(String[] args) {
		String string="HTML, CSS, JavaScript, SQL, NoSQL,PlSQL,T-SQL";
		String[] tokens=string.split(", ");
		for(String token: tokens)
		{
			System.out.println("* "+token);
		}
		
		StringTokenizer tokenizer=new StringTokenizer(string,",!?");
		
	 
		while(tokenizer.hasMoreTokens())//iteratür patern
		{
			String token=tokenizer.nextToken();
			System.out.println("# "+token);
		}
	
	}

}
