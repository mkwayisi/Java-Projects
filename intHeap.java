/*
 * Mark Kwayisi
 */
import java.util.Scanner;
import java.util.*;

public class intHeap {
	public static final int DEFAULT_SIZE = 100;
	private int[] heap;
	private int size = 0; // Always assumed to look at the last open element
	public intHeap()
	{
		heap = (new int[DEFAULT_SIZE]);	
		size = 0;
		for(int i =0; i <DEFAULT_SIZE; i++)
		{
			heap[i] = -1;
		}

	}

	public intHeap(int length)
	{
		if(length > 0)
		{
			heap = (new int[length]);
			size = 0;
			for(int i =0; i<DEFAULT_SIZE; i++)
			{
				heap[i] = -1;
			}

		}
	}
	public void insert(int value)
	{
		if(size >= heap.length)
		{
			System.out.println("Filled up");
			return;
		}
		heap[size] = value;
		//TODO bubble up
		size++;
	}
	private void bubbleUp()
	{
		int index = this.size;
		while(index > 0)
		{
			int parentIndex = index%2!=0?(index-1)/2:(index-2)/2;
			if(parentIndex >= 0 && heap[index]<(heap[parentIndex]))
			{
				//out of order, so swap
				int temp = heap[parentIndex];
				heap[parentIndex] = heap[index];
				heap[index] = temp;
			}
			else
			{
				break;
			}
			index = parentIndex;
		}
	}
	public int peek()
	{
		if(heap == null)
			return -1;
		return heap[0];
		}
	public int remove()
	{
		int retVal = peek();
		heap[0] = heap[size-1];
		heap[size-1] = -1;
		size--;
		//bubble down
		bubbleDown();
		return retVal;
	}
	private void bubbleDown()
	{
		int index = 0;
		while(index*2+1 <size)
		{
			int smallIndex = index*2+1;
			if(index*2+2 < size && heap[index*2+1]<(heap[index*2+2])) // Check to see if the right child exists
			{
				smallIndex = index*2+1; //Right index was bigger
			}
			if(heap[index]>(heap[smallIndex]))
			{
				//SWAP
				int temp = heap[index];
				heap[index] = heap[smallIndex];
				heap[smallIndex] = temp;
			}
			else
			{
				break;
			}
			index = smallIndex;
		}
	}
	public void printHeap()
	{
		for(int moo : heap)
		{
			if(moo == -1)
				break;
			System.out.println(moo);
		}
	}
	public void heapSort()
	{
		intHeap tempHeap = new intHeap(heap.length);
		int [] cloneHeap = heap.clone();
		for(int i=0;i<size;i++)
		{
			tempHeap.insert(cloneHeap[i]);
		}
		//Heap sort
		for(int i=size-1;i>=0;i--)
			System.out.print(tempHeap.remove()+" ");
		System.out.println();
	}
}


