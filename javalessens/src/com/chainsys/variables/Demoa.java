package com.chainsys.variables;

public class Demoa {
	//static global variable
	public static int DataA;
	//immutable global variable (not static
	public final int DataB;
	// constant
	public final static int DataC=300; //constant
	
	//constructor
//	the name of the constructor and the name of the class will be same 
//	constructor don't have return type
//	constructor can take parameters
	public Demoa(int dataB)
	{
//		Assigning value to the global read-only field (this.DataB
		this.DataB=dataB;
	}
	/**
	 * static method can be called without an object
	 */
	public static void sayHello()
	{
		System.out.println("Hello Developer!!!");
	}
	/**
	 * greetUser is a non static method
	 * 
	 */
	public  void greetUser()
	{
		System.out.println("Greetings USER!!!");
	}
}
