package com.venkates.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeDemo {

	public static void main(String[] args) {
		
		Map<String,String> tmap=new TreeMap<String, String>();
		tmap.put("a", "xyz");
		tmap.put("d", "ksh");
		tmap.put("b", "dfdksh");
		
		System.out.println(tmap);
		
	}

}
