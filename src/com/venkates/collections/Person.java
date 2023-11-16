package com.venkates.collections;

import java.util.Arrays;
import java.util.List;

public class Person {
	
	public static void main(String[] args) {
		
		/*
		 * Input : List<String> l1=["a","b","c","d"], List<String> l2= ["c","d","e","f"]
		 * 
		 * Output: List<String> result=["A","B","C","D","E","F"]
		 */
			
		List<String> l1=Arrays.asList("a","b","c","d");
		List<String> l2=Arrays.asList("c","d","e","f");
		
		l1.addAll(l2);
		
		System.out.println(l1.stream().map(s->s.toUpperCase()).distinct());
	
		
		
	}
	
	

}
