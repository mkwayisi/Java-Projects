/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class DrawingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number and I will draw some stairs!");
		
		Scanner keyboard = new Scanner(System.in);
		
		int stairwidth = keyboard.nextInt();
		
		int stairsX = stairwidth*2;
		
		int stairsY = stairsX*2;
		
		int finalStairs = 0;
				
		if(stairwidth <=0)
			{ 
				System.out.println("This is not a valid input!!");
				System.exit(0);
			}
		else
			{
		
		for(int x=0; x<stairwidth;x++)
				{
					for(int y=0;y<stairwidth; y++)
					{
						System.out.print("*");
					}
						System.out.println(" ");
				}
			}
		for(int x=0; x<stairsX;x++)
		{
			for(int y=0;y<stairsX; y++)
			{
				System.out.print("*");
			}
				System.out.println(" ");
		}
		for(int x=0; x<stairsY;x++)
			{
				for(int y=0;y<stairsY; y++)
				{
					System.out.print("*");
				}
					System.out.println(" ");
		while (stairsX < stairwidth)
		{
			
		}
			}
		}
	}



