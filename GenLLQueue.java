//Mark Kwayisi
import java.util.Scanner;

public class GenLLQueue <T>{
	// TODO Auto-generated method stub
			private class ListNode // Creates List Node Class That Will Be Used Throughout The Code
			{
				private T data;
				private ListNode link;
			}
			private ListNode head;//reads from beginning of node
			private ListNode tail;//reads from the end of node
			public GenLLQueue()
			{
				head = null;//head equals an empty space or 0
				tail = null;//tail equals an empty space or 0
			}
			public void enqueue(T adata)
			{
				ListNode newNode = new ListNode();
				newNode.data = adata;
				if(head == null)
				{
					head = tail = newNode;
					return;
				}
				tail.link = newNode;
				tail = tail.link;
			}
			public T dequeue()//dequeue is also used within the tester, if it is not present an error will occur
			{
				if(head == null)
				{
					System.out.println("Empty");
					return null;
				}
				T retData = head.data;
				head = head.link;
				return retData;
			}
			public T peek()//peek is also contained within the tester, if it is not present the code will not run
			{
				return head.data;
			}
			public void showQueue()
			{
				ListNode position = head;
				while (position  !=null ) {
					System.out.println(position.data);
					position = position.link;
				}
			}
			
			

	}


