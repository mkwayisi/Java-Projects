/*
 * Mark Kwayisi
 */
import java.*;
public class symbolChecker {
	
	
	
		public static boolean symbolChecker (String string)
		{
		Stacked sal = new Stacked();
		for(int a = 0; a < string.length(); a++)
		{
		char y = string.charAt(a);
		if(y == '(' || y == '{' || y == '<')
		sal.push(y);
		else if(y == ')' || y == '}' || y == '>')
		{
		char topElement = sal.pop();
		if(topElement == '(' && y == ')') continue;
		else if(topElement == '{' && y == '}') continue;
		else if(topElement == '<' && y == '>') continue;
		else
		return false;
		}
		boolean quotePushed = false;
		if(y == '"' && quotePushed == false)
		{
		sal.push(y);
		quotePushed = true;
		}
		else if(y == '"' && quotePushed == true)
		{
		char topElement = sal.pop();
		if(topElement != y)
		return false;
		quotePushed = false;

		}   
		}
		if(!sal.isEmpty())
		return false;
		return true;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.out.println("True means that the string is well formed, while false means the string is not well formed.");
			
			System.out.print("The string () is: ");
			if(symbolChecker("()"))
			System.out.println("true");
			else
			System.out.println("false");
			  
			System.out.print("The string <<<>>> is: ");
			if(symbolChecker("<<<>>>"))
			System.out.println("true");
			else
			System.out.println("false");

			System.out.print("The string {(\"tacos\")} is: ");
			if(symbolChecker("{(\"tacos\")}"))
			System.out.println("true");
			else
			System.out.println("false");
			  
			System.out.print("The string if(pass == true){return Òyay!Ó;} is: ");
			if(symbolChecker("if(pass == true){return Òyay!Ó;}"))
			System.out.println("true");
			else
			System.out.println("false");
			  
			System.out.print("The string abcd is: ");
			if(symbolChecker("abcd"))
			System.out.println("true");
			else
			System.out.println("false");

			System.out.print("The string \"\"\" is: ");
			if(symbolChecker("\"\"\""))
			System.out.println("true");
			else
			System.out.println("false");

			System.out.print("The string <(Ò) is: ");
			if(symbolChecker("<(Ò)"))
			System.out.println("true");
			else
			System.out.println("false");

			System.out.print("The string :-) is: ");
			if(symbolChecker(":-)"))
			System.out.println("true");
			else
			System.out.println("false");

			System.out.print("The string <3 is: ");
			if(symbolChecker("<3"))
			System.out.println("true");
			else
			System.out.println("false");

			System.out.print("The string (<{ÒÓ}> is: ");
			if(symbolChecker("(<{ÒÓ}>"))
			System.out.println("true");
			else
			System.out.println("false");
			}


		

	}


