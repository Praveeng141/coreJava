package overloading;

public class Example {


	public  String method1(String s)
	{
		System.out.println("from method1(String s) "+s);
		return s;
	}
	
	public void method1(int a)
	{
	
		System.out.println("from method1(int a) "+a);
	}
}
