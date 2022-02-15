package com.devlabs.lab4;

import java.util.Scanner;

public class FindLargestNumber {

public static void main(String[] args) {
int a,b,c;

Scanner scan=new Scanner(System.in);
System.out.println("Enter the first number :");
a=scan.nextInt();

System.out.println("Enter the second number :");
b=scan.nextInt();

System.out.println("Enter the third number :");
c=scan.nextInt();

scan.close();

if((a>b)&&(a>c))
System.out.println("First number is greatest"+a);

else if((b>a)&&(b>c))
System.out.println("Second number is greatest" +b);

else
System.out.println("Third number is greatest"+c);

}

}
