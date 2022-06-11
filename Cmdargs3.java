public class Cmdargs3
{
	public static void main(String args[])
	{
		int evensum=0,oddsum=0;
		for(int i=0;i<args.length;i++)
		{
			if(Integer.parseInt(args[i])%2==0)
			{
				evensum=evensum+Integer.parseInt(args[i]);		
			}
			else
			{
				oddsum=oddsum+Integer.parseInt(args[i]);
			}
		}
		System.out.println("Sum of Even numbers is: "+evensum);
		System.out.println("Sum of Even numbers is: "+oddsum);
	}
}
