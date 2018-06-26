/*
 * Mark Kwayisi
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class search {

	static Random random = new Random(1000);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Welcomes user to the search tester, performs binary and linear searches
		System.out.println("Welcome to the search tester. We will see which algorithm performs best for 20 tests");
	       int totallincount = 0;
	       int totalbcount = 0;
	       for (int x = 0; x < 20; x++) {
	           int[] dataArray = generateRandomArrayWithRandomNum();
	           int search = random.nextInt(1000);
	           int linearCount = performLinearSearch(dataArray, search);
	           int binaryCount = performBinarySearch(dataArray, search);
	           System.out.println("Linear Checks: "+linearCount);
	           System.out.println("Binary Checks: "+binaryCount);
	           totallincount+=linearCount;
	           totalbcount+=binaryCount;
	       } // Displays average of the 20 checks 
	       System.out.println("\nThe average number of checks for 20 were:");
	       System.out.println("Linear Search "+totallincount/20);
	       System.out.println("Binary Search "+totalbcount/20);
	} // Sets the parameters from 0-999
	       private static int[] generateRandomArrayWithRandomNum() {
	    	      int size = random.nextInt(1000);
	    	      int[] dataArray = new int[size];
	    	      for (int y = 0; y < size; y++) {
	    	          dataArray[y] = random.nextInt(1000);
	    	      }
	    	      Arrays.sort(dataArray);
	    	      return dataArray;
	    	  }
	       // Tells the user that the search is being performed , if the array is found true the program breaks
	    	  private static int performLinearSearch(int[] dataArray, int search) {
	    	      System.out.println("Searching using linear search");
	    	      int count = 0;
	    	      boolean found = false;
	    	      for (int y = 0; y < dataArray.length; y++) {
	    	          count++;
	    	          if (dataArray[y] == search) {
	    	              found = true;
	    	              break;
	    	          }
	    	      } // Alerts if check is found.
	    	      if (found) {
	    	          System.out.println("Found!");
	    	      } else { // Alerts if check is not found.
	    	          System.out.println("Not Found!");
	    	      }
	    	      return count;
	    	  }
	    	  // Performs binary search 
	    	  private static int performBinarySearch(int[] dataArray, int search) {
	    	      System.out.println("Searching using binary search");
	    	      int count = 0;
	    	      boolean found = false;
	    	      int high = dataArray.length-1;
	    	      int low = 0;
	    	      int mid = 0;
	    	      while (low <= high) {
	    	  count++;
	    	          mid = (low + high) / 2;
	    	  if (dataArray[mid] > search) {
	    	  high = mid - 1;
	    	  } else if (dataArray[mid] < search) {
	    	  low = mid + 1;
	    	  } else {
	    	      found = true;
	    	      break;
	    	  }
	    	  }
	    	      if(found)
	    	      {
	    	          System.out.println("Found!");
	    	      }else
	    	      {
	    	          System.out.println("Not Found!");
	    	      }
	    	      return count;
	    	  
	    	
	   }
	}


