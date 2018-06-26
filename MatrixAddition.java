/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Welcome to the Matrix Adder Program!");
		
			Scanner x = new Scanner(System.in); // 
			
			System.out.println("Enter the number of matrix rows!"); 
			
				int hOne = x.nextInt();
				int vOne = x.nextInt();
			
			System.out.println("Enter the number of matrix columns!"); 
				
				int hTwo = x.nextInt();
				int vTwo = x.nextInt();
			 int[][] m = new int[hOne][vOne]; // 
		     int[][] a = new int[hTwo][vTwo];
		    
		 System.out.println("Enter the numbers in the first matrix.");
		 
		 	for (int t = 0 ; t < hOne; t++)
		 	{
		 		for (int i = 0 ; i < vOne ;i++)
		 		{
		 		m[t][i] = x.nextInt();
		 		}
		 	}
		 System.out.println("Enter the numbers in the second matrix."); 
		 	for (int t = 0 ; t < hTwo; t++)
		 {
		 		for (int i = 0 ; i < vTwo ; i++)
		 	{
		 		a[t][i] = x.nextInt();
		 	}
		 }
		 int[][] y = new int[hOne][vOne];
		 	for ( int  t = 0 ; t < hOne ; t++ ) {
		 			for (int i = 0; i < vOne; i++) {
		 		y[t][i] = m[t][i] + a[t][i];
		 			}
		 	
		 	}
		 System.out.println("Sum of entered matrices is: ");  
		 
		 		for (int t = 0 ; t < hTwo ; t++ )
		 	{
		 		for (int i = 0 ; i < vTwo ; i++ ){
		 
		 System.out.print(y[t][i] + " "); // 

		 System.out.println();

		    }

		  }

		}
}
	


