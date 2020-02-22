interface A
{
	public void Message1();
	public void Message2();
}

public class MyClassExp5 implements A
{
	public void Message1()
	{
		System.out.println("Hello !");
	}
	public void Message2()
	{
		System.out.println("My name is Harivansh");
	}
	public static void main(String args[])
	{
		MyClassExp5 obj = new MyClassExp5();
		obj.Message1();
		obj.Message2();
	}
}