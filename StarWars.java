/*
 * Mark Kwayisi
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StarWars {
	public static final String delim = "\t";
	public static void checkSeries () throws IOException // Throw Exception
	{
		
		File file = new File ("StarWarsNewHopeScript.txt"); // Uses Document to Scan Text.
		Scanner inputFile = new Scanner(file);
		int wookie = 0 ;
		int jabba = 0;
		int force = 0;
		int DeathStar= 0;
		String token;
		while ( inputFile.hasNext () )
		{
			token = inputFile.next();  
			token = token.toLowerCase();
			if(token.contains("wookie"))//Well formed line
			{
				wookie++;
			}
			if(token.contains("death"))//Well formed line
			{
				token = inputFile.next();  
				token = token.toLowerCase();
				if(token.contains("star"))
					DeathStar++;
			}

			if(token.contains("jabba"))//Well formed line
			{
			
				jabba++;
			}

			if(token.contains("force"))//Well formed line
			{
				
				force++;
			}


		}
	

	inputFile.close();
 //Prints the number of times a word was found.
	System.out.println("Scanning Star Wars...");
	System.out.println("The number of times Wookie was used is " + wookie++);
	System.out.println("The number of times Jaba was used is " + jabba++);
	System.out.println("The number of times Force was used is " + force++) ;
	System.out.println("The number of times Death Star was used is "+ DeathStar++);





}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prints Exception if folder is missplaced.
		try
		{
			checkSeries();
		}
		catch (IOException ioe)
		{
			System.out.println("Exception!");

		}

	}

}
