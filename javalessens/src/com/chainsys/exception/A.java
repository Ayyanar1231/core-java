package com.chainsys.exception;

public class A {
	public static void main(String[] args) {
		m3();
	}
public static void m1() {}
public static void m2() {}
public static void m3() {
	try {
		m4();
	}
	catch(Exception err) {
		System.out.println("Inside catch"+err.getMessage());
		Throwable t1 = err.getCause();
		System.out.println("Cause "+t1.getMessage());
		}
}
public static void m4() throws Exception {
	Exception e1 = new Exception("Error 1");
	Exception e2 = new Exception("Error 2",e1);
	throw e2;
}
}
