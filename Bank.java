import java.util.Scanner;
public class Bank
{	
	double balance;
	String fname,emailid,password;
	void Signup()
	{		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First name: ");
		fname=sc.nextLine();		
		System.out.print("Enter Email: ");
		emailid=sc.nextLine();	
		System.out.print("Enter Password:  ");
		password=sc.nextLine();			
	}
	Bank()
	{
		balance=5000;
	}
	void withdrawl()
	{
		Scanner sc=new Scanner(System.in);
		float amt;
		System.out.print("Enter balance for withdral: ");
		amt=sc.nextFloat();	
		if(balance>amt)
		{
			if(amt<=15000)
			{
				balance=balance-amt;
			}
			else
			{
				System.out.println("You can withdrawl maximum 15000");
			}
		}
		else
		{
			System.out.println("You must keep minimum 5000 amount in your Account! ");
		}
	}
	
	void deposit()
	{
		Scanner sc=new Scanner(System.in);
		float amt;
		System.out.print("Enter balance for Deposit: ");
		amt=sc.nextFloat();	
		if(amt>0)
		{
			balance=balance+amt;
		}
		else
		{
			System.out.println("Sorry, Amount is less than 0 so can not deposit!");
		}		
	}
	void checkbalance()
	{
		System.out.println("Your current balance is :"+balance);
	}
	boolean login(String e, String pwd)
	 {

		return emailid.equalsIgnoreCase(e) && password.equals(pwd);

	}
	public static void main(String args[])
	{
		Bank b=new Bank();
		int ch,ch1;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("/#/#/#/#/#/#/#/#/#Welcome/#/#/#/#/#/#/#/#/#");
			System.out.println("1. Sign Up");
			System.out.println("2. LogIn");
			System.out.println("3. Exit");
			System.out.println("Enter Your choice: ");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					b.Signup();
					break;
				case 2:
					
						System.out.println("Enter An Email: ");
						String e=sc.next();
						System.out.println("Enter Password");
						String pwd=sc.next();
						boolean ans = b.login(e, pwd);
						if (ans == false) 
						{
							System.out.println("Invalid login!...try again!");
						}	
						else 
						{
							System.out.println("You are successfully login..");
							System.out.println("welcome " + b.fname);
						for(int i=0;i<=5;i++)
						{

							while (true) 
							{
								System.out.println("1) Withdrawl Money");
								System.out.println("2) Deposit Money");
								System.out.println("3) Check Balance");
								System.out.println("4) Logout");
								System.out.println("5) Exit");
								System.out.println("Enter your choice: ");
								ch1 = sc.nextInt();
								switch(ch1)
								{
									case 1:
										b.withdrawl();
										break;
									case 2:
										b.deposit();
										break;
									case 3:
										b.checkbalance();
										break;
									case 4:
										System.out.println("Thank you.....");
										break;
									case 5:
										System.exit(0);
									default:
										System.out.println("Invalid choice!!!!!!!");
								}
							}
						}
					}
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Invalid choice!!!");
					break;
			}
		}			
	}
}