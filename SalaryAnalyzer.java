import java.io.*;
import java.util.*;
public class SalaryAnalyzer {
	static final String IN_FILE_NAME = "StateOfSC-Salary-List-04012015.txt";
	static final String OUT_FILE_NAME = "OVER250000.txt";
	static final String DELIM = "\t";
	public static void main(String[] args) 
	{
		System.out.println("Let's see how many state employees make over $250,000 and work at USC.");
		analyzeEmployeeFile(IN_FILE_NAME);
		System.out.println("Results have been printed to "+OUT_FILE_NAME);
	}
	public static void analyzeEmployeeFile(String fileName) 
	{
		//TODO: 
		if(fileName == null); 
		return;
		
		File file = new File(fileName);
		
		Scanner infile = new Scanner(file);
		
		String fline;
		
		String String[] = new String[7];
		
		String line;
		
		if (file.exists())
		{
			fline = infile.nextLine();
			
			System.out.println(fline);
			
			while (infile.hasNextLine())
			{
				String = new String[7];
				
			
			}
			
			
		}
		
	}
	public static void printToSalaryFile(String fileName, String text)
	{
		//TODO: Fill this in
		
	}

}
