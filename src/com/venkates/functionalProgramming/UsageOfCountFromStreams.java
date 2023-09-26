// Find the number of elements less than 35
package com.venkates.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class UsageOfCountFromStreams {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(28);l1.add(32);l1.add(47);l1.add(52);l1.add(65);l1.add(40);l1.add(33);
		
		System.out.println(l1);
		int count=(int) l1.stream().filter(i->i<=35).count();
		System.out.println(count);

	}

}
