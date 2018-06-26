/*
 * Mark Kwayisi
 */
import java.text.DecimalFormat;
public class Beer {
	
	   //Declaration of Instance variables
	   private String name;
	   private double alchoholContent;
	   //Accessors and mutators to instance variables
	   public String getName()
	   {
	       return name;
	   }
	   public void setName(String name)
	   {
	       this.name = name;
	   }
	   public double getAlchoholContent()
	   {
	       return alchoholContent;
	   }
	   public void setAlchoholContent(double alchoholContent)
	   {
	       if(alchoholContent>=1||alchoholContent<=0)
	       {
	           System.out.println("invalid value for alchoholContent");
	           return;
	       }
	       this.alchoholContent = alchoholContent;
	   }
	   //Intoxicated method to find the number of beers it would take before they are intoxicated
	   public Double Intoxicated(double weight)
	   {
	       double numberofdrinks=((0.08 + 0.015) * weight / (12 * 7.5 * this.alchoholContent));
	       DecimalFormat numberFormat = new DecimalFormat("#.###");
	       return Double.parseDouble(numberFormat.format(numberofdrinks));
	   }  
	}

	//Test Class BeerClassTest.java







