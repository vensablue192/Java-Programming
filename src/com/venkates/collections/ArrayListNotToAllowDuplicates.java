package com.venkates.collections.ArrayList;

import java.util.ArrayList;

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
		ArrayList l1=new ArrayListNotToAllowDuplicates();
		l1.add(1);
		l1.add(1);
		l1.add(2);
		l1.add(1);
		
		System.out.println(l1);
		
		
	}
		
}
