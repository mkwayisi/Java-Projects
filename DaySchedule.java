/*
 * Mark Kwayisi
 */
public class DaySchedule {
	private Activity[] activities;
	
	public DaySchedule()
	{
		this.activities = new Activity[10]; 
	}
	public Activity[] getActivities()
	{
		return this.activities;
	}
	//Add an Activity
	public void AddActivity(Activity anActivities)
	{
		if(activities[activities.length-1] != null)
		{
			System.out.println("The movie database is full");
			return;
		}
		for(int i = 0; i<activities.length;i++)
		{
			if(activities[i] == null)
			{
				activities[i] = anActivities;
				break;
			}
		}
	}
	//Remove an Activity
	public void RemoveActivity(String aName)
	{
		int removeIndex = -1;
		for(int i = 0; i<activities.length;i++)
		{
			if(activities[i].getName().equalsIgnoreCase(aName))
			{
				removeIndex = i;
				break;
			}
		}
		if(removeIndex == -1)
		{
			System.out.println("The activity was not found");
		}
		else
		{
			for(int i = removeIndex; i<activities.length-1;i++)
			{
				activities[i] = activities[i+1];
			}
			activities[activities.length-1] = null;
		}
	}
}
