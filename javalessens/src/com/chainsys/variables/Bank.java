package com.chainsys.variables;

//import java.util.Scanner;

public class Bank {
	public static int currentBalance;
	public static String customerName;
	public static int accountNumber;

public static int deposit(int paraAmount) {
	currentBalance = currentBalance+paraAmount;
	return paraAmount;
}
public static int withdraw(int paraAmount) {
	currentBalance = currentBalance-paraAmount;
	return paraAmount;
}
public static void openAccount(String paraName,int accountNumber1) {
	customerName = paraName;
	accountNumber = accountNumber1 ;
}
}

//public class Bank {
//		
//		private String accno;  
//	    private String name;  
//		private long balance=1000;
//		 Scanner sc = new Scanner(System.in); 
//		   public void deposit() {  
//		        long amt;  
//		        System.out.println("Enter the amount you want to deposit: ");  
//		        amt = sc.nextLong();  
//		         balance = balance + amt; 
//		         System.out.println("BalanceAmount:"+balance);
//		    }  
//				
//		   public void withdrawal() {  
//		        long amt;  
//		        System.out.println("Enter the amount you want to withdraw: ");  
//		        amt = sc.nextLong();  
//		        if (balance >= amt) {  
//		            balance = balance - amt;  
//		            System.out.println("Balance after withdrawal: " + balance);  
//		        } else {  
//		            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
//		        } 
//		        System.out.println("BalanceAmount:"+balance);
//		    }  
//			
//		
//			
//			public  void openAccount() {
//				 System.out.print("Enter Name: ");  
//			        name = sc.next();
//			        System.out.print("Enter Balance: ");  
//			        balance = sc.nextLong(); 
//			}
//			public void showAccount() {
//				 System.out.println("Name of account holder: " + name);  
//			     System.out.println("Account no.: " + accno); 
//			}
//			
//		
//			
//		
//	}

