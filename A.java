import java.io.*;
class A
{
	public static void main(String args[]) throws IOException
	{
		char c;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			c=(char)obj.read();
			System.out.print(c);
		}while(c!='\'' );
	}
}