/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class DateConverterDriver {
	public static void main(String[] args) throws MonthException, DayException {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
		  String date = "";
		  
		  System.out.println("Welcome to the date converter!");
		  
		  System.out.println("\nEnter a numeric date formatted as month/day or \"Exit\" to quit.");
		  date = input.next();
		  
		  while(!date.equalsIgnoreCase("Exit"))
		  {
		   System.out.println(DateConverter.convert(date));
		   
		   System.out.println("\nEnter a numeric date formatted as month/day or \"Exit\" to quit.");
		   date = input.next();
		  }
		  
		  System.out.println("Good bye");
		}
	}

