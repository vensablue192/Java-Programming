package com.venkates.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programme {

	public static void main(String[] args) {
		List<Employee2> emp = new ArrayList<Employee2>();
		emp.add(new Employee2("Venkates" ,30, "Male" , "HR"));
		emp.add(new Employee2("Sachin" ,25, "Female" , "IT"));
		emp.add(new Employee2("Sharma" ,30, "Male" , "HR"));
		emp.add(new Employee2("Bumrah" ,28, "Female" , "IT"));
		
		System.out.println(emp.stream().collect(Collectors.groupingBy(Employee2::getGender,Collectors.averagingInt(Employee2::getAge))));
	}

}
