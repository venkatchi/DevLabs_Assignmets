package com.devlabs.lab3;


//package core_java.Basic_OOPS;

class Aquatic extends Animals
{ 
    // constructor 
    Aquatic(String name) 
    { 
        // System.out.println("");
        super(name);//explicit call to the parent class's constructor //first line in the constructor
    } 
       
    @Override
    public void habitat()  
    { 
        System.out.println("live in water");  
    } 
       
    @Override
    public void respiration()  
    { 
        System.out.println("respire through gills or their skin");  
    }
}