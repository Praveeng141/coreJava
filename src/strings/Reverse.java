package strings;

import java.util.ArrayList;
import java.util.List;

public class Reverse {

	String str1;
	List<Character> li=new ArrayList<>();
	
	public void reverse(String s)
	{
		str1=s;
		for(int i=0; i<str1.length(); i++)
		{
			for(int j=i+1; j<str1.length(); j++)
			{
				if(str1.charAt(i)==str1.charAt(j))
				{
					li.add(str1.charAt(i));
				}
			}
		}
		
		for(Object obj:li)
		{
			System.out.print(obj);
		}
	}
	public static void main(String[] args) {
		
		Reverse re=new Reverse();
		
		String st="abcdefghidcba";
		re.reverse(st);

	}

}
