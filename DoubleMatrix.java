/*
 * Mark Kwayisi
 */
import java.util.Scanner;
import java.util.Random;
public class DoubleMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);

		Scanner in = new Scanner(System.in);
		
	       System.out.print("Enter the length: ");
	       
	       int length = in.nextInt();
	       
	       System.out.print("Enter the width: ");
	       
	       int width = in.nextInt();
	     
	       int[][] matrix = new int[length][width];

	       
	       Random rand = new Random(); //Populating The Matrix
	       
	       for(int a=0; a<matrix.length; a++)
	       {
	    	   
	           for(int b=0; b<matrix[a].length; b++)
	           {
	        	   
	               int next = rand.nextInt(10);
	               matrix[a][b] = next;
	           }
	       }
	    
	       for(int a=0; a<matrix.length; a++) //Printing Out The Matrix
	       { 
	           for(int b=0; b<matrix[a].length; b++)
	           {
	               System.out.print(matrix[a][b]+" ");
	           }
	           System.out.println();
	       } 
	       
	    
	        int dlength = length*2; //Population For The Second Matrix
	      int dwidth = width*2;
	      
	       int[][] dubMatrix = new int [dlength][dwidth];
	       for(int a=0; a<matrix.length; a++)
	       {
	           for(int b=0; b<matrix[a].length; b++)
	           {
	              
	        	   
	        	   
	        	   dubMatrix[a*2][b*2]=matrix[a][b];	        	
	        	   dubMatrix[a*2][b*2+1]=matrix[a][b];
	        	   dubMatrix[a*2+1][b*2]=matrix[a][b];
	        	   dubMatrix[a*2+1][b*2+1]=matrix[a][b];

	           }
		    } 
	      
	       for(int a=0; a<dubMatrix.length; a++)
	       { 
	           for(int b=0; b<dubMatrix[a].length; b++)
	           {
	               System.out.print(dubMatrix[a][b]+" ");
	           }
	           System.out.println();
	       }
	       

	   }



}


