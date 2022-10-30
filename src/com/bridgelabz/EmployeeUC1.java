package com.bridgelabz;

import java.util.Scanner;

public class EmployeeUC1 {

	//UC6--- a condition of total working hours or days is reached for month
	public void check()
	{
		//constants
		int IS_PART_TIME=0;
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		
		//variables
		int empWage=0;
		int empHrs=0;
		int workingDays=20;
		
		double empCheck=Math.floor(Math.random()*10)%2;
		int i=(int)empCheck;
		
		switch(i)
		{
		case 0 :
				empHrs=8;
				System.out.println("Employee hours: "+ empHrs);
				empWage=empHrs*EMP_RATE_PER_HOUR;
				System.out.println("The Employee Wage for "+empHrs+" is: "+ empWage );
				break;
				
		case 1:
				empHrs=16;
				System.out.println("Employee hours: "+ empHrs);
				empWage=empHrs*EMP_RATE_PER_HOUR;
				System.out.println("The Employee Wage for "+empHrs+" is: "+ empWage );
				break;
				
		default : System.out.println("Invalid number");
		          break;
		
		}
		
		System.out.println("Now wage for 100 working hous and 20 working days is: ");
		//emphrs=100
		if(empCheck==IS_PART_TIME || empCheck==IS_FULL_TIME)
		{
			empHrs=100;
			System.out.println("Employee hours: "+ empHrs);
			empWage=empHrs*EMP_RATE_PER_HOUR;
			System.out.println("The Employee Wage for "+ empHrs+" is: "+ empWage );
			
		}
		
		//workingdays=20
		int totalWage=0;
		for(int j=1;j<=workingDays;j++)
		{
			totalWage=totalWage+empWage;
		}
		System.out.println("Total Wage for "+ workingDays + " is: "+ totalWage);
	}
	public static void main(String[] args) {
		EmployeeUC1 obj=new EmployeeUC1();
		obj.check();
	}
	
		
}
