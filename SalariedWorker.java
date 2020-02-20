import java.util.*;

class Worker
{
	String name;
	int salary_rate = 8;
	public int ComPay(int hours)
	{
	int sal = hours*salary_rate;
	return sal;
	}
}

class DailyWorker extends Worker
{
	public int ComPay(int hours)
	{
	int sal = hours*salary_rate;
	return sal;
	}
}

public class SalariedWorker extends Worker
{
	public int ComPay()
	{
	int sal = 40*salary_rate;
	return sal;
	}
	public static void main(String args[])
	{
		DailyWorker d = new DailyWorker();
		SalariedWorker s = new SalariedWorker();
		int d_sal = d.ComPay(50);
		int s_sal = s.ComPay();
		System.out.println(d_sal);
		System.out.println(s_sal);

	}
}


	