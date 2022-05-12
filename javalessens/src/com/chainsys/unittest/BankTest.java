package com.chainsys.unittest;

import com.chainsys.variables.Bank;

public class BankTest {

	public static void testDeposit() {
		System.out.println("Before Balance " + Bank.currentBalance);
		Bank.deposit(10000);
		System.out.println("After Balance " + Bank.currentBalance);
	}

	public static void testWithdraw() {
		System.out.println("Before Balance " + Bank.currentBalance);
		int withdraw = Bank.withdraw(5000);
		System.out.println("total amount is" + withdraw);
		System.out.println("After Balance " + Bank.currentBalance);
	}

	public static void testOpenaccount() {
		Bank.openAccount("Ayyanar", 312017205);
		System.out.println(Bank.customerName);
		System.out.println(Bank.accountNumber);

	}
}

//public class BankTest {
//  public static void testDeposit() {
//	  Bank.deposit(1000);
//  }
//  public static void testWithdraw() {
//	  int withdraw =Bank.withdraw(2000);
//	  System.out.println("tocal amount is"+withdraw);
//	  System.out.println("After Balance is"+Bank.currentBalance);
//  }
//}
