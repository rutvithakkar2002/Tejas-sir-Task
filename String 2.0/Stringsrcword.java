import java.util.Scanner;
public class Stringsrcword
{
	public static void main(String args[])
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=sc.nextLine();
		System.out.println();
		System.out.println("String is: "+str);
		System.out.println();
		System.out.print("Enter the word which you want to search: ");
		String word=sc.next();
		String arr[]=str.split("\\s");
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i].equals(word))
			{
				cnt++;
			}
		}
		System.out.println(word+"  found  " + cnt + " times");
	}
}