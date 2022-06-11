package com;
public class A
{ 
	private int x,y,z;	
	public A()
	{
		System.out.println("This is A class constructor");
		x=10;
		y=20;
	}
	public void add()
	{
		z=x+y;
		System.out.println("\n Addition is: "+z);
	}
}