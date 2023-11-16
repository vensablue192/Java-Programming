package com.venkates.designPattern.Creational.Singleton;

public class LazyInitializedSingleton {
	
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton() {
		
	}
	
	public static LazyInitializedSingleton getInstance() {
		if(instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}

}
/*
 * Lazy initialization method to implement the singleton pattern creates the instance in the global access method.
 * This implementation works fine in the case of the single-threaded environment, but when it comes to multi-threaded systems, 
 * it can cause issues if multiple threads are inside the if condition at the same time. It will destroy the singleton pattern 
 * and both threads will get different instances of the singleton class.
 */
