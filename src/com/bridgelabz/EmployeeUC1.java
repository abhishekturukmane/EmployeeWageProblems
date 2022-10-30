package com.bridgelabz;

import java.util.Scanner;

public class EmployeeUC1 {

	//UC4--- Solve Using Switch case statement
	public void check()
	{
		Scanner sc=new Scanner(System.in);
		//constants 
		int IS_PART_TIME=0;
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		//variables
		int empWage=0;
		int empHrs=0;
		
		double empCheck=Math.floor(Math.random()*10)%2;
		int i= (int)empCheck;//typecasted because floor function is in double and 
							 //switch case dont use double
		switch(i)
		{
			case 0 : empHrs=8;
					 System.out.println("Employee hours: "+ empHrs);
					 empWage=empHrs*EMP_RATE_PER_HOUR;
					 System.out.println("Wage for Part-Time Employee is: "+ empWage);
					 break;
			case 1 : empHrs=16;
			         System.out.println("EMployee hours: "+ empHrs);
			         empWage=empHrs*EMP_RATE_PER_HOUR;
					 System.out.println("Wage for Full-Time Employee is: "+ empWage);
			         break;
			         
			 default :System.out.println("Invalid Number");
			     		break;
			
		}
	}
	public static void main(String[] args) {
		EmployeeUC1 obj=new EmployeeUC1();
		obj.check();
	}
	
		
}
