/*
 * Mark Kwayisi
 */
import java.util.Scanner;
import java.lang.*;
public class Palindrominer {

	public static boolean isPalindrome(String p)
	
	{ // If Length Is = to 0 or 1 Then The String Is A Palindrome.
		if(p.length() == 0 || p.length() == 1)
			return true;
		if(p.charAt(0) == ' ' )
			return isPalindrome(p.substring(1, p.length()-1));

		if( p.charAt(p.length()-1) == ' ' )
			return isPalindrome(p.substring(1, p.length()-1));
	
		// Checks First And Last Characters To See If They Are The Same. 
		char x =Character.toUpperCase(p.charAt(0));
		char y = Character.toUpperCase(p.charAt(p.length()-1));

	if(x == y)   
	return isPalindrome(p.substring(1, p.length()-1));

	// Voids Program If A String Is Not Found
	return false;
	}

	public static void main(String[]args)
	{
	   // Allows For User Input And Prompts User For Word
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a word and I will determine if it is a palindrome!!");
	String string = scanner.nextLine();
	// If Function Returns True Then The String Is A Palindrome, Otherwise It Is Not.
	  
	if(isPalindrome(string) == true)
	System.out.println("The word " + string + " is a palindrome!");
	else
	System.out.println("The word " + string + " is not a palindrome!");
	}
	



	}


