package com.chainsys.first.test;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value");
		int value = sc.nextInt();
		sc.close();
		int a= value/100;
		int b= value%100;
		int l= b/10;
		int c= value%100;
		int z= c%10;
		int temp = ((a*a*a)+(l*l*l)+(z*z*z));
		if (temp == value) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
		
	 }
}
