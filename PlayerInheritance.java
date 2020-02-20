import java.util.Scanner;
import java.io.*;

class Player
{
	Scanner sc = new Scanner(System.in);
	String name;
	String country;
	int age;
}

class Cricket_player extends Player
{
	int runs;
	void cricket()
	{
	System.out.println("Enter Name:");
	name = sc.nextLine();
	System.out.println("Enter Country Name:");
	country = sc.nextLine();
	System.out.println("Enter Age:");
	age = sc.nextInt();
	System.out.println("Enter Runs Scored:");
	runs = sc.nextInt();
	System.out.println("Name: "+ name);
	System.out.println("Country: "+ country);
	System.out.println("Age:"+ age);
	System.out.println("Runs: "+ runs);
	}
}

class Football_player extends Player
{
	int fgoals;
	void football()
	{
	System.out.println("Enter Name:");
	name = sc.nextLine();
	System.out.println("Enter Country Name:");
	country = sc.nextLine();
	System.out.println("Enter Age:");
	age = sc.nextInt();
	System.out.println("Enter Football Goals Scored:");
	fgoals = sc.nextInt();
	System.out.println("Name: "+ name);
	System.out.println("Country: "+ country);
	System.out.println("Age:"+ age);
	System.out.println("Goals in Football: "+ fgoals);
	}
}

class Hockey_player extends Player
{
	int hgoals;
	void hockey()
	{
	System.out.println("Enter Name:");
	name = sc.nextLine();
	System.out.println("Enter Country Name:");
	country = sc.nextLine();
	System.out.println("Enter Age:");
	age = sc.nextInt();
	System.out.println("Enter Hockey Goals Scored:");
	hgoals = sc.nextInt();
	System.out.println("Name: "+ name);
	System.out.println("Country: "+ country);
	System.out.println("Age:"+ age);
	System.out.println("Goals in Hockey; "+ hgoals);
	}
}

public class PlayerInheritance
{
	public static void main(String args[])
	{
	Cricket_player c = new Cricket_player();
	c.cricket();
	Football_player f = new Football_player();
	f.football();
	Hockey_player h = new Hockey_player();
	h.hockey();
	}
}