package com.venkates.constructors;

public class DriverCode {

	public static void main(String[] args) {
		//Student s1= new Student("Venkates",39);
		//System.out.println(s1.name+" "+s1.dob);
		//System.out.println(s1.check());
		
		//Student s2=new Student(s1);
		//System.out.println(s2.name+" "+s2.dob);
		
		/*
		 * int x = 10 ; int y = 20; System.out.println(x+" "+y); swap(x,y);
		 * System.out.println(x+" "+y);
		 */
		
		Pair p1=new Pair(10,20);
		System.out.println(p1.x + " " + p1.y);
		swap2(p1);
		System.out.println(p1.x + " " + p1.y);
	}

	private static void swap2(Pair p1) {
		int temp = p1.x;
		p1.x= p1.y;	
		p1.y=temp;
		
		
	}

	private static void swap(int x, int y) {
		int temp=x;
		x=y;
		y=temp;
		
	}

}
