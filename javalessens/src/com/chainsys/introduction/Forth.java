package com.chainsys.introduction;

public class Forth {

	public static void main(String[] args) {
//		taskA();
//		taskB();
		taskC();
		taskD();
	}
	
	public static void taskA() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		sc.close();
		System.out.println(name);

	}
	public static void taskB() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter your number:");
		int firstValue = sc.nextInt();
		int result = firstValue*100;
		sc.close();
		System.out.println(result);
	}  
	public static void taskC() {
		String s1 = "100";
		String s2 = "5";
		System.out.println(s1+s2);
	    int x=Integer.parseInt(s1);
	    int y=Integer.parseInt(s2);
	    int z = x+y;
	    System.out.println(z);
		
	}  
	public static void taskD() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter age");
		int age =sc.nextInt();
		sc.close();
		if(age==0) {
			System.out.println("INVALID AGE");
		}
		if(age<22) {
			System.out.println("Sorry!! - You need to wait to go DL");
		}
		else {
			System.out.println("Happy biking..");
		}  
	}

}
