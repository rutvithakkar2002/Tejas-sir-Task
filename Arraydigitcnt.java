/*
	1 22 44 33 55 66
	1 digit number: 1
	2 digit number:5
	3 digit number:0
*/
import java.util.Scanner;
public class Arraydigitcnt
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int d1=0,d2=0,d3=0;
		System.out.println("Enter Elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();		
		}
		System.out.println("Elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);		
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0 && a[i]<=9)
			{
				d1++;
			}	
			else if(a[i]>=9 && a[i]<=99)
			{
				d2++;
			}
			else if(a[i]>99 && a[i]<=999)
			{	
				d3++;
			}
		}
		System.out.println("1 digit numbers: "+d1);
		System.out.println("2 digit numbers: "+d2);
		System.out.println("3 digit numbers: "+d3);
		
		
	}	
}