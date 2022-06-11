public class Cmdargs2
{
	public static void main(String args[])
	{
		int i,max;
		max=Integer.parseInt(args[0]);
		for(i=0;i<args.length;i++)
		{
			if(Integer.parseInt(args[i])>max)
			{
				max=Integer.parseInt(args[i]);
			}
		}
		System.out.println("Maximum number is: "+max);
	}
}