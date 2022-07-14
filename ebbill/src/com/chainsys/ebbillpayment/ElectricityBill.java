package com.chainsys.ebbillpayment;

import java.util.Scanner;


class ElectricityBill extends CalculateBill  
{   
    public static void main(String args[])   
    {     
        Scanner sc = new Scanner(System.in);
        String state;
        System.out.println("Enter the state:");  
        state = sc.nextLine();
        try {
        	Validator.checkStringOnly(state);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
        
        System.out.println("State Board: " + state + " State Board");
        
        System.out.println("Press 1 : Domestic");
        System.out.println("Press 2 : Commercial");
        
        System.out.println("Enter the category number: ");
        int catagory = sc.nextInt();
        try {
        	Validator.CheckNumberForGreaterThanZero(catagory);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
        
        if(catagory==1) {
        	System.out.println("This Electricity is Domestic");
        	CalculateBill.getDomesticBill();
        	System.out.println("Enter number of units:");  
        	 try {
             	Validator.CheckNumberForGreaterThanZero(catagory);
     		}catch(InvalidInputDataException e) {
     			e.printStackTrace();
     			System.exit(-1);	
     		}
            units = sc.nextInt(); 
            System.out.println("Electricity bill for Units: "+units);
            System.out.println("Electricity Bill Amount: "+CalculateBill.getDomesticBill());
        }
        else if(catagory==2) {
        	System.out.println("This Electricity is Commercial");
        	CalculateBill.getCommercialBill();
        	System.out.println("Enter number of units:");  
            units = sc.nextInt(); 
            System.out.println("Electricity bill for Units: "+units);
            try {
            	Validator.CheckNumberForGreaterThanZero(catagory);
    		}catch(InvalidInputDataException e) {
    			e.printStackTrace();
    			System.exit(-1);	
    		}
            System.out.println("Electricity Bill Amount: "+CalculateBill.getCommercialBill());
        }
        else if(!((catagory==1)||(catagory==2))) {
        	System.out.println("sorry wrong number");
        }
    }   
}  


