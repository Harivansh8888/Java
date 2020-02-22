interface Area
{
	static float pi = 3.14f;
	public float calculateArea(int  a,int b);
}

class Rectangle implements Area
{
	public float calculateArea(int a,int b)
	{
		return (a*b);
	}
}

class Circle implements Area
{
	public float calculateArea(int a,int b)
	{
		return (pi*a*a);
	}
}

public class AreaInterface
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		System.out.println("Area of Rectangle : " + r.calculateArea(3,5));
		System.out.println("Area of Circle : " + c.calculateArea(7,0));
	}
}