/*
 * Mark Kwayisi
 */
import java.io.*;
import java.util.Scanner;
public class DangerZone {
	private String replacementWord;
	private static String newSong = "";
	static final String DELIM = "\t";
public static String dangerzone(String aFilename)
{
	File file = new File ("dangerzone.txt");
	
	Scanner keyboard = new Scanner(System.in);
	String input = keyboard.nextLine();
 try
	{
		
		Scanner fileReader = new Scanner(new File(aFilename));
		
		while(fileReader.hasNext())
		{
			String currToken = fileReader.next();
			if(currToken.toUpperCase().contains("Danger"))
			{
			newSong = newSong+ DELIM + input + DELIM;
			}
			else
			{
				newSong = newSong + DELIM + currToken + DELIM;
			}
		}
		fileReader.close();
		System.out.println();
		printTodangerzoneFile("dangerzone2.txt", newSong);
	}
	catch (Exception e){
		System.out.println(e.getMessage());
	}
return aFilename;
	
}
public static void printTodangerzoneFile(String fileName, String text)
{
	try
	{
		PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
		pw.println(text);
		pw.close();
	}
	catch (IOException e){
	System.out.println(e.getMessage());
}


{

	}
}
}

