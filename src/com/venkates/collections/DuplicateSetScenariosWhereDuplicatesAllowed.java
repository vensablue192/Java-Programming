package com.venkates.collections;

import java.util.HashSet;
import java.util.Set;

public class DuplicateSetScenariosWhereDuplicatesAllowed {

	public static void main(String[] args) {
		
		Set<Student> students=new HashSet<Student>();
		
		students.add(new Student(101,"Venkates"));
		students.add(new Student(101,"Venkates"));
		students.add(new Student(103,"Sachin"));
		
		System.out.println(students);
		//Custom objects duplications is not performed. We need to override equals and hashcode
		
		

	}

}
