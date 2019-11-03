package Collections;

public class Author implements Comparable<Author> {

	String firstName;
	String lastName;
	String place;
	
	public Author(String firstName, String lastName, String place)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.place=place;
	}
	
	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public int compareTo(Author o) {
		// TODO Auto-generated method stub
		return this.lastName.compareTo(o.lastName);
	}
	
	public String toString()
	{
		return firstName+" "+lastName+" "+place;
		
	}
}
