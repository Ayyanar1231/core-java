package com.chainsys.introduction;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		printNumberOneToTen();
		printTenToone();
		printMatrix();
		printTriangleB();
		printMatrix();
		TrianglePrint();
		
	}
		public static void printNumberOneToTen() {
			int count =0;
			for(count =1;count<=10;count++) {
				System.out.println(count + " ");
		}
	}
		public static void printTenToone() {
			int count =10;
			for(count =10;count>=1;count--) {
				System.out.println(count + " ");
		}
	}
		public static void printMatrix() {
			int countA =0;
			for(countA =1;countA<=10;countA++) {
				for(int countB =1;countB<=10;countB++)
				System.out.print(countB + " ");
		}
			System.out.println();
	}
		public static void printTriangleB() {
			int countA =0;
			for(countA =1;countA<=10;countA++) {
				for(int countB =1;countB<=countA;countB++) {
				System.out.print( ".");
		}
			for(int countC = countA;countC>=1;countC--)
			{
				System.out.print(countC);
			}
			
			System.out.println();
	}
		}


		    public static void TrianglePrint() {

		            int countA, countB, countC, countD;

		            for (countA = 1; countA <= 9; countA++) {

		                    for (countB = 1; countB <= 9 - countA; countB++) {
		                            System.out.print(".");
		                    }
		                    for (countC = countA; countC >= 1; countC--) {
		                            System.out.print(countC);
		                    }
		                    for (countD = 2; countD <= countA; countD++) {
		                            System.out.print(countD);
		                    }
		                    System.out.println();
		            }
		    }
}
		


