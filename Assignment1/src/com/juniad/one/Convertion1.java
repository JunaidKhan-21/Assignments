package com.juniad.one;

public class Convertion1 {
    
	public float celsiusToFahrenheit(Float Celsius)
	{
	 return ((Celsius * 9/5)+32);
	}
	public float fahrenheitToCelsius(Float Fahrenheit)
	
	{
		return (((Fahrenheit - 32)* 5)/9);
	}
	
	public static void main(String[] args) {
	  
		System.out.println(new Convertion1().celsiusToFahrenheit(10.0f));
		System.out.println(new Convertion1().fahrenheitToCelsius(50.0f));
		

	}

}
