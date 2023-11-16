package com.venkates.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student{
	private int id;
	private String name;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	/*- @Override
	public int compareTo(Student s) {
		if(id==s.id) return 0;
		else if(id > s.id) return 1;
		else return -1;
	}*/
	
	public static void main(String[] args) {
		List<Student> stud=new ArrayList<Student>();
		stud.add(new Student(101,"Venkates"));
		stud.add(new Student(109,"Venkates"));
		stud.add(new Student(103,"Sachin"));
		stud.add(new Student(103,"Surya"));
		Collections.sort(stud,new IdComparator());
		System.out.println(stud);
	}
	
}
