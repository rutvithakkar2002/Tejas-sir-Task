/*Cricket App:-	
	 players registration ,like  firstname  , age , batsman or bowler 
	 if player is batsman then ask for totalRuns and inningsplayed
	 if player is bowler then ask for totalWickets and inningsplayed 
	 rules:-
	 	players age must be >= 18 and <= 30
	 	default skill is batsman 
	 	 [class,variable,method,constructor,final]


		firstName,age,skillType,totalRuns,inningsPlayed,totalWickets
		MIN_AGE,MAX_AGE 



*/

import java.util.Scanner;
public class CricketApp
{
	String Firstname; // variable should starts with small letters 
	String skill;	
	int totalrun,age,batsmaninning,bowlerinning,totalwicket; //if variable contains more than two words use capital letters for second word 
	final int minage=18;
	final int maxage=30;//final varaible should be in all caps
	CricketApp()
	{
		skill="batsman";
	}
	void registration()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your First Name: ");
		Firstname=sc.next();
		System.out.println("Enter your Age: ");
		age=sc.nextInt();
		if(age>=minage && age<=maxage)
		{
			System.out.println("Write your Skill?");
			skill=sc.next();
		}
		else
		{
			System.out.println("You are not eligible to register Yourself in Cricket!");
			System.exit(0);
		}
		if(skill.equals("bowler"))
		{
			bowler();
		}
		else
		{
			batsman();
		}
	}
	void batsman()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total runs of the match: ");
		totalrun=sc.nextInt();
		System.out.println("How many innings you were played?: ");
		batsmaninning=sc.nextInt();	
	}
	void bowler()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total runs of the match: ");
		totalwicket=sc.nextInt();
		System.out.println("How many innings you were played?: ");
		bowlerinning=sc.nextInt();	
	}
	void display()
	{
		System.out.println("FirstName: "+Firstname);
		System.out.println("Age: "+age);
		System.out.println("Skill: "+skill);
		if(skill.equals("batsman"))
		{
			System.out.println("Total runs are: "+totalrun);
			System.out.println("Batsmaninning are: "+batsmaninning);	
		}
		else
		{
			System.out.println("Total wickets are: "+totalwicket);
			System.out.println("total innings are: "+bowlerinning);		
		}
	}
	public static void main(String args[])
	{
		CricketApp c=new CricketApp();
		c.registration();
		c.display();		
	}		
}