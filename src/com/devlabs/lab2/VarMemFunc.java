package com.devlabs.lab2;

public class VarMemFunc {
	
	int empid1;
	float empsal1 ;
	String empname1;
	
	void setEmpDetails(int empid, float empsal, String empname) 
	{
		//this.empid1 = empid;
		//this.empsal1 = empsal;
		//this.empname1 = empname;
		
		empid1 = empid;
		empsal1 = empsal;
		empname1 = empname;
		
	}
	
	void displayEmpDetails()
	{
		System.out.println("Empid is :" + empid1);
		System.out.println("Empsal is:" + empsal1);
		System.out.println("Empname is :" + empname1);
	}
	
	public static void main(String[] args) 
	{
				
		VarMemFunc v = new VarMemFunc();
		v.setEmpDetails(00101, 55000, "John");
		v.displayEmpDetails();	
		
		//System.out.println("Value of Empid is :" + v.empid1);
		//System.out.println("Valueu of EmpSal is :" + v.empsal1);
		//System.out.println("Value od EmpName is :" + v.empname1);
				
		
	}

}
