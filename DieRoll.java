/*
 * Mark Kwayisi
 */
import java.util.Scanner; // Brings in keyboard .
import java.util.Random; // Allows for random numbers .

public class DieRoll {

	public static final int DICE_DIGIT = 6; // Constants
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in); // Allows for keyboard input from user .
	
		Random g = new Random(); // Picks Random # . 
		
		
		
		System.out.println("Enter a number, the dice will roll that many times."); // Prompts User.
		
		int attemptRoll = keyboard.nextInt(); // Rolls the denoted number of rolls
		
		int m = 0; // Holds the average .
		int one = 0;
		
		int two = 0;
		
		int three = 0;
		
		int four = 0;
		
		int five = 0;
		
		int six = 0;
		
		while(m < attemptRoll)
		{
			 int unknownRoll = g.nextInt(DICE_DIGIT);
			 
			unknownRoll = unknownRoll + 1; // Causes the dice to roll 1-6 for a 6 sided die.
			
			m++;
			
			 System.out.println(unknownRoll + " was rolled");
			 
			
			
			
			 
			if(attemptRoll == 1)
			{
			one = one + 1; // Adds one to each time a 1 is rolled.
			
			}
			
			if(attemptRoll == 2)
			{
			two = two + 1; // Adds one to each time a 2 is rolled.
			
			}
			
			if(attemptRoll == 3)
			{
			three = three + 1; // Adds one to each time a 3 is rolled.
			
			}
			
			if(attemptRoll == 4)
			{
			four = four + 1; // Adds one to each time a 4 is rolled.
			
			}
			
			if(attemptRoll == 5)
			{
			five = five + 1; // Adds one to each time a 5 is rolled.
			
			}
			
			if(attemptRoll == 6)
			{
			six = six + 1; // Adds one to each time a 6 is rolled.
			}
		
			
		System.out.println("One: " + one); // Prints the number of times one was rolled .
		
		System.out.println("Two: " + two); //Prints the number of times two was rolled .
		
		System.out.println("Three " + three); //Prints the number of times three was rolled .
		
		System.out.println("Four: " + four); //Prints the number of times four was rolled .
		
		System.out.println("Five: " + five); //Prints the number of times five was rolled .
		
		System.out.println("Six " + six); //Prints the number of times six was rolled .
		}

	}
}
	