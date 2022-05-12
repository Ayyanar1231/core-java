package com.chainsys.introduction;

public class Third {

	public static void main(String[] args) {
		byte b1 =127; // less 128,greater than -129(-128...+127)
		System.out.println("b1:"+ b1);
		short shortMaxValue  = 32767; //2^16
		System.out.println("shortMaxValue:"+ shortMaxValue);
		short shortMinValue  = -32768; //2^16
		System.out.println("shortMinValue:"+ shortMinValue);
		int intMaxValue  = 217483648; //2^32
		System.out.println("intMaxValue:"+ intMaxValue);
		int intMinValue  = -217483647; //2^32
		System.out.println("intMinValue:"+ intMinValue);
		long longMaxValue  = 92233720368547808L; //2^64
		System.out.println("longMaxValue:"+ longMaxValue);
		long longMinValue  = -9223372036854775807L; //2^64
		System.out.println("longMinValue:"+ longMinValue);
		float floatMaxValue  = 2147483647.5432F; //2^32
		System.out.println("floatMaxValue:"+ floatMaxValue);
		float floatMinValue  = -2147483648.11111F; //2^32
		System.out.println("floatMinValue:"+ floatMinValue);
		double doubleMaxValue  = 2147483647.5432F; //2^32
		System.out.println("doublMaxValue:"+ doubleMaxValue);
		double doubleMinValue  = -2147483648.11111F; //2^32
		System.out.println("doublMinValue:"+ doubleMinValue);
		char c1 ='A';
		System.out.println("c1:"+ c1);
		char c2 ='a';
		System.out.println("c1:"+ c2);
		boolean f1  = true; 
		System.out.println("f1:"+f1);
	}

}
