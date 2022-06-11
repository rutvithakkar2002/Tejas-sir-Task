//Array Of Objects

import java.util.Scanner;
public class ContactApp
{	
	String name,city;
	String no;
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		name=sc.next();
		System.out.println("Enter Your Contact no: ");
		no=sc.next();
		if(no.length()>10 && no.length()<10)
		{
			System.out.println("Invalid No!");	
		}
		System.out.println("Enter City name: ");
		city=sc.next();	
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println(" Contact No: "+no);
		System.out.println(" City name: "+city);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;	
		ContactApp c[]=new ContactApp[5];
		int userCounter = 0;
		
		//ContactApp c1=new ContactApp();
		while(true)
		{
			System.out.println("1.Add Contact");	
			System.out.println("2.Display Contact ");
			System.out.println("3.Search Contact by name");
			System.out.println("4.Search by one character");//r
			System.out.println("5.Search by multiple characters");  //ra
			System.out.println("6.Sort the List");
			System.out.println("7. Delete Selected Contact");
			System.out.println("8.Exit");
			System.out.println("Enter Your Choice:");
			ch=sc.nextInt();	
			switch(ch)
			{
				case 1: 
					if (userCounter == 5)
					{
						System.out.println("----------List is full------");
					}
					else
					{
						c[userCounter] = new ContactApp();
						c[userCounter].getData();
						userCounter++;
					}	
					break;
				case 2:
					for(int i=0;i<userCounter;i++)
					{
						c[i].display();
					}
					break;
				case 3:
					String name1;
					System.out.println("Enter Your name you want to search:");
					name1=sc.next();
					for(int i=0;i<userCounter;i++)
					{
						if(name1.equalsIgnoreCase(c[i].name))
						{
							c[i].display();
						}
						else
						{
							System.out.println("Not Found");
						}
					}
					break;
				case 4:
					System.out.println("Enter a character you want to search:");
					char c1 = sc.next().charAt(0);  
					for(int i=0;i<userCounter;i++)
					{
						if(c1==c[i].name.charAt(0))
						{
							c[i].display();	
						}
						else
						{
							System.out.println("Not Found!");
						}
					}
					break;
				case 5:
					System.out.println("Enter search character(s)");
					String search1 = sc.next();
					for (int i = 0; i < userCounter; i++) 
					{
						if (c[i].name.startsWith(search1)) 
						{ 				// ram --> rp
							c[i].display();
						}
					}

					break;
				case 6:
					ContactApp tmp = null;

					for (int i = 0; i < userCounter; i++) 
					{
						for (int j = 0; j < userCounter - 1; j++)
						{
							if (c[j].name.compareTo(c[j + 1].name) > 0) 
							{
								tmp = c[j];
								c[j] = c[j + 1];
								c[j + 1] = tmp;
							}
						}
					}
					for (int i = 0; i < userCounter; i++) 
					{
						c[i].display();
					}
				break;
				case 7:
					String name2;
					System.out.println("Enter Name You want to delete: ");
					name2=sc.next();
					name2=name2.toLowerCase();
					for(int i=0;i<userCounter;i++)
					{
						if(name2.equalsIgnoreCase(c[i].name))
						{
							c[i]=c[i+1];			//1 2 3 4 5
						}
					}	
					userCounter--;
					System.out.println("Entered Name is deleted..");
					System.out.println("Updated List");
					for(int i=0;i<userCounter;i++)
					{
						c[i].display();
					}
				case 8:
					System.exit(0);
				default:
					System.out.println("Invalid choice!");
					break;	
			}
		}						
	}
}