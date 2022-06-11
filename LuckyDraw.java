/*royal lucky draw app 


in your app all users are signup and they get unique number when they signup 
signup -> 

1.
ram ram@gmail.com  [ 12345 ] 


max 10 users can signup 



1 ram    XX   12345
2 sita   XX   42345
3 ravan  XX   62345
4 laxman xx   45345
 


1.signup //10
2.spinTheWheel //n
3.Dashboard 
4.Winner 
5.LeaderBoard

2 
winner is sita :: 42345

[1000] //every user have 0 credits 

3.
1 ram    XX   12345	5000
2 sita   XX   42345	6000
3 ravan  XX   62345	0
4 laxman xx   45345	2000 



4.
Sita XX 42345 6000 


5.
1 sita   XX   42345	6000
2 ram    XX   12345	5000
3 laxman xx   45345	2000 
4 ravan  XX   62345	0   */

import java.util.Scanner;
class LuckyDraw
{
	String name,email;
	double rand;
	int lotteryNum;
	int credits;
	LuckyDraw()
	{
		this.credits=0;
	}
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		name=sc.next();
		System.out.println("Enter Your Email: ");
		email=sc.next();
		lotteryNum=(int)(Math.random()*100000)
	}
	/*boolean authenticate(String email) 
	{
		if (email.length() >= 11 && email.contains("@") && email.contains(".") && email.endsWith("@gmail.com")) 
		{
			if(email.equals(email.toLowerCase()) )
			{
           				return true;
			}
			else
			{
				return false;
			}
		}
	}	*/

	void spinthewheel()
	{
		if(randm==Math.random()*100000)
		{
			System.out.println("You win this luckydraw..");
			credits=credits+1000;				
		}
		else
		{
			System.out.println("Try again! Better Luck for next time!");			
		}
	}
	void dashboard()
	{
		System.out.println(name+"  "+email+"  "+lotteryNum+"  "+credit);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;	
		LuckyDraw l[]=new LuckyDraw[10];
		LuckyDraw l1=new LuckyDraw();
		int userCounter = 0;
		int i;
		while(true)
		{
			System.out.println("1.SignUp");	
			System.out.println("2.Spin the Wheel ");
			System.out.println("3.Dashboard");
			System.out.println("4.Winner");
			System.out.println("5.LeaderBoard");  
			System.out.println("6.Exit");
			System.out.println("Enter Your Choice:");
			ch=sc.nextInt();	
			switch(ch)
			{
				case 1: 
					if (userCounter == 10)
					{
						System.out.println("----------List is full------");
					}
					else
					{
						l[userCounter] = new LuckyDraw();
						l[userCounter].getData();
						userCounter++;
					}
					break;
				case 2:
					Random r=new Random();
					int winIndex=r.nextInt(userCounter);
					System.out.println("Winner is ==>"+l[winIndex].name+" "+l[winIndex].email+" "+l[winIndex].lotteryNum);
					l[winIndex].credit=l[winIndex].credit+1000;	
					break;
				case 3:
					for(i=0;i<userCounter;i++)
					{
						l[i].dashboard();	
					}
					break;	
				case 4:
					long max=l[0].credits;
					for (i = 0; i <userCounter; i++)
					{
     						if (l[i].credits > max)
						{	
         							max = l[i].credits;
							System.out.println(l[i].name+" "+l[i].email+" "+l[i].randm+" "+l[i].credits);
						}
					}
					System.out.println("Winner Of the LuckyDraw is: "+max);
					
					break;

				case 5:
					for (int j = 1; j < l.length; j++)
					{
						for (i = 0; i < userCounter; i++) 
						{
							if (l[i].credits < l[i + 1].credits)
							{
								tmp = l[i].credits;
								l[i].credits = l[i + 1].credits;
								l[i + 1].credits = tmp;
							}
						}
					}
					break;					
				case 6:
					System.exit(0);
					break;
			}		
		}
		
	}
}
