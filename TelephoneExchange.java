import java.io.*;
import java.util.Scanner;

class Call
{
	float duration;
	String type;
	float rate()
	{
		if(type.equals("urgent"))
			return 4.5f;
		else if(type.equals("lightning"))
			return 3.5f;
		else if(type.equals("ordinary"))
			return 3f;
		else
			return -1f;
	}
}

class Bill extends Call
{
	float amount;
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Call Type(urgent,lightning,ordinary): ");
		type = sc.next();
		System.out.println("Enter Call duration:");
		duration = sc.nextFloat(); 
	}
	void calculate()
	{
		if(duration<=1.5)
		{
			amount = rate()*duration + 1.5f;
		}
		else if(duration<=3)
		{
			amount = rate()*duration + 3f;
		}
		else if(duration<=5)
		{
			amount = rate()*duration + 5f;
		}
		else
		{
			amount = rate()*duration + 6f;
		}
	}
	void print()
	{
		System.out.println("Call Type: "+ type);
		System.out.println("Duration: "+ duration);
		System.out.println("Charge: "+ amount);
	}
}

class TelephoneExchange
{
	public static void main(String[] args)
	{
		Bill b =new Bill();
		b.read();
		b.calculate();
		b.print();
	}
}