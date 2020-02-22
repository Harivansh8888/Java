interface Info
{
	public void Division(int a);
	public void Modules(int b);
}

class Student implements Info
{
	String name;
	int div,mod;
	void Name(String n)
	{
	name=n;
	}
	public void Division(int a)
	{
	div=a;
	}
	public void Modules(int b)
	{
	mod=b;
	}
	void Display()
	{
	System.out.println("Name :"+name);
	System.out.println("Division :"+div);
	System.out.println("Modules :"+mod);
	}
}

public class MyStudentInfo
{
	public static void main(String args[])
	{
		Student s =new Student();
		s.Name("Raj");
		s.Division(5);
		s.Modules(8);
		s.Display();
	}
}