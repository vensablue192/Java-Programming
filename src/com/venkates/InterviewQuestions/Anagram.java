package com.venkates.InterviewQuestions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(anagram("listen","silent"));

	}
	
	public static boolean anagram(String str1,String str2) {
		
		boolean status;
		
		if(str1.length() !=str2.length()) status=false;
		else 
		{
		  char[] ArrayS1 = str1.toLowerCase().toCharArray();  
           char[] ArrayS2 = str2.toLowerCase().toCharArray();  
           Arrays.sort(ArrayS1);  
           Arrays.sort(ArrayS2);  
           status = Arrays.equals(ArrayS1, ArrayS2);			
		}
		
		
		return status;
		
	}
	

}
