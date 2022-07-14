package com.chainsys.ebbillpayment;

class CalculateBill  
{       
    private static double billToPay; 
    protected static long units;
    protected static double getDomesticBill()  
    {  
        if(units <= 100)  
        {  
        	billToPay = 0;  
        }   
        else if(units > 100 || units <= 300){  
            billToPay = 100*0+(units - 100)*2;  
        }   
        else if(units > 300 || units <= 500)  
        {  
            billToPay = 100*0+200*2+(units - 300)*3;  
        }
        else if(units > 500)  
        {  
            billToPay = 100*0+200*2+200*3+(units - 500)*4;  
        } 
        return billToPay;  
   
    }      
    protected static double getCommercialBill()  
    {  
        if(units <= 100)  
        {  
        	billToPay = 100*2;  
        }   
        else if(units > 100 || units <= 300){  
            billToPay = 100*2+(units - 100)*3;  
        }   
        else if(units > 300 || units <= 500)  
        {  
            billToPay = 100*2+200*3+(units - 300)*4;  
        }
        else if(units > 500)  
        {  
            billToPay = 100*2+200*3+200*4+(units - 500)*5;  
        }  
        return billToPay;  
    }   
    
}  
