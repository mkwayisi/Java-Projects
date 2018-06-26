/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class SecretWord {
	
	Scanner keyboard = new Scanner(System.in); // Allows for user input
	
	private String secretWord; // Word user has to guess
	private String hintWord; // The word with some of the letters revealed
	
	private int numberOfTurns;{} // number of guesses
	
	public SecretWord() // Sets secret word to Outstanding
	{
		this.secretWord = "Outstanding";
		this.hintWord = "***********"; // Sets asterisks for each letter
		this.numberOfTurns = 0;	// Initializes turn value
	}
	public SecretWord(String aSecretWord, String aHintWord, int aNumberOfTurns)
	{
		this.secretWord = aSecretWord; // Constructor
		this.hintWord = aHintWord;
		this.numberOfTurns = aNumberOfTurns;
	}	
		
	

public String getSecretWord() //Returns
{
	return this.secretWord;
}
public String getHintWord()
{
	return this.hintWord;
}
public int getNumberOfTurns()
{
	return this.numberOfTurns;
}
public void secretWord(String aSecretWord)
{
	if(this.secretWord != "Outstanding" )
	{
		System.exit(0);
	}
}
public void hintWord (String aHintWord)
{
	this.hintWord = aHintWord;
}
public void setNumberOfTurns (int aNumberOfTurns)
{
	if(this.numberOfTurns <= 5)
	{
		this.numberOfTurns = aNumberOfTurns;
	}
}
public void guessLetter(char guess)
	{
		char[] guessLetter = secretWord.toCharArray();
		for(int z=0; z<secretWord.length();z++)
		{
		
		}
	}
	
}

	

	
