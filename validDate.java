/*
 * Mark Kwayisi
 */
import java.util.Scanner;

public class validDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a valid date please.");
		
		String date = keyboard.nextLine();
		
		String[] splitDate = date.split("/");
		
		int day = Integer.parseInt(splitDate[1]);
		
		int month = Integer.parseInt(splitDate[0]);
		
		if
		
		((month == 4 || month == 6 || month == 9 || month == 11) && (day > 0 && day < 31))
		
			{System.out.println("This date is valid.");}
		
		else if ((month == 2) && (day > 0 && day < 30))
			{System.out.println("This date is valid.");}
		
		else if (((month == 1) || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day > 0 && day < 32))
			{System.out.println("This date is valid.");}
		
		else 
			{System.out.println("This date is invalid.");}
		
		
	}

}
