/*
 * Mark Kwayisi
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FinalGradeCalculator {
	// Private doubles assign each grade to decimal.
		private static double labAssignment; 
		private static double homework;
		private static double labtestOne;
		private static double labtestTwo;
		private static double examOne;
		private static double examTwo;
		private static double FinalExam;
		private static double extraCredit;
		private static double FinalGrade;
		
		public FinalGradeCalculator()
		{
			this.labAssignment = 0.0; // Stores each grade for calculation.
			this.homework = 0.0;
			this.labtestOne = 0.0;
			this.labtestTwo = 0.0;
			this.examOne = 0.0;
			this.examTwo = 0.0;
			this.FinalExam = 0.0;
			this.extraCredit = 0.0;
		}
		
		public static void main(String[] args) 
		{
			
		
		

		Scanner fileReader = null;
		try {
			fileReader = new Scanner(new File("grades.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			while(fileReader.hasNext())
			{
				String fileLine = fileReader.nextLine();
				if(fileLine.equalsIgnoreCase("Labs"))
					{
						while(fileReader.hasNextInt())
						{
							labAssignment+= Integer.parseInt(fileReader.nextLine());
						}
					}
				if(fileLine.equalsIgnoreCase("Lab Test One"))
				{
					while(fileReader.hasNextInt())
					{
						labtestOne+= Integer.parseInt(fileReader.nextLine());
					}
				}		if(fileLine.equalsIgnoreCase("Lab Test Two"))
				{
					while(fileReader.hasNextInt())
					{
						labtestTwo+= Integer.parseInt(fileReader.nextLine());
					}
				}		if(fileLine.equalsIgnoreCase("Exam One"))
				{
					while(fileReader.hasNextInt())
					{
						examOne+= Integer.parseInt(fileReader.nextLine());
					}
				}		if(fileLine.equalsIgnoreCase("Exam Two"))
				{
					while(fileReader.hasNextInt())
					{
						examTwo+= Integer.parseInt(fileReader.nextLine());
					}
				}		if(fileLine.equalsIgnoreCase("Final Exam"))
				{
					while(fileReader.hasNextInt())
					{
						FinalExam+= Integer.parseInt(fileReader.nextLine());
					}
					if(fileLine.equalsIgnoreCase("Extra Credit"))
					{
						while(fileReader.hasNextInt())
						{
							extraCredit+= Integer.parseInt(fileReader.nextLine());
						}}}}
			calculateFinalGrade();
			printFinalGrade();
					}
					
				
		public static void calculateFinalGrade () // Calculates the final grade from the inputs and prints out the final along with a letter grade.
			{
				FinalGrade =  (labAssignment*.2) + (homework*.3) + (labtestOne*.1) + (labtestTwo*.1) + (examOne*.1) + (examTwo*.1) + (FinalExam*.1) + (extraCredit*.02);
			}
		public static void printFinalGrade ()
			{
				String Grade;
				if(FinalGrade >= 90 && FinalGrade <= 100 )
					{
						Grade = "A";
					}
				else if(FinalGrade >= 85 && FinalGrade <= 89)
					{
						Grade = "B+";
					}
				else if(FinalGrade >= 80 && FinalGrade <=84)
					{
						Grade = "B";
					}
				else if(FinalGrade >= 75 && FinalGrade <=79)
					{
						Grade = "C+";
					}
				else if(FinalGrade >= 70 && FinalGrade <=74)
					{
						Grade = "C";
					}
				else if(FinalGrade >= 65 && FinalGrade <=69)
				{
					Grade = "D+";
				}
				else if(FinalGrade >= 60 && FinalGrade <=64)
				{
					Grade = "D";
				}
				else
					{
						Grade = "F";
					}

		System.out.println("Your final grade is " + FinalGrade + " " + Grade); // Displays final grade and grade letter.
	
	}
}


