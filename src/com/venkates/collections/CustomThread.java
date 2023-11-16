package com.venkates.collections;

import java.util.HashMap;
import java.util.Map;

public class CustomThread extends Thread{
	
	static Map<Integer, String> map=new HashMap<Integer, String>();
	
	//child thread
	public void run() {
		try {
			Thread.sleep(1000);
			map.put(192, "D");
		}
		catch (InterruptedException e) {
			System.out.println("Child thread going to add element");
		}
	}

	public static void main(String[] args) throws InterruptedException{
		map.put(190, "A");
		map.put(191, "A");
		map.put(195, "A");
		
		CustomThread ct=new CustomThread();
		ct.start();
		
		for(Object o: map.entrySet()) {
			Object s=o;
			System.out.println(s);
			Thread.sleep(1000);
		}
		
		System.out.println(map);
		
	}

}
