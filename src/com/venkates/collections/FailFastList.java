package com.venkates.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {

	public static void main(String[] args) {
		// List<String> al=new ArrayList<String>(); throws ConcurrentModificationException When inserting an element while modifying it
		List<String> al=new CopyOnWriteArrayList<String>(); // we can avoid ConcurrentModificationException
		al.add("a");
		al.add("b");
		
		Iterator<String> iterator=al.iterator();
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			al.add("c");
		}

	}

}
