package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class CalenderQueue {


	public static void main(String[] args) throws InterruptedException 
	{
		Utility utility=new Utility();
		System.out.println("Enter the month and year");
		int month = utility.IntegerInput();
		int year = utility.IntegerInput();
		utility.storeCalenderInQueue(month, year);

	}
}