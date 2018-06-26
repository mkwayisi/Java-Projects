import java.util.*;
public class heapTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Int Heap Tester!");
		System.out.println("Populating heap with values");
		intHeap testheap = new intHeap(100);
		System.out.println();
		int[] valArr = {29,37,49,11,23,1,13,16,33,17};
		for(int i : valArr)
		{
			testheap.insert(i);
		}
		System.out.println("Printing Heap");
		testheap.printHeap();
		System.out.println("Testing heap sort");
		testheap.heapSort();
		System.out.println("Removing an element from heap");
		testheap.remove();
		testheap.printHeap();
		
	}

	private void remove() {
		// TODO Auto-generated method stub
		
	}

	private void heapSort() {
		// TODO Auto-generated method stub
		
	}

	private void insert(int t) {
		// TODO Auto-generated method stub
		
	}

	private void printHeap() {
		// TODO Auto-generated method stub
		
	}
}