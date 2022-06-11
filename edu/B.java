package edu;
public class B
{ 
	private int x,y,z;	
	public B()
	{
		System.out.println("This is B class constructor");
		x=300;
		y=120;
	}
	public void sub()
	{
		z=x-y;
		System.out.println("\n Subtraction is: "+z);
	}
}