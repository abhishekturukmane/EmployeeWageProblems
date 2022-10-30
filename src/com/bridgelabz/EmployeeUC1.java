package com.bridgelabz;

public class EmployeeUC1 {

	//UC2---DAILY WAGE
	public void check()
	{
		//constants
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		//variables
		int empWage=0;
		int empHrs=0;
		
		double empcheck=Math.floor(Math.random()*10)%2;//random takes value bet 0 to1
		
		if(empcheck == IS_FULL_TIME )
		{
			empHrs=8;
			System.out.println("Employee hours:"+ empHrs);
			
		}
		else
		{
			empHrs=0;
			System.out.println("Employee hours:"+ empHrs);
		}
		
		empWage=empHrs * EMP_RATE_PER_HOUR;
		System.out.println("The Employee Wage is:"+ empWage);
		
	}
	public static void main(String[] args) {
		EmployeeUC1 obj = new EmployeeUC1();
		obj.check();
	}
}
