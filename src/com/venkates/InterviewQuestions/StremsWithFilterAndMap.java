/*Filter the employees whose salary is greater than 20000 and designation is developer. Use the result data to add 10000 salary to 
 * each employee from the filtered data
 * */
package com.venkates.InterviewQuestions;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StremsWithFilterAndMap {
	
	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Sachin",100,10000,"software Engineer")); 
		l.add(new Employee("Kohli",101,20000, "Senior Software Engineer"));
		l.add(new Employee("Dravid",102 , 30000,"Consultant Specialist"));
		l.add(new Employee("Srinath",103 , 40000, "software Engineer"));
		l.add(new Employee("Bumrah",104 , 500000 , "Lead Consultant Specialist"));
		l.add(new Employee("Shami",105, 30000, "software Engineer"));
	
		l.stream().filter(sld -> sld.salary > 10000 && sld.designation == "software Engineer").map(e-> e.salary+10000).collect(Collectors.toList());
		
	}
}

class Employee{
	
	String name;
	int id;
	int salary;
	String designation;
	
	public Employee(String name, int id, int salary, String designation) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	
	
}