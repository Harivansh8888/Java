interface Test {
	public int square(int a);
}

class Airthematic implements Test {
	 public int square(int a)
	{
		return (a*a);
	}
}
public class ToTestInt extends Airthematic  {
	public static void main(String args[])
	{
		Airthematic obj = new Airthematic();
		System.out.println(obj.square(4));
	}
}
