/*
 * Mark Kwayisi
 */
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class sortingComparison {

	 private static int doSelectionSort(int[] arr) {
	      int checks = 0;
	      for (int x = 0; x < arr.length - 1; x++) {
	          int index = x;
	          for (int y = x + 1; y < arr.length; y++) {
	              checks++;
	              if (arr[y] < arr[index])
	                  index = y;
	          }
	          int smallerNumber = arr[index];
	          arr[index] = arr[x];
	          arr[x] = smallerNumber;
	      }
	      return checks;
	  }

	  private static int bubbleSort(int[] arr) {
	      int m = arr.length;
	      int temp = 0;
	      int checks = 0;
	      for (int x = 0; x < m; x++) {
	          for (int y = 1; y < (m - x); y++) {
	              checks++;
	              if (arr[y - 1] > arr[y]) {
	                  // swap the elements!
	                  temp = arr[y - 1];
	                  arr[y - 1] = arr[y];
	                  arr[y] = temp;
	              }

	          }
	      }
	      return checks;
	  }

	  private static int[] generateRandomArrayWithRandomNum() {
	      Random r = new Random();
	      int[] dataArray = new int[1000];
	      for (int x = 0; x < 1000; x++) {
	          dataArray[x] = r.nextInt(1000);
	      }
	      return dataArray;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr = generateRandomArrayWithRandomNum();
	      int checksSelectionSort = 0;
	      int checksBubbleSort = 0;
	      int checksMergeSort = 0;
	      int checksQuickSort = 0;
	      int[] copyArr = new int[1000];
	      for (int x = 0; x < 20; x++) {
	          System.arraycopy(arr, 0, copyArr, 0, 1000);
	          checksSelectionSort += doSelectionSort(arr);

	           
	          System.arraycopy(copyArr, 0, arr, 0, 1000);
	          checksBubbleSort += bubbleSort(copyArr);
	          System.arraycopy(arr, 0, copyArr, 0, 1000);
	          checksMergeSort += new mergeSort().sort(arr);
	          System.arraycopy(copyArr, 0, arr, 0, 1000);
	          checksQuickSort += new quickSort().sort(copyArr);
	      }
	      System.out.println("Analysis Of Sorting algorithms ");
	      System.out.println("Selection Sort : "+checksSelectionSort/20);
	      System.out.println("Bubble Sort : "+checksBubbleSort/20);
	      System.out.println("Merge Sort : "+checksMergeSort/20);
	      System.out.println("Quick Sort : "+checksQuickSort/20);

	     
	  }
	}

	class mergeSort {

	  private int[] array;
	  private int[] tempMergArr;
	  private int length;
	  private int checks;

	  public int sort(int inputArr[]) {
	      this.array = inputArr;
	      this.length = inputArr.length;
	      this.tempMergArr = new int[length];
	      doMergeSort(0, length - 1);
	      return checks;
	  }

	  private void doMergeSort(int lowerIndex, int higherIndex) {
	      checks++;
	      if (lowerIndex < higherIndex) {
	          int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	          // Below step sorts the left side of the array
	          doMergeSort(lowerIndex, middle);
	          // Below step sorts the right side of the array
	          doMergeSort(middle + 1, higherIndex);
	          // Now merge both sides
	          mergeParts(lowerIndex, middle, higherIndex);
	      }
	  }

	  private void mergeParts(int lowerIndex, int middle, int higherIndex) {

	      for (int x = lowerIndex; x <= higherIndex; x++) {
	          tempMergArr[x] = array[x];
	      }
	      int x = lowerIndex;
	      int y = middle + 1;
	      int q = lowerIndex;
	      while (x <= middle && y <= higherIndex) {
	          if (tempMergArr[x] <= tempMergArr[y]) {
	              array[q] = tempMergArr[x];
	              x++;
	          } else {
	              array[q] = tempMergArr[y];
	              y++;
	          }
	          q++;
	      }
	      while (x <= middle) {
	          array[q] = tempMergArr[x];
	          q++;
	          x++;
	      }

	  }
	}

	class quickSort {

	  private int array[];
	  private int length;
	  private int checks;

	  public int sort(int[] inputArr) {
	      if (inputArr == null || inputArr.length == 0) {
	          return 0;
	      }
	      this.array = inputArr;
	      length = inputArr.length;
	      quickSort(0, length - 1);
	      return checks;
	  }

	  private void quickSort(int lowerIndex, int higherIndex) {
	      checks++;
	      int x = lowerIndex;
	      int y = higherIndex;
	      int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
	      while (x <= y) {
	          while (array[x] < pivot) {
	              x++;
	          }
	          while (array[y] > pivot) {
	              y--;
	          }
	          if (x <= y) {
	              exchangeNumbers(x, y);
	              x++;
	              y--;
	          }
	      }
	      if (lowerIndex < y)
	          quickSort(lowerIndex, y);
	      if (x < higherIndex)
	          quickSort(x, higherIndex);
	  }

	  private void exchangeNumbers(int x, int y) {
	      int temp = array[x];
	      array[x] = array[y];
	      array[y] = temp;
	  }
	}


