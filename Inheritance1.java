public class Inheritance1
{
	public void walking()
	{
	System.out.println("is walking");
	}
	private void running()
	{
	System.out.println("is running");
	}
}

class Human extends Inheritance1
{
	public void Man()
	{
	System.out.print("Man ");
	}
	public static void main(String args)
	{
		Human obj = new Human();
		obj.Man();
		obj.walking();
		obj.Man();
		obj.running();
	}
}