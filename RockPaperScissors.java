/*
 * Mark Kwayisi
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in); // Scans keyboard input.
		
		Random generator = new Random(); // randomly generates computer response
		
		String hmnPlayer = ""; // recognizes the user's input choice .
		String cpuPlayer = ""; // recognizes the cpu's input choice .
		
	System.out.println("Rock, Paper, or Scissors?"); // Prompts users choice of rock, paper, scissors?
	
		String reset = "Yes"; // Restarts the game after each round 
		
	while(reset.equalsIgnoreCase("Yes")) // Keeps Score .
{
	int hmnPlayerScore = 0; // Makes the initial user score 0.
	int cpuPlayerScore = 0; // Makes the initial cpu score 0.
	
	int roundScore = 0; // sets the scoreboard at 0.
	
	while(roundScore < 3) // Sets the rounds of the game to 3.
	{
		System.out.println("Enter \"Rock\", \"Paper\", \"Scissors\" "); // Here the user inputs their selection.
		//Capture input
		String hmnInput = keyboard.nextLine(); // recognizes human input for comparison to random cpu selection.
		
		int cpuValue = generator.nextInt(3); //0-2
		if(cpuValue == 0) // If CPU randomly chooses 0, it will correspond to a "Rock" selection.
		{
			cpuPlayer = "Rock";
		}
		else if(cpuValue == 1) // If CPU randomly chooses 1, it will correspond to a "Paper" selection.
		{
			cpuPlayer = "Paper";
		}
		else // If the CPU does not generate 0 or 1, then it will correspond to a "Scissors" selection. 
		{
			cpuPlayer = "Scissors"; 
		}
		
			if(hmnInput.equalsIgnoreCase("Rock")) // Recognizes human Rock input.
			{
				if(cpuPlayer.equalsIgnoreCase("Rock")) // recognized cpu generated rock input.
				{
															
					System.out.println("Rock v. Rock"); // Causes Two Rocks to be a draw .
					System.out.println("Draw!");
				}
				else if(cpuPlayer.equalsIgnoreCase("Paper")) // Recognizes cpu Paper input.
				{
					//Computer Wins
					System.out.println("Rock v. Paper"); // Causes user to lose if the pit Rock against Paper.
					System.out.println("You Lose!");
					cpuPlayerScore++; // Adds to CPU Score
				}
				else
				{
					//Player Wins
					System.out.println("Rock v. " +cpuPlayer); // Causes user to win if they pit Rock vs Scissors
					System.out.println("You Win!");
					hmnPlayerScore++; // Adds to user score !
				}
				roundScore++; // Keeps track of user and player scores. // Process repeats until Line 130.
			}
			else if(hmnInput.equalsIgnoreCase("Paper"))
			{
				if(cpuPlayer.equalsIgnoreCase("Paper"))
				{
					
					System.out.println("Paper v. Paper");
					System.out.println("Draw");
				}
				else if(cpuPlayer.equalsIgnoreCase("scissors"))
				{
					//Computer Wins
					System.out.println("Paper v. Scissors");
					System.out.println("You Lose!");
					cpuPlayerScore++;
				}
				else
				{
					//Player Wins
					System.out.println("Paper v. " +cpuPlayer);
					System.out.println("You Win!");
					hmnPlayerScore++;
				}
				roundScore++;
			}
			else if(hmnInput.equalsIgnoreCase("scissors"))
			{
				if(cpuPlayer.equalsIgnoreCase("scissors"))
				{
					
					System.out.println("Scissors v. Scissors");
					System.out.println("Draw!");
				}
				else if(cpuPlayer.equalsIgnoreCase("rock"))
				{
					
					System.out.println("Scissors v. Rock");
					System.out.println("You Lose!");
					cpuPlayerScore++;
				}
				else
				{
					
					System.out.println("Scissors v. " +cpuPlayer);
					System.out.println("You Win!");
					hmnPlayerScore++;
				}
				roundScore++;
			}
		else
		{
			{
			System.out.println("Invalid Input.");
			System.out.println("You Lose!");
			cpuPlayerScore++;
			}
		roundScore++;
		}
}			//While Ends Here
		{	
		if(cpuPlayerScore > hmnPlayerScore)

		{
		// CPU Victory!
		System.out.println("Computer Wins! Computer has a score of " + cpuPlayerScore + " Player has a score of " +hmnPlayerScore);
		}
		else if(cpuPlayerScore < hmnPlayerScore)
		{
		//Player Victory !
		System.out.println("Player Wins! Computer has a score of " + cpuPlayerScore + " Player has a score of " +hmnPlayerScore);
		}
		else if(cpuPlayerScore == hmnPlayerScore)
		{
		//Draw between User and CPU 
		System.out.println("It's a Draw!");
		}
		System.out.print("Play again? \"Yes\" or \"No\"?"); // Prompts the user to play again.
		}
	reset = keyboard.nextLine();
	
}
	
	}

}
