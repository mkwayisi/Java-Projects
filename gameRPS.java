import java.util.Scanner;
import java.util.Random;

public class Homework3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		Random generator = new Random();
		
		String player = "";
		String cpu = "";
		
	System.out.println("Welcome to Rock Paper Scissors! Best 2 out of 3");
	
		String restart = "Yes";
		
	while(restart.equalsIgnoreCase("yes"))
{
	int humanPoint = 0;
	int cpuPoint = 0;
	
	int roundCounter = 0;
	
	while(roundCounter < 3)
	{
		System.out.println("Enter \"rock\", \"paper\", \"scissors\" ");
		//Capture input
		String userInput = keyboard.nextLine();
		
		int computerValue = generator.nextInt(3);//0-2
		if(computerValue == 0)
		{
			cpu = "rock";
		}
		else if(computerValue == 1)
		{
			cpu = "paper";
		}
		else
		{
			cpu = "scissors";
		}
		
			if(userInput.equalsIgnoreCase("rock"))
			{
				if(cpu.equalsIgnoreCase("rock"))
				{
					//Tie
					System.out.println("Rock v. Rock");
					System.out.println("Tie");
				}
				else if(cpu.equalsIgnoreCase("paper"))
				{
					//Computer Wins
					System.out.println("Rock v. Paper");
					System.out.println("Computer Wins!");
					cpuPoint++;
				}
				else
				{
					//Player Wins
					System.out.println("Rock v. " +cpu);
					System.out.println("Player Wins!");
					humanPoint++;
				}
				roundCounter++;
			}
			else if(userInput.equalsIgnoreCase("paper"))
			{
				if(cpu.equalsIgnoreCase("paper"))
				{
					//Tie
					System.out.println("Paper v. Paper");
					System.out.println("Tie");
				}
				else if(cpu.equalsIgnoreCase("scissors"))
				{
					//Computer Wins
					System.out.println("Paper v. Scissors");
					System.out.println("Computer Wins!");
					cpuPoint++;
				}
				else
				{
					//Player Wins
					System.out.println("Paper v. " +cpu);
					System.out.println("Player Wins!");
					humanPoint++;
				}
				roundCounter++;
			}
			else if(userInput.equalsIgnoreCase("scissors"))
			{
				if(cpu.equalsIgnoreCase("scissors"))
				{
					//Tie
					System.out.println("Scissors v. Scissors");
					System.out.println("Tie");
				}
				else if(cpu.equalsIgnoreCase("rock"))
				{
					//Computer Wins
					System.out.println("Scissors v. Rock");
					System.out.println("Computer Wins!");
					cpuPoint++;
				}
				else
				{
					//Player Wins
					System.out.println("Scissors v. " +cpu);
					System.out.println("Player Wins!");
					humanPoint++;
				}
				roundCounter++;
			}
		else
		{
			{
			System.out.println("Wrong input.");
			System.out.println("Computer Wins!");
			cpuPoint++;
			}
		roundCounter++;
		}
}			//end of while
	{	
	if(cpuPoint > humanPoint)

	{
		//Computer Wins
		System.out.println("Computer Wins! Computer has a score of " + cpuPoint + " Player has a score of " +humanPoint);
	}
	else if(cpuPoint < humanPoint)
	{
		//Player Wins
		System.out.println("Player Wins! Computer has a score of " + cpuPoint + " Player has a score of " +humanPoint);
	}
	else if(cpuPoint == humanPoint)
	{
		//Tie
		System.out.println("It's a tie!");
	}
	System.out.print("Play again? \"Yes\" or \"No\"?");
	}
	restart = keyboard.nextLine();
			
}
	
	}

}
