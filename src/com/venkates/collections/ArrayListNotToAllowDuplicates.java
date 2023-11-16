package com.venkates.collections;

import java.util.ArrayList;import java.util.List;

public class ArrayListNotToAllowDuplicates extends ArrayList {
	
	public boolean add(Object o) {
		
		if(this.contains(o)) {
			return true;
		}
		else {
			return super.add(o);
		}
		
	}
	
	public static void main(String[] args) {
		List l1=new ArrayListNotToAllowDuplicates();
		l1.add(1);
		l1.add(1);
		l1.add(2);
		l1.add(1);
		
		System.out.println(l1);
		
		
	}
		
}
