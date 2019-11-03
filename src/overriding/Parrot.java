package overriding;

class Birds
{
	public String eats()
	{
		//System.out.println("Birds eats grains and fruits");
		return "Birds eats grains and fruits";
	}
	
	public int eats(int a)
	{
		return a;
	}
	
	public void color()
	{
		System.out.println("Birds are of different colors");
	}
}
public class Parrot extends Birds {
	
	public String eats() 
	{
		//System.out.println("Parrot eats fruits");
		return "Parrot eats fruits";
	}
	

	public static void main(String[] args) 
	{
		Birds b=new Birds();
		System.out.println(b.eats());
		System.out.println(b.eats(10));
		
		Birds p=new Parrot();
		System.out.println(p.eats());
		System.out.println(p.eats(20));
		p.color();
	}

}
