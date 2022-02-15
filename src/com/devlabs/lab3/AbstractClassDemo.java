package com.devlabs.lab3;

//package core_java.Basic_OOPS;

class AbstractClassDemo
{ 
    public static void main (String[] args)  
    { 
        // creating the Object of Terrestrial class 
        // and using Animal class reference. 
        Animals object1 = new Terrestrial("Elephants");
        //reference of the super class - point to a sub class object 
        object1.basicDetails("are terrestrial animals. They "); 
        object1.habitat(); 
        object1.respiration();
     //  object1 = new Aquatic("Fishes"); //polymorphism
        System.out.println(" "); 
        // creating the Objects of circle class 
        
        Animals object2 = new Aquatic("Fishes"); 
        object2.basicDetails("are aquatic animals. They "); 
        object2.habitat(); 
        object2.respiration(); 
    } 
} 
