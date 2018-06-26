/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class NameSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Name Sorter!");
		String[] N = new String[10]; // Creates String For The First Name
	 
		String temp;
			for(int s=0;s<N.length;s++)  
		{
			int num = (s+1); // Stores each person name and order.
			System.out.println("Enter person " + num + " name."); 
			N[s] = keyboard.nextLine();
		}
			boolean swapped = true;
			while (swapped == true)
				{
				swapped = false;
				int s;
				
				for (s = 0; s<N.length; s++) // Stores the name put in order to organize later.
		    {
		        		for (int x = s + 1; x < N.length; x++) 
		        {
		        			if (N[s].compareTo(N[x])>0) 
		            {
		                temp = N[s];
		                N[s] = N[s + 1];
		                N[s + 1] = temp;
		                swapped = true;
		            }
		        }
		    }
		 
		System.out.println("\n");
		    System.out.print("Names in Sorted Order:\n"); // Prints sorted names 
				}	for (int s = 0; s < N.length; s++) 
		    {
		        System.out.print(N[s] + "\n"); // Prints names horizontally.
		    }
		     
	}
}


