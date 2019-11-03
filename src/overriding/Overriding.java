package overriding;

public class Overriding {

	public static void main(String[] args) 
	{
		Parent p=new Parent();
		Parent ch=new Child();
		Child ch1=new Child();
		//Child c=(Child) new Parent(); Parent cannot be cast to overriding.Child
		
		//prints From parent_Method1()
		p.method1();
		//prints From parent_Method2()
		p.method2();
		
		//prints From parent_method1()
		ch.method1();
		
		int a=10;
		ch1.method2(a);
		//prints From child_method2()
		ch.method2();
		
		ch1.method3();
	}

}
