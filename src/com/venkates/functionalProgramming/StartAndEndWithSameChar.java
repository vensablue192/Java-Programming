
package com.venkates.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class StartAndEndWithSameChar{
	
	public static void main(String[] args) {
	
		List<String> l1=Arrays.asList("abc", "mnm", "xlx", "xyz", "fkf", "cfc");
		
		l1.stream().filter(exp -> exp.length() > 0 && exp.endsWith(String.valueOf(exp.charAt(0)))).forEach(System.out::println);
	}
}