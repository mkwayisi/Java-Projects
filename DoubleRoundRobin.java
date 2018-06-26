/*
 * Mark Kwayisi
 */

import java.util.Random; // Sets up program to generate random outcomes.

	public class DoubleRoundRobin
{
		public int combatant;
		public String abilities;
		
		public DoubleRoundRobin next; // Next link reference .
		
		public DoubleRoundRobin(int combatant, String abilities) // Constructor for the participants and the decisions that they make.
		{
			this.abilities = abilities;
			this.combatant = combatant;
		}
		

		public DoubleRoundRobin() {
			// TODO Auto-generated constructor stub
		}


		public void display()
		{
			System.out.println("Player " +combatant+ "uses " + abilities);
		}
		
		public int toInt()
		{
			return combatant;
		}
		public String toString()
		{
			return abilities;
		}
		
		class DoubleRoundRobinList // References the first link in the list
		{
			public DoubleRoundRobin firstLink;
			
			DoubleRoundRobinList()
			{
				firstLink = null; // Shows that this link starts as null because no value has been added.
			}
			
			
			
			public boolean isEmpty(){
				        
			return (firstLink == null);
			
		}
	}

		
	
	public static void main(String[] args)
	{
		
		Random generator = new Random(); // Generates Random Response
		
		String combatantA;
		String combatantB;
		String combatantC;
		
		DoubleRoundRobin theDoubleRoundRobin = new DoubleRoundRobin();
		System.out.println("Welcome to the Rock Paper Scissors Tournament!");
		System.out.println("We have 3 players. Let's BEGIN!");
		System.out.println("THIS IS TOUGH !! HAVE MERCY ON MY GRADE !");
		
		// Sets the combatants scores to 0.
		int combatantOne = 0;
		int combatantTwo = 0;
		int combatantThree = 0;
		
		//Sets the scoreboard at 0.
		int scoreBoard = 0;
	
		int cOne = generator.nextInt(3); //0-2
		if(cOne == 0) // If CPU randomly chooses 0, it will correspond to a "Rock" selection.
		{
			combatantA = "Rock";
		}
		else if(cOne == 1) // If CPU randomly chooses 1, it will correspond to a "Paper" selection.
		{
			combatantA = "Paper";
		}
		else // If the CPU does not generate 0 or 1, then it will correspond to a "Scissors" selection. 
		{
			combatantA = "Scissors"; 
		}
		
		int cTwo = generator.nextInt(3); //0-2
		if(cTwo == 0) // If CPU randomly chooses 0, it will correspond to a "Rock" selection.
		{
			combatantB = "Rock";
		}
		else if(cTwo == 1) // If CPU randomly chooses 1, it will correspond to a "Paper" selection.
		{
			combatantB = "Paper";
		}
		else // If the CPU does not generate 0 or 1, then it will correspond to a "Scissors" selection. 
		{
			combatantB = "Scissors"; 
		}
		
		int cThree = generator.nextInt(3); //0-2
		if(cThree == 0) // If CPU randomly chooses 0, it will correspond to a "Rock" selection.
		{
			combatantC = "Rock";
		}
		else if(cThree == 1) // If CPU randomly chooses 1, it will correspond to a "Paper" selection.
		{
			combatantC = "Paper";
		}
		else // If the CPU does not generate 0 or 1, then it will correspond to a "Scissors" selection. 
		{
			combatantC = "Scissors"; 
		}
		
	}
	
}

