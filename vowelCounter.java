/*
 * Mark Kwayisi
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class vowelCounter {
	
	public static void checkSeries () throws IOException // Throw Exception
	{
		
		File file = new File("blah.txt"); // Uses Document to Scan Text.
		Scanner inputFile = new Scanner(file);
		int aeiou = 0 ;
	
		
		String token; // searches for vowel and ignores the consonants.
		char [] fileLine = inputFile.nextLine().toCharArray();
		int consonants = fileLine.length-aeiou;
		while(inputFile.hasNextLine())
		{
			int temp = 0;
		
			token = inputFile.nextLine();  
			token = token.toLowerCase();
			for(char x = 0; x < fileLine.length-1;x++) // finds and adds each vowel in the consecutive order.
			{
				if(fileLine[x] == 'a')
				{
				temp = 1;
				}
				if(fileLine[x] == 'e' && temp == 1 )
				{
				temp = 2;
				}
				if(fileLine[x] == 'i' && temp == 2)
				{
				temp = 3;
				}
				if(fileLine[x] == 'o' && temp == 3)
				{
				temp = 4;
				}
				if(fileLine[x] == 'u' && temp == 4)
				{
				temp = 5;
				}
				if(temp == 5)
				{
					aeiou++;
					temp = 0;
				}
			}
		}
			

	inputFile.close();
 //Prints the number of times the vowels were found.
	System.out.println("The file blah.txt has 'aeiou' in order " + aeiou++ + " times");
	
	



		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prints Exception if folder is misplaced.
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






