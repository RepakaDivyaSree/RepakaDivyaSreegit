package com.epam.calculator;

//SRC that pereforms addition
 
public class Addition implements Operation
{
	public void operation(double num1,double num2)
	{
	System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
}

