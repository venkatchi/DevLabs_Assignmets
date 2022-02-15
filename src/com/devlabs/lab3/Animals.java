package com.devlabs.lab3;
//abstract class example

//package core_java.Basic_OOPS;

public abstract class Animals
{
                      
                String name = " "; 
          
            Animals(String name) 
            { 
                this.name = name; 
                System.out.println("Inside parent class constructor : Animals");
            } 
               
            // declare non-abstract methods 
            // it has default implementation
            
            public void basicDetails(String details) //concrete method
            { 
                System.out.println(name + " " + details); 
            } 
               
            // abstract methods which will be implemented by its subclass(es) 
            
            public abstract  void habitat();//abstract //method signatures
            
            public abstract void respiration(); 
} 


