/*
 * Mark Kwayisi 
 */
public class Activity {
	private String Name;
	private int startHour;
	private int endHour;
	//Constructors
	public Activity()
	{
		this.Name = "";
		this.startHour = 0;
		this.endHour = 0;
	}
	public Activity(String aName, int astartHour, int anendHour)
	{
		this.Name = aName;
		this.startHour = astartHour;
		this.endHour = anendHour;
	}
	//Accessors
	public String getName()
	{
		return this.Name;
	}
	public int getstartHour()
	{
		return this.startHour;
	}
	public int getendHour()
	{
		return this.endHour;
	}
	//Mutators
	public void setName(String aName)
	{
		this.Name = aName;
	}
	public void setstartHour(int astartHour)
	{
		if(astartHour > -1 && astartHour < 24)
		{
			this.startHour = astartHour;
		}
	}
	public void setendHour(int anendHour)
	{
		if(anendHour >-1  && anendHour <= 24)
		{
			this.endHour = anendHour;
		}
	}
	public String toString()
	{
		return "Name of activity: " + this.Name + "Start time: " + this.startHour + "End time: " + this.endHour;
				
	}
	

}


