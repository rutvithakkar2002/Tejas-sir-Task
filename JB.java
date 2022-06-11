import java.util.Scanner;
public class JB
{
	String name;
	long no;
	int qtyd,qtyp,qtypa;
	int priced=0;
	int pricep=0;
	int pricepa=0;
	static int Dabeli=25;
	static int Pizza=100;
	static int Pasta=120;
	void signup()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter Mobile no: ");
		no=sc.nextLong();
		System.out.println("Signup successfully");
	}
	void Menu()
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		while(true)
		{
		System.out.println("------------------------------------Welcome dear Customer----------------------------------");
		System.out.println("1. Dabeli-----------------------------------------------25");
		System.out.println("2. Pizza------------------------------------------------100");
		System.out.println("3. Pasta------------------------------------------------ 120");
		System.out.println("4. Bill");
		System.out.println("5. Exit");
		System.out.println("Enter Your Choice: ");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("How many qty u want?");
				qtyd=sc.nextInt();
				if(qtyd>10)
				{
					System.out.println("You can give maximum 10 qty!!so, enter qty less than 10");
					break;	
				}
				priced=Dabeli*qtyd;
				System.out.println("Dabeli Price is: "+priced);
				break;
			case 2:
				System.out.println("How many qty u want?");
				qtyp=sc.nextInt();
				if(qtyp>10)
				{
					System.out.println("You can give maximum 10 qty!!so, enter qty less than 10");
					break;	
				}
				pricep=Pizza*qtyp;
				System.out.println("Pizza Price is: "+pricep);
				break;	
			case 3:
				System.out.println("How many qty u want?");
				qtypa=sc.nextInt();
				if(qtypa>10)
				{
					System.out.println("You can give maximum 10 qty!!so, enter qty less than 10");
					break;	
				}
				pricepa=Pasta*qtypa;
				System.out.println("Pasta Price is: "+pricepa);
				break;
			
			case 4:
				int total;
				double tax;	
				total=(priced+pricep+pricepa);		
				tax=total*0.10;
				System.out.println("Dabeli        "+qtyd+"     "+priced);
				System.out.println("Pizzza        " +qtyp+"     "+pricep);
				System.out.println("Pasta         "+qtypa+"     "+pricepa);
				System.out.println("Total                        "+total);
				System.out.println("Tax                           "+tax);
				System.out.println("--------------------------------------------");
				System.out.println("                    "+(total+tax) );
				System.out.println("ThankYou.........");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice: ");	
		}
	}	
}
	public static void main(String args[])
	{
		JB jb1=new JB();
		jb1.signup();
		jb1.Menu();	
	}		
}