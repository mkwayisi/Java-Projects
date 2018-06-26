/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); // Scans keyboard input.
		
		System.out.println("Welcome to the Triangle Maker 9000! Enter the triangle size."); // Welcomes the user to the triangle maker !
		
		int width = keyboard.nextInt(); // recognizes the width as an integer.
		
		if(width <=0) // checks to make sure dimensions are not negative.
		{
			System.out.println("This is unacceptable. Input a positive integer."); // Alerts user that their input is invalid and should be positive.
			
			System.exit(0); // exits the loop
		}
		else 
		{
			for(int x=1; x<=width; x++) // Prints the vertical row of *s.
			{
				for(int y=1;y<=x;y++)
				{
					System.out.print("*"); // prints *s.
				}
			System.out.println(" ");	
			}
		}
		for(int x=width; x>=1; x--) // Prints the inverse row of *s.
		{
			for(int y=1;y<x;y++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		keyboard.close(); //closes keyboard.
	}

}
