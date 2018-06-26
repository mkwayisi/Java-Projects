/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class IntDoubleLinkedList 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		private class ListNode {
	        private int data;
	        private ListNode link;
	        public ListNode() {
	            link = null;
	            data = 0;
	        }
	        public ListNode(int newData, ListNode linkValue) {
	            data = newData;
	            link = linkValue;
	        }
	    }
		
		private ListNode Head;
	private ListNode current;
	private ListNode previous;
	
	public void IntLinkedList() {
		Head = null;
		current = null;
		previous = null;
	    
	}
	
	public void addANodeToStart(int addData ) {
		Head = new ListNode(addData, Head);
		if ((current == Head.link) && (current != null))
			previous = Head;
	}
	public void insertNodeAfterCurrent(int newData) {
		ListNode newNode = new ListNode();
		newNode.data = newData;
		if(current !=null) {
			newNode.link=current.link;
			current.link=newNode;
		} else if (Head !=null ) {
			System.out.println("Inserting when iterator is past all" + "nodes or is not initalized. ");
			System.exit(0);
		} else{
			System.out.println("using insertNodeAfterCurrent with empty list.");
			System.exit(0);
			
		}
	}

	public void insert(int addData)
	{
		ListNode newNode = new ListNode();
		newNode.data = addData;
		if (Head == null)
		{
			Head = newNode;
			current = Head;
			return;
		}
		ListNode position = Head;
		ListNode PrevPos = null;
		while(position != null)
		{
			PrevPos = position;
			position = position.link;
		}
		position = newNode; 
		PrevPos.link = position;
	}
	
	public void resetIteration() {
		current = Head;
		previous = null;
	}
	public boolean moreToIterate() { 
		return current != null;
	}
	public void goToNext() {
		if (current != null)
		{
			previous = current;
			current = current.link;
		}
		else if (Head !=null)
		{
			System.out.println("Iterated too many times or unitialized iteration.");
			System.exit(0);
		}
		else
		{
			System.out.println("Iterating with an empty list.");
			System.exit(0);
			
		}
		
	}
	public int getDataAtCurrent() {
		int result = 0;
		if (current != null)
			result = current.data;
		else{
			System.out.println("Getting data when current is not at any mode.");
			System.exit(0);	
		}
		return result;
	}
	public void setDataAtCurrent(int newData) {
		if (current != null) {
			current.data  = newData;
		}else{
			System.out.println("Setting data when current is not at any node.");
			System.exit(0);
		}
	}
	public void showList() {
		ListNode position = Head;
		while (position  !=null ) {
			System.out.println(position.data);
			position = position.link;
		}
	}
	public int length() {
		int count =0;
		ListNode position  = Head;
		while(position != null) {
			count++;
			position = position.link;
		}
		return count;
	}
	
	public boolean inList(int target) {
		return find(target) != null;
	}
	
	private ListNode find(int target) {
		boolean found = false;
		ListNode position = Head;
		while ((position != null) && !found) {
			int dataAtPosition = position.data;
			if (dataAtPosition == target)
				found = true;
			else
				position = position.link;
		}
		return position;
			
	}
	public void deleteCurrentNode()
	{
		if ((current != null) && (previous != null ))
		{
			previous.link = current.link;
		}
		else if ((current != null) && (previous == null))
		{
			Head = current.link;
			current = Head;
		}
		else
		{
			this.resetIteration();
		}
			
		
		
		
	
		
		
		
		
		
		
	}
}



