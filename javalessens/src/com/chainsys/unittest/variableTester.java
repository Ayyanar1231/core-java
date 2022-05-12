package com.chainsys.unittest;

import com.chainsys.variables.Demoa;

public class variableTester {
	public class VariableTester{
		/**
		 * Test static variable
		 */
		public static void main(String[] args) {
			
			testStaticethod();
		}
		public static void testGlobalVariables() {
			//display the value of static field
			System.out.println("DataA:"+Demoa.DataA);
			//display the value of immutable field
			//this is not possible without an object
			//System.out.println("DataB:"+Demoa.DataB);
			//display the value of constant field
			System.out.println("DataC:"+Demoa.DataC);
			
			Demoa.DataA = 2345;
			System.out.println("DataA:"+Demoa.DataA);
			
			//modifying value of the static field DataC
			//ERROR: The final Demoa.DataC cannot be assigned
			//Demoa.DataC=2345
		}
	}
	public static void testImmutableVariable() {
		/* cannot make a static reference to the non-static field Demoa.DataB*/
//		Demoa.DataB = 123;
		/**
		 * first create an object or the class
		 * pass an int value as an argument to the constructor
		 * access the immutable instance field using the object reference
		 */
		Demoa firstObject = new Demoa(123);
		System.out.println(firstObject.DataB);
		/**
		 * value assigned to an immutable field can not be changed
		 * value for the immutable field can be assigned only through the constructor
		 */
//		firstObject.DataB =567;
	}
	/**
	 * Calling static method using class name
	 * Without creating an object
	 * created on :25 March 2022
	 */
	public static void testStaticethod() {
		Demoa.sayHello();
	}
	public static void testNonStaticethod() {
//		ERROR
//		Demoa.greatUser();
		Demoa firstObject = new Demoa(111);
//		call the non static method 
		firstObject.greetUser();
	}
}
