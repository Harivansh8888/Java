class Animal
{
	String s1 = "Animal";
}
class Dog extends Animal
{
	String s2 = "Dog";
	public static void main(String args[])
	{
		Dog d = new Dog();
		System.out.println(d.s1);
		System.out.println(d.s2);
	}
}