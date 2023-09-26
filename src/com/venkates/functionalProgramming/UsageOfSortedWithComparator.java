package com.venkates.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsageOfSortedWithComparator {
	
			public static void main(String[] args) {
				List<Integer> l1=new ArrayList<Integer>();
				l1.add(28);l1.add(32);l1.add(47);l1.add(52);l1.add(65);l1.add(40);l1.add(33);
				
				System.out.println(l1);
				//List<Integer> sortedList=l1.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());// descending order
				//List<Integer> sortedList=l1.stream().sorted((i1,i2)->(i1.compareTo(i2))).collect(Collectors.toList()); // ascending order
				List<Integer> sortedList=l1.stream().sorted((i1,i2)->(-i1.compareTo(i2))).collect(Collectors.toList()); // descending order
				
				System.out.println(sortedList);

			}
}
