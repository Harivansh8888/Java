class OuterClass
{
	int num;
	private class InnerClass
	{
		public void print()
		{
			System.out.println("This is inner class");
		}
	}
	
	void displayInner()
	{
		InnerClass inner = new InnerClass();
		inner.print();
	}
}

public class InnerOuterExample
{
	public static void main(String args[])
	{
		OuterClass outer = new OuterClass();
		outer.displayInner();
	}
}