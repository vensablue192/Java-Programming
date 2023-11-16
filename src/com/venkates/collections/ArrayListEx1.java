package com.venkates.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		final List  l1=new ArrayList();
		l1.add(6);
		l1.add("venkates");
		l1.add("sachin");
		l1.add(100.12);
		
		l1.add(4);
		Iterator it=l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}
