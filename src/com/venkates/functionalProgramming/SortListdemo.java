package com.venkates.functionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortListdemo {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(8);list.add(3);	list.add(12);list.add(4);		
		list.stream().sorted().forEach(s->System.out.println(s)); // ascending order
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));// descending order
		
		
		
		
		List<Employee> l1=Database.getEmployees();
		//Collections.sort(l1, (o1, o2) ->(int) (o1.getSalary()-o2.getSalary()));
		
	
		l1.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(t->System.out.println(t));
		System.out.println("************");
		System.out.println("************");
		l1.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

		
	}

}


