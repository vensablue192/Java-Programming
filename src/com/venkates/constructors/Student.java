package com.venkates.constructors;

public class Student {
	String name;
	int dob;
	
	Student(){
		
	}
	Student (Student s1){
		name=s1.name;
		dob=s1.dob;
	}
	
	Student(String s1,int y){
		name=s1;
		dob=y;
	}
	
	public int check() {
		return dob;
	}
		

}
