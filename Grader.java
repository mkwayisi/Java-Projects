/*
 * Mark Kwayisi
 */
import java.util.Scanner;

public class Grader {
	// Private doubles assign each grade to decimal.
	private double Quiz1; 
	private double Quiz2;
	private double MidtermExam;
	private double FinalExam;
	private double FinalGrade;
	
	public Grader()
	{
		this.Quiz1 = 0.0; // Stores each grade for calculation.
		this.Quiz2 = 0.0;
		this.MidtermExam = 0.0;
		this.FinalExam = 0.0;
	}
	
	Scanner keyboard = new Scanner(System.in); // Allows for user input.

	public void setQuiz1 () // Prompts user for Quiz 1 grade and makes sure input is within parameters. If it is it is stored.
		{
			System.out.println("What is quiz 1?");
			this.Quiz1 = keyboard.nextDouble();
	if(Quiz1 < 0.0 || Quiz1 > 100.0)
		{
			System.out.println("This is invalid.");
			System.exit(0);
		}
		}
	
			
	public void setQuiz2 () // Prompts user for Quiz 2 grade and makes sure input is within parameters. If it is it is stored.
		{
			System.out.println("What is quiz 2?");
			this.Quiz2 = keyboard.nextDouble();
			if(Quiz2 < 0.0 || Quiz2 > 100.0)
			{
				System.out.println("This is invalid.");
			}
	
			}
		
	public void setMidtermExam () // Prompts user for Midterm grade and makes sure input is within parameters. If it is it is stored.
		{
			System.out.println("What is midterm?");
			this.MidtermExam = keyboard.nextDouble();
	if(MidtermExam < 0 || MidtermExam > 100)
			{
				System.out.println("This is invalid.");
			}
			
			
		}
	public void setFinalExam () // Prompts user for Final Exam grade and makes sure input is within parameters. If it is it is stored.
	{
			System.out.println("What is final test grade?");
			this.FinalExam = keyboard.nextDouble();
	if(FinalExam < 0 || FinalExam > 100)
		{
			System.out.println("This is invalid.");
		}
	
		}
	
	public void calculateFinalGrade () // Calculates the final grade from the inputs and prints out the final along with a letter grade.
		{
			this.FinalGrade =  (this.Quiz1*.125) + (this.Quiz2*.125) + (this.MidtermExam*.25) + (this.FinalExam*.5);
		}
	public void printFinalGrade ()
		{
			String Grade;
			if(this.FinalGrade >= 90 && this.FinalGrade <= 100 )
				{
					Grade = "A";
				}
			else if(this.FinalGrade >= 80 && this.FinalGrade <= 89)
				{
					Grade = "B";
				}
			else if(this.FinalGrade >= 70 && this.FinalGrade <=79)
				{
					Grade = "C";
				}
			else if(this.FinalGrade >= 60 && this.FinalGrade <=69)
				{
					Grade = "D";
				}
			else
				{
					Grade = "F";
				}

	System.out.println("Your final grade is " + this.FinalGrade + " " + Grade); // Displays final grade and grade letter.
	
		}
}
