/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class DayScheduleFrontEnd {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			DaySchedule days = new DaySchedule();
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Welcome to the day planner system");
			boolean quit = false;
			while(quit == false)
			{
				//Prompts user
				System.out.println("Enter 1 to add an activity\n"
						+ "Enter 2 to remove an activity\n"
						+ "Enter 9 to quit");
				int choice = keyboard.nextInt();
				keyboard.nextLine();
				
				switch(choice)
				{
				//Adds an Activity
				case 1:
					System.out.println("Enter the activity's name");
					String name = keyboard.nextLine();
					System.out.println("Enter its start hour in military time");
					int starthr = keyboard.nextInt();
					keyboard.nextLine();
					System.out.println("Enter its end hour in military time");
					int endhr = keyboard.nextInt();
					keyboard.nextLine();
					days.AddActivity(new Activity(name,starthr,endhr));
					break;
				//Removes an Activity
				case 2:
					System.out.println("Enter the name of the activity to remove");
					name = keyboard.nextLine();
					days.RemoveActivity(name);
					break;
					//Quit
				case 9:
					quit = true;
					break;
				default:
					System.out.println("Invalid input");
				}
				//Prints Activities
				for(Activity activity:days.getActivities())
				{
					if(activity == null)
					{
						break;
					}
					System.out.println(activity.getName()+ " " + activity.getstartHour() + " " + activity.getendHour());
				}
			}
			System.out.println("Good bye!");
		}

	}


