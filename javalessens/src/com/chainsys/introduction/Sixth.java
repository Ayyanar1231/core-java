package com.chainsys.introduction;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		checkUserName();
		checkUserValue();
	}
	public static void checkUserName() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Name:");
		String userName = sc.nextLine();
		sc.close();
		System.out.println("Name is"+ userName);
		char[] nameAsCharacters = userName.toCharArray();
		int lengthOfCharArray = nameAsCharacters.length;
		System.out.println("Length of your nsame is:"+lengthOfCharArray);
		if(lengthOfCharArray < 15) {
			System.out.println("Name must NOT have more than 15 chars");
		}
		String nameInUppercase =userName.toUpperCase();
		nameInUppercase = nameInUppercase.trim();
		char [] uppercasecharAarray = nameInUppercase.toCharArray();
		int asciiValue =0;
		for(int index =0 ;index<lengthOfCharArray;index++)
		{
			asciiValue =(int) uppercasecharAarray[index];
			System.out.println("ASCII:"+asciiValue);
			if(asciiValue <65 || asciiValue > 90) {
				
			}
			System.out.println(index +" "+nameAsCharacters[index]);
		
		}
		
	}
		 public static void checkUserValue() {
			 Scanner sc = new Scanner (System.in);
				System.out.println("8610135556");
				long value = sc.nextLong();
				sc.close();
				long num = value;
				long reminder = 0;
				while(reminder %2 == 0) {
					reminder = num%10;
					if(reminder%2 == 0) {
						System.out.println(reminder);
					}
					num = num /10;
				}
		 }
//		 public static void ceckUserAdd() {
//			 int x = 67;
//			 int y =92;
//			 System.out.println("X:"+x,"Y:"+y);
//			 x =X+Y;
//			 y =X-Y;
//			 x =x-y;
//			 System.out.println("X:")
//		 }
		 }


