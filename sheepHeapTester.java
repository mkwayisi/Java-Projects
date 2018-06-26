import java.util.*;
public class sheepHeapTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sheep Heaper, call it the Sheaper !!");
		System.out.println("Populating sheep heap with values");
		sheepHeap testheap = new sheepHeap(100);
		System.out.println();
		int[] valArr = {10,3,36,71,79,85,77,58,2,32,1,12,8,7,4};
		for(int i : valArr)
		{
			testheap.addSheep(i);
		}
		System.out.println("Printing Heap");
		testheap.sheepRollCall();
		System.out.println("Testing heap sort");
		testheap.sheepHeapSort();
		System.out.println("Removing an element from heap");
		testheap.removeSheep();
		testheap.sheepRollCall();
		
	}

	private void removeSheep() {
		// TODO Auto-generated method stub
		
	}

	private void sheepHeapSort() {
		// TODO Auto-generated method stub
		
	}

	private void addSheep(int t) {
		// TODO Auto-generated method stub
		
	}

	private void sheepRollCall() {
		// TODO Auto-generated method stub
		
	}
}
