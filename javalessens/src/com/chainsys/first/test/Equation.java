package com.chainsys.first.test;

public class Equation {
	public static void main(String[] args) {
		SolveTheEquation();
	}
	public static void SolveTheEquation() {
		for(int value=5;value<=10;value++) {
			long equation = (2*(value*value)+value+5);
			System.out.println("x="+value+" => "+equation);
		}
	}

}
