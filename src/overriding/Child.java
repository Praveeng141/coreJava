package overriding;

class Child extends Parent
{
	public void method1()
	{
		System.out.println("From Child_Method1()");
	}
	
	public final void method2(int a)
	{
		System.out.println("From child_method2()"+a);
	}
	public void method3()
	{
		System.out.println("From child_method3()");
	}
}