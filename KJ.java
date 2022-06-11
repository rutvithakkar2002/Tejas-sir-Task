/*KJ => 
 	KJ has variety of products to sell. 
 	they are specialized in making gold bangles.
 	they are also selling ear-rings. 
 	your task to design an application that can manage their inventory. 
 	you need to store details of every product , 
	like , name , qty , price , and type of build - type of build can be any [ gold,silver,diamond,mix] */
 
import java.util.Scanner;		
public class KJ
{
	String name,typeofbuild;
	int qty,price;
	KJ()
	{
		int bangalsgold=1000;
		int bangalssilver=2000;
		int bangalsdiamond=3000;
		int bangalsmix=4000;
	}
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product name: ");
		name=sc.nextLine();
		System.out.println("Enter product quntity: ");
		qty=sc.nextInt();
		System.out.println("Enter product price: ");
		price=sc.nextInt();
		sc.next();
		System.out.println("Enter product type of build: ");
		name=sc.nextLine();
	}
	void display()
	{
		System.out.println("Product name: "+name);
		System.out.println("Product quantity: "+qty);
		System.out.println("Product price: "+price);
		System.out.println("Product type: "+typeofbuild);
	}
	public static void main(String args[])
	{
		KJ b=new KJ();
		Scanner sc=new Scanner(System.in);
		System.out.println("1-------Bangals");
		System.out.println("2-------Earings");
		
		System.out.println("Enter Your Choice:");
		int ch1=sc.nextInt();
		switch(ch1)
		{
			case 1: 
				System.out.println("1---------Gold");
				System.out.println("2---------Silver");
				System.out.println("3---------Diamond");
				System.out.println("4---------Mix");
				
				System.out.println("Enter Your choice: ");
				int ch2=sc.nextInt();
				
				switch(ch2)
				{
					case 1:
						b.getdata();
						b.display();	
						break;
					case 2:
						b.getdata();
						b.display();
						break;
					case 3: 
						b.getdata();
						b.display();	
						break;
					case 4:	
						b.getdata();
						b.display();
						break;	
					case 5:
						System.exit(0);
					default: 
						System.out.println("Invalid Choice!!!");		
				}
				break;
				case 2: 
				System.out.println("1---------Gold");
				System.out.println("2---------Silver");
				System.out.println("3---------Diamond");
				System.out.println("4---------Mix");
				
				System.out.println("Enter Your choice: ");
				int ch3=sc.nextInt();
				
				switch(ch3)
				{
					case 1:
						b.getdata();
						b.display();	
						break;
					case 2:
						b.getdata();
						b.display();
						break;
					case 3: 
						b.getdata();	
						b.display();
						break;
					case 4:	
						b.getdata();
						b.display();
						break;	
					case 5:
						System.exit(0);
					default: 
						System.out.println("Invalid Choice!!!");		
				}
				break;
				case 3: 
					System.exit(0);
				default: 
					System.out.println("Invalid Choice!!!");

		}
		
	}
	
}
