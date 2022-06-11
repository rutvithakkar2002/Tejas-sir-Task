import java.util.Scanner;
class GoogleApi
{
	public boolean authenticate(String email,String password)
	{
		if(email.length()>=11 && email.contains("@") && email.contains(".") && email.endsWith("@gmail.com"))
		{
			if(email.equals("royal@gmail.com") && password.equals("royal"))
			{
				return true;
			}
			else
			{
				return false;
			}
		}	
		else
		{
			InvalidEmailException e=new InvalidEmailException();
			throw e;
		}
	}
}
class InvalidEmailException extends RuntimeException
{
	public InvalidEmailException()
	{
		super("Invalid Email");
	}
}

public class Mysite
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email and Password");
		String email=sc.next();
		String password=sc.next();
		GoogleApi api=new GoogleApi();
		boolean ans=api.authenticate(email,password);
		if(ans==true)
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Invalid credentials");	
		}
	}
}