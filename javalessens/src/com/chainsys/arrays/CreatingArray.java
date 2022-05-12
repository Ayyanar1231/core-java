package com.chainsys.arrays;

import java.util.Scanner;

public class CreatingArray {

	public static void main(String[] args) {
		createArray();
		createAnotherArray();
		createMonthArray();
	}
	public static void createArray() {
		int firstArray[] = new int[10];
		int secoundArray[] = {1,2,3,4};
		int lengthOfFirstNumber = firstArray.length;
		System.out.println("lengthOfFirstNumber:"+lengthOfFirstNumber);
		int lengthOfSecoundNumber = secoundArray.length;
		System.out.println("lengthOfSecoundNumber:"+lengthOfSecoundNumber);
	}
	public static void createAnotherArray() {
		int days[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of days:");
		int size = sc.nextInt();
		sc.close();
		days = new int[size];
		int lengthOfDays = days.length;
		System.out.println("Number Of Days:"+lengthOfDays);
	}
	public static void createMonthArray() {
		int month[] = {0,1,2,3,4,5}; //new int [12];
		int lengthOfMonth = month.length;
		System.out.println("array Length Is:"+lengthOfMonth);
		for(int i=0;i<lengthOfMonth;i++) {
			System.out.println(i+" - "+month[i]+",");
		}
		try {
		month[11] = 31;
		System.out.println("Hi......");
		}
		catch(Exception err){
			System.out.println("ERROR!!!"+err.getMessage());
		}
	}

}
