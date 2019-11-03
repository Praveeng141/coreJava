package overriding;

public class Parent 
{
	public void method1()
	{
		System.out.println("From Parent_Method1()");
	}
	
	private final void method2()
	{
		System.out.println("From parent_Method2()");
	}
}


