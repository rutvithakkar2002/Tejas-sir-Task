import java.util.Scanner;
public class Reversestr1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter a String: ");
		str=sc.next();
		StringBuffer sb = new StringBuffer(str);
		String rev=sb.reverse().toString();
		str=sb.reverse().toString();
		System.out.println("Reverse of String is: "+str);
	}

}