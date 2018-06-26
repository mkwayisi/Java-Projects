// Mark Kwayisi
import java.util.Scanner;
public class ThePiggyBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Piggy Bank!");
		System.out.println("Enter a whole number from 1 to 99.");
		System.out.println("The machine will determine a combination of coins.");
		
		Scanner keyboard = new Scanner(System.in);
		
		int amount = keyboard.nextInt();
		
		System.out.println(amount);
		
		System.out.println(amount + " cents in coins:");
		
		
		int quarter;
		quarter = 25;
		
		quarter = amount / quarter;
		
		amount = amount % 25; 
		
		int dime;
		dime = 10;
		
		dime = amount / dime;
		
		amount = amount % 10;
		
		int nickel;
		nickel = 5;
		
		nickel = amount / nickel;
		
		amount = amount % 5;
		
		int penny;
		penny = 1;
		
		penny = amount / penny;
		
		amount = amount % 1;
		
		System.out.println(quarter + " quarters"); 
		
		System.out.println(dime + " dimes");
		
		System.out.println(nickel + " nickels");
		System.out.println(penny + " pennies");

	
	
	}

}
