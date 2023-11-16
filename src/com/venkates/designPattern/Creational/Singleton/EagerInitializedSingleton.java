package com.venkates.designPattern.Creational.Singleton;

public class EagerInitializedSingleton {
	
	//Private static variable of the same class that is the only instance of the class.
	private static final EagerInitializedSingleton instance= new EagerInitializedSingleton();
	
	// Private constructor to restrict instantiation of the class from other classes.
	private EagerInitializedSingleton(){
	}
	
	/*
	 * Public static method that returns the instance of the class, this is the
	 * global access point for the outer world to get the instance of the singleton
	 * class.
	 */

	public static EagerInitializedSingleton getinstance() {
		return instance;
	}
	
}

/*
 * In eager initialization, the instance of the singleton class is created at the time of class loading. 
 * The drawback to eager initialization is that the method is created even though the client application might not be using it.
 * If your singleton class is not using a lot of resources, this is the approach to use. 
 * But in most of the scenarios, singleton classes are created for resources such as File System, 
 * Database connections, etc. We should avoid the instantiation unless the client calls the getInstance method. 
 * Also, this method doesn’t provide any options for exception handling
 */
