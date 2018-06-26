/*
 * Mark Kwayisi
 */
public class SimplePerson {

 String name;

public SimplePerson( )
{
	name = "No name yet";
}

	public SimplePerson(String initialName)
	{
		name = initialName;
	
	}
	public String getName( )
	{
		return name;
	}
	public void setName(String initialName)
	{
		name = initialName;
	}
	
	
	public void writeOutput( )
	{
		System.out.println("Name: "+ name);
	}
	public boolean hasSameName(SimplePerson otherSimplePerson)
	{
		int x = this.name.compareTo(otherSimplePerson.name);
		if (x==0)
		{
			return true;
		}
		return false;
	}
	
}
