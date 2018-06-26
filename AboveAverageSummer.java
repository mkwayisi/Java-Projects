/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class AboveAverageSummer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in); // Allows for keyboard input.
		
		System.out.println("Welcome to above average temperature tester program!");
		
		int[] x = new int[11]; // Limits the days to 10.
		
		for(int a=1;a<x.length;a++) // Recognizes temperature input
		{
			System.out.println("Enter the temperature for Day " +a);
			x[a] = keyboard.nextInt();
		}
		double avg = (x[1]+x[2]+x[3]+x[4]+x[5]+x[6]+x[7]+x[8]+x[9]+x[10])/10; // averages the temperatures.
		System.out.println("Average temperature was " +avg); // states average to user.
		System.out.println("The days that were above average were"); // lists the days above average temp
		for(int a=1;a<x.length;a++)
			{
			if(x[a]>avg) // Lets program know to include the temperatures above average.
				{
					System.out.println("Day " +a+" with " +x[a]); // Gives the day and the temperature above average.
				}	

			}
	
	System.out.println("Done!");
			
	}

}
