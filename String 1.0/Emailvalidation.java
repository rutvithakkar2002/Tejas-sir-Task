import java.util.Scanner;
public class Emailvalidation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String email;
		String pwd;
		System.out.println("Enter Your mail: ");
		email=sc.next();	
		System.out.println("Enter Password: ");
		pwd=sc.next();	
		email=email.toLowerCase();
		boolean isValid = true;
		if (email.contains("@") && email.contains("."))
		{
			if ((email.indexOf('@') < email.lastIndexOf('.')) && (email.lastIndexOf('.') > email.indexOf('@') + 1))
			{
				for (int i = 0; i < email.length(); i++) 
				{
					if (i != email.indexOf('@') && i != email.lastIndexOf('.'))
					 {
						if (!(email.charAt(i) >= 'a' && email.charAt(i) <= 'z'))
						{
							isValid = false;
							System.out.println("else 1 => " + i);
							break;
						}
					}
				}
			} 
			else
			{
				System.out.println("else 2");
				isValid = false;
			}
		} 
		else
		 {
			System.out.println("else 3");
			isValid = false;
		}
		if (isValid) 
		{
			System.out.println("Valid Email");
		}
		else
		{
			System.out.println("Invalid email");
		}
		
	}
}