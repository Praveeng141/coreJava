package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo  
{

	public static void main(String args[])
	{
		ArrayList<Author> arr=new ArrayList<Author>();
		
		
		arr.add(new Author("Neelima", "gajula","Thailand"));
		arr.add(new Author("praveen", "Kumar", "Hyderabad"));
		arr.add(new Author("venkateswarlu", "gajula", "thanikella"));
		arr.add(new Author("naveen", "Kumar", "Bangalore"));
		
		Collections.sort(arr);
		
		for(Author s1:arr)
		{
			System.out.println(s1.toString());
		}
		
	}
}
