public class Cmdargs1
{
	public static void main(String args[])
	{
		int i,max;
		max=args[0];
		for(i=0;i<args.length;i++)
		{
			no=Integer.parseInt(args[i]);					
		}
		for(i=0;i<args.length;i++)
		{
			if(args[i]>max)
			{
				max=args[i];
			}
		}
		System.out.println("Maximum number is: "+max);
	}
}