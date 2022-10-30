package com.bridgelabz;

import java.util.Scanner;

public class EmployeeUC1 {

	//UC5--- Calculating Wages for a Month
	public void check()
	{
		//constants
		int IS_PART_TIME=0;
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		
		//variables
		int empWage=20;
		int empHrs=0;
		int WorkingDays=20;
		
		double empCheck=Math.floor(Math.random()*10)%2;
		
		if(empCheck == IS_PART_TIME)
		{
			empHrs=8;
			System.out.println("Employee Hours:"+empHrs );
		}
		else
		{
			empHrs=16;
			System.out.println("Employee Hours:"+empHrs );

			
		}
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage for single day is :"+empWage );
		
		//calculate for 20 working days
		int totalWage=0;
		for(int i=1;i<=WorkingDays;i++)
		{
			totalWage=totalWage+empWage;
		}
		
		System.out.println("Total Wage of Employee is:" + totalWage);
	}
	public static void main(String[] args) {
		EmployeeUC1 obj=new EmployeeUC1();
		obj.check();
	}
	
		
}
