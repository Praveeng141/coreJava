package exceptions;

import java.io.FileNotFoundException;

public class Arithmatic {
	
	public void arithmaticException() 
	{
		try
		{
		int a=2/0;
		
		System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not divicible by Zero");
		}
		catch(Exception ex)
		{
			System.out.println("From Exception");
		}
		catch(Throwable t)
		{
			System.out.println("From throwable");
		}

	}

	public static void main(String[] args) {
		Arithmatic ar=new Arithmatic();
	
		ar.arithmaticException();
		
	}

}
