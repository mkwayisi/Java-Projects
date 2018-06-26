/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class DateConverter {
	public static String convert(String date)
	{
	  String result = "The date is ";
	  
	  String months[] = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	  int days[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    
	  String tokens[] = date.split("/");
	    
	  int month = Integer.parseInt(tokens[0]);
	  int day = Integer.parseInt(tokens[1]);   
	    
	  
	  try
	  {
	   if(month < 1 || month > 12)
	    throw new MonthException();
	   
	   result += months[month];
	   
	   try
	   {
	    if(day < 1 || day > days[month])
	     throw new DayException();
	    
	    result += " " + day;       
	   }
	   catch(DayException e)
	   {
	    result = "";
	   }
	  }
	  catch(MonthException e)
	  {
	   result = "";
	  }
	  
	  return result;
	}
}


