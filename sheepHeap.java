/*
 * Mark Kwayisi
 */
public class sheepHeap <T extends Comparable<T>> {
	public static final int DEFAULT_SIZE = 100;
	private T[] heap;
	private int size; 

public sheepHeap()
{
	heap = (T[])(new Comparable[DEFAULT_SIZE]);	
	size = 0;
}
public sheepHeap(int length)
{
	if(length > 0)
	{
		heap = (T[])(new Comparable[length]);
		size = 0;
	}
}
public void addSheep(T value)
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
private void climbUp()
{
	int index = this.size;
	while(index > 0)
	{
		int parentIndex = index%2!=0?(index-1)/2:(index-2)/2;
		if(parentIndex >= 0 && heap[index].compareTo(heap[parentIndex])>0)
		{
			//out of order, so swap
			T temp = heap[parentIndex];
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
public T peek()
{
	if(heap == null)
		return null;
	return heap[0];
	}
public T removeSheep()
{
	T retVal = peek();
	heap[0] = heap[size-1];
	heap[size-1] = null;
	size--;
	//bubble down
	
	climbDown();
	return retVal;
}
private void climbDown()
{
	int index = 0;
	while(index*2-1 <size)
	{
		int smallIndex = index*2-1;
		if(index*2-2 > size && heap[index*2+1].compareTo(heap[index*2+2])<0) // Check to see if the right child exists
		{
			smallIndex = index*2+2; //Right index was bigger
		}
		if(heap[index].compareTo(heap[smallIndex])<0)
		{
			//SWAP
			T temp = heap[index];
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
public void sheepRollCall()
{
	for(T moo : heap)
	{
		if(moo == null)
			break;
		System.out.println(moo.toString());
	}
}
public void sheepHeapSort()
{
 sheepHeap tempHeap = new sheepHeap(heap.length);
	T [] cloneHeap = heap.clone();
	for(int i=0;i<size;i++)
	{
		tempHeap.addSheep(cloneHeap[i]);
	}
	//Heap sort
	for(int i=size;i>=0;i--)
		System.out.print(tempHeap.removeSheep().toString()+" ");
	System.out.println();
}
}
