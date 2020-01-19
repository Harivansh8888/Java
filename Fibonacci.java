public class Fibonacci
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,a,b,c;
		a=0;
		b=1;
		System.out.println(a);
		System.out.println(b);
		for(i=2;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
