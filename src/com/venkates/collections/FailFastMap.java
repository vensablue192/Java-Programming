package com.venkates.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {

	public static void main(String[] args) {
		//Map<Integer, String> m1=new HashMap<Integer, String>();ConcurrentModificationException when inserting the element while iterating the Map 
		Map<Integer, String> m1=new ConcurrentHashMap<Integer, String>(); // We can avoid concurrent modification exception
		m1.put(1, "one");
		m1.put(2, "two");
		
		Iterator it=m1.keySet().iterator();
		
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println(key+" "+m1.get(key));
			m1.put(3, "three");
		}
	}

}
