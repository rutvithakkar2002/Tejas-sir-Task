import java.util.Scanner;
public class Arraysrch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter number: ");	
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" number "+(i+1)+" is "+a[i]);	
		}
		System.out.println("Enter a number which you want to search: ");
		int srch=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(srch==a[i])
			{
				flag=0;
				break;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println(srch+ " is  not present!!");	
		}
		else
		{
			System.out.println(srch+ " is present...");
		}
		
	}
}