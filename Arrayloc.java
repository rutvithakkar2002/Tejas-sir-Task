// 1 22 3 22 5
		// enter number to search?
		// 22
		// 22 found at 2 location
		// 22 found at 4 location
		// 22 found 2 times
import java.util.Scanner;
public class Arrayloc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int i;
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter number: ");
			a[i]=sc.nextInt();
		}
		System.out.println("Elements are: ");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.print("Enter Number to search: ");
		int no=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==no)
			{
				System.out.println(a[i]+"  is found at "+(i+1) +"th location");
			}	
		}	
	}
}