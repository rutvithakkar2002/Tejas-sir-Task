import java.util.Scanner;
public class Stringcnt
{
	public static void main(String args[])
	{
		int vowel=0;
		int consonant=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.next();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowel++;
			}
			else
			{
				consonant++;	
			}
		}	
		System.out.println("String have "+vowel+"  vowels");
		System.out.println("String have "+consonant+"  consonant");		
	}
}