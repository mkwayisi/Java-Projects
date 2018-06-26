

public class IntDoubleLinkedListTester 
{
	public final static void main(String[] args) {
		// TODO Auto-generated method stub
	
	IntDoubleLinkedList list = new IntDoubleLinkedList();
	System.out.print("Player");{
	for(int i=0; i<10; i++)
	{
		list.insert(i);
	}
	}
	list.showList();
	System.out.println();
	
	for(int i=0; i<4; i++)
	{
		list.goToNext();
	}
	list.insertNodeAfterCurrent(22);
	list.showList();
	System.out.println();
	
	for(int i=0; i<2; i++)
	{
		list.goToNext();
	}
	list.deleteCurrentNode();
	list.showList();	
	}
	}

	
