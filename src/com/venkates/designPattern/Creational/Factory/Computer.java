package com.venkates.designPattern.Creational.Factory;

public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
}

/*
 * Super class in factory design pattern can be an interface, abstract class or  a normal java class. 
 * For our factory design pattern example, we have abstract super class with overridden toString() method for testing purpose.
 */


/*
 * The factory design pattern is used when we have a superclass with multiple
 * sub-classes and based on input, we need to return one of the sub-class. This
 * pattern takes out the responsibility of the instantiation of a class from the
 * client program to the factory class. Let’s first learn how to implement a
 * factory design pattern in java and then we will look into factory pattern
 * advantages. We will see some of the factory design pattern usage in JDK. Note
 * that this pattern is also known as Factory Method Design Pattern.
 */