import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception1
{
	public static void main(String args[])
	{
		int no1,no2,ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		try
		{
			no1=sc.nextInt();
			no2=sc.nextInt();
			ans=no1/no2;
			System.out.println("div is: "+ans);
		}	
		catch(ArithmeticException e)
		{
			System.out.println("Please Do not enter 0 ");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please Do not enter String! ");
		}
		
	}
}