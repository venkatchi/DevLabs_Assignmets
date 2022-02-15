package com.devlabs.lab1;

public class Operators {

    public static void main(String[] args)
    {
        int itemA =20, itemB=80, itemC=150;
        
        double total_amount;
        
        total_amount = ((3*itemA) + (5*itemB) + (2*itemC));
        
        double discount = 0.15*total_amount;
        
        total_amount = total_amount - discount;
        
        total_amount = total_amount + (0.02 * total_amount);
        
        //ctrl_space after sysout
        System.out.println("The amount is:" + total_amount);
        
        if(total_amount>=1000) //true
        {
            System.out.println("Congrats, you got a gift voucher");
        }
        else
        {
            System.out.println("Thanks for visiting the store");
        }
    }

}