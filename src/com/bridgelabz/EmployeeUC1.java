package com.bridgelabz;

public class EmployeeUC1 {

	//UC3--- PART TIME EMPLOYEE WAGE
	public void check()
	{
		//constants
		int IS_PART_TIME=0;
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		//variables
		int empHrs=0;
		int empWage=0;
		
		double empcheck=Math.floor(Math.random()*10)%2;
		
		if(empcheck == IS_PART_TIME )
		{
			empHrs=8;
			System.out.println("Part-Time hours:"+empHrs);
		}
		else
		{
			empHrs=16;
			System.out.println("Full-Time hours:"+empHrs);

		}
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("The EMployee Wage is: "+ empWage);
		
	}
	public static void main(String[] args) {
		EmployeeUC1 obj=new EmployeeUC1();
		obj.check();
	}
	
		
}
