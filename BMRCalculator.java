/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class BMRCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the BMR Calculator!"); // Introduces user to BMR calculator.
		
		System.out.println("Are you male or female?"); //Prompts user to indicate their gender.
		
		Scanner keyboard = new Scanner(System.in); // Allows for input
		
		Scanner input = new Scanner(System.in);
		
		String gender = keyboard.next(); // Sets up gender options for user input
		
		System.out.println("What is your height(inches)?"); // Asks for user height.
		
		double height = keyboard.nextDouble(); 
		
		System.out.println("What is your weight(pounds)?"); // Asks for user weight
		
		double weight = keyboard.nextDouble();
		
		System.out.println("What is your current age(years)"); // Asks for user age
		
		double age = keyboard.nextDouble();
		
		System.out.println("Describe your lifestyle as one of the following: Sedentary, Somewhat Active, Active, Highly Active.");
		
		String lifestyle = keyboard.next(); // Sets up optional input for the type of lifestyle the user leads.
		
		keyboard.close(); // closes keyboard input.
		
		double bmr = 0;
		
		
		if (gender.equalsIgnoreCase("male")) // If the user selects male, this is how the bmr will be calculated
		{
		bmr = 66 + (6.3 * weight) + 12.9 * height - (6.8 * age);
		}
		else if (gender.equalsIgnoreCase("female")) // If the user selects female, this is how bmr will be calculated
		{
		bmr = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		}
		if(lifestyle.equalsIgnoreCase("Sedentary")) // If the user leads a sedentary lifestyle, bmr is multiplied by 1.2.
		{
		bmr = bmr * 1.2;
		}
		else if (lifestyle.equalsIgnoreCase("Somewhat Active")) // If the user leads a somewhat active lifestyle, bmr is multiplied by 1.3.
		{
		bmr = bmr * 1.3;
		}
		else if (lifestyle.equalsIgnoreCase("Active")) // If the user leads an active lifestyle, bmr is multiplied by 1.4.
		{
		bmr = bmr * 1.4;
		}
		else if (lifestyle.equalsIgnoreCase("Highly Active")) // If the user leads an highly active lifestyle bmr is multiplied by 1.5.
		{
		bmr = bmr * 1.5;
		}
		
		System.out.println("Your BMR is " + bmr + " calories!"); // Prints out the users bmr based upon the data they entered.
	}
}


