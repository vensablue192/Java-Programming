package com.venkates.collections;

import java.util.ArrayList;

public class PracticeCustomArrayList extends ArrayList{
	
	
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}
		else return super.add(o);
		
		
	}
	
	
	
	public static void main(String[] args) {
		PracticeCustomArrayList pl1=new PracticeCustomArrayList();
		pl1.add(1);
		pl1.add(2);
		pl1.add(1);
		pl1.add(2);
		System.out.println("...."+pl1);
}
}