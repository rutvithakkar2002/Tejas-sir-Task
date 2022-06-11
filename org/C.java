package org;
public class C
{ 
	private int x,y,z;	
	public C()
	{
		System.out.println("This is C class constructor");
		x=30;
		y=25;
	}
	public void mul()
	{
		z=x*y;
		System.out.println("\n Multiplication is: "+z);
	}
}