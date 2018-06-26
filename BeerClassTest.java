import java.util.Scanner;
public class BeerClassTest {
	

	   public static void main(String[] args)
	   {
	       //creating instances of beers
	       Beer beer1=new Beer();
	       Beer beer2=new Beer();
	       //reading the input of first instance of beer
	       System.out.println("Let's Party! Responsibly......");
	       Scanner sc=new Scanner(System.in);
	       System.out.println("What's the name of First Beer?");
	       beer1.setName(sc.nextLine());
	       System.out.println("What's the alcoholic content?");
	       beer1.setAlchoholContent(sc.nextDouble());
	       sc.nextLine();
	       //reading the input of second instance of beer
	       System.out.println("What's the name of Second Beer?");
	       beer2.setName(sc.nextLine());
	       System.out.println("What's the alcoholic content?");
	       beer2.setAlchoholContent(sc.nextDouble());
	       //reading the weight
	       System.out.println("What's weight of the person");
	       double weight=sc.nextDouble();
	       //Display the result
	       System.out.println("It would take "+beer1.Intoxicated(weight)+" "+beer1.getName()+" beers to get intoxicated");
	       System.out.println("It would take "+beer2.Intoxicated(weight)+" "+beer2.getName()+" beers to get intoxicated");
	   }
	}


