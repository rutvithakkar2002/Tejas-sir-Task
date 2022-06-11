public class Cmdargs4
{
	public static void main(String args[])
	{
		for(int i=0;i<args.length;i++)
		{
			if(Integer.parseInt(args[i])%2==0 || Integer.parseInt(args[i])%3==0 || Integer.parseInt(args[i])%9==0)
			{
				System.out.println(args[i]);		
			}
		}
	}
}