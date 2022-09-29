package com.juniad.one;

public class CurrentCalculation {

	static float due;

	public static float paymoney(float units)
	{
		//Upto 100 Units/Month
		//0-50   --- 1.95
		//51-100 --- 3.1
		if(units <101.0f) 
		{
			if(units < 51.0f)
			{
				due = due + (units * 1.95f);

			}
			if(units <101.0f && units > 51.0f)
			{
				due = due + ( 50.0f * 1.95f);
				units = units -50.0f;
				due = due + ( units * 3.1f);			
			}
		}
		//above 100 Units/Month and  up to 200 Units/ Month
		//0-100    --- 3.4
		//101-200  --- 4.8
		if(units <201.0f && units > 101.0f)
		{
			if(units <101.0f)
			{
				due = due + ( units * 3.4f);
			}
			if(units >101.0f && units <201.0f)
			{
				due = due + ( 100.0f * 3.4f);
				units = units -100.0f;
				due = due + ( units * 4.8f);			
			}
		}

		return due;

	}
	public static void main(String[] args) {
		System.out.println(paymoney(60.0f));
		System.out.println(paymoney(160.0f));
	}

}
