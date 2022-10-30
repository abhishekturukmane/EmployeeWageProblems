package com.bridgelabz;

public class EmployeeUC1 {

	public void check()
	{
		//constants
		int IS_PRESENT=1;
		//variables
		
		double empcheck=Math.floor((Math.random()*10)%2);
		
		if(empcheck == IS_PRESENT)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
		
	}
	public static void main(String[] args) {
		
		EmployeeUC1 obj=new EmployeeUC1();
		obj.check();
		
	}
}
