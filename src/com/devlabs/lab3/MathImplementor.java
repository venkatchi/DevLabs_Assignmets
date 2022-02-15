package com.devlabs.lab3;


	public class MathImplementor implements MathsInterface, PrimeInterface
	{
	    
	    public void add(int a, int b)
	    {
	        System.out.println("The sum is:" + (a+b));
	    }
	    
	    public void subtract(int a, int b)
	    {
	        System.out.println("The difference is:" + (a-b));
	    }
	    public void multiply(int a, int b)
	    {
	        System.out.println("The product is:" + (a*b));
	    }
	    
	    public void divide(int a, int b)
	    {
	        System.out.println("The quotient is:" + (a/b));
	    }
	    
	    
	     public void checkPrime(int a) 
	     { 
	         System.out.println("PrimeCheck"); 
	     }
	     

	    public static void main(String[] args)
	    
	    { // TODO Auto-generated method stub
	        
	        MathImplementor m = new MathImplementor();
	        /*Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the first number:");
	        int a = scan.nextInt();
	        
	        System.out.println("Enter the second number:");
	        int b = scan.nextInt();
	        
	        scan.close();
	        */
	        
	        m.add(10,5);
	        m.subtract(5,2);
	        m.multiply(40,50);
	        m.divide(25,5);
	        
	        //m.checkPrime(a);
	      
	      }
	}
	        
	   

