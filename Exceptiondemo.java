import java.util.*;
public class Exceptiondemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		int a=sc.nextInt();	
		int b=sc.nextInt();
		try
		{
			int ans=a/b;
			System.out.println("division ans is: "+ans);
			try
			{
				int c=sc.nextInt();
				System.out.println("Value Of C is : "+c);
			}
			catch(InputMismatchException e)
			{	
				System.out.println("Do ans in integer type!");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero Exception!");
		}	
		System.out.println("End");
	}
}