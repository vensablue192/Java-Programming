/*Find distinct values from two lists without using set data structure*/
package com.venkates.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctValuesFromTwoLists {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		List<String> l2=new ArrayList<String>();
		
		l1.add("Apple"); 
		l1.add("Google"); 		
		l1.add("Wipro");
		l1.add("TCS"); 		
		l1.add("Reliance"); 
		
		l2.add("Apple"); 
		l2.add("Google"); 
		l2.add("HMT");
		
		l1.addAll(l2);
		
		l1=l1.stream().distinct().collect(Collectors.toList());
		System.out.println(l1);
	}

}
