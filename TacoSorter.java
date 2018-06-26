/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class TacoSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner keyboard =  new Scanner(System.in); // Allows for user input

				System.out.println("Welcome to the Taco Price Sorter! Enter Ten Tacos and their prices to be sorted."); // Prompts user input.  

				String[] a = new String[10] ; // Allows user to input 10 taco names. 

				double[] b = new double[10]; // Allows user to input 10 taco prices.







				for(int x=0;x<b.length;x++) // Sets Up The "For" Loop that keeps running the Taco program.

			{

				int num = (x+1); // Starts from the first taco and increases until the tenth taco.

				System.out.println("Enter the Taco's " + num + " name."); 

				a[x] = keyboard.nextLine();

				System.out.println("Enter the Taco's " + num +  " price.");

				b[x] = keyboard.nextDouble();

				keyboard.nextLine();

			}




{

				for(int y=0;y<b.length;y++) // Sets Up The "For" Loop for sorting

		{
				int smallestIndex = y;

				for(int t=y;t<b.length;t++)

			{

				if(b[t]<b[smallestIndex]) // Runs the bubble sorting method.

				{

				smallestIndex = t;

}




		}

				if(smallestIndex != y) // Sorts based upon bubble sorting method.

{

				double temp =  b[y];
		
				b[y] = b[smallestIndex];

				b[smallestIndex] = temp;

			}

				}

				System.out.println("The sorted tacos are ");  // Prints sorted results.

				for(int y=0;y<b.length;y++)

{

				System.out.print(a[y]+" " +b[y] );

				System.out.print("\n");

}

		}

	}

}
	


