//Mark Kwayisi
import java.util.Scanner;

public class GenArrayQueue <T>{

	// TODO Auto-generated method stub
				public static final int DEFAULT_SIZE = 100; // Creates An Array From 0 To 99 Because Numbers Start At 0
				private T[]queue;
				public GenArrayQueue()
				{
					queue = (T[]) new Object [DEFAULT_SIZE]; // Creates Default Size
					tailIndex = 0; // Sets Index Equals To 0
				}
				public GenArrayQueue(int size)// Parameterized Constructor
				{
					queue = (T[]) new Object [size];
					tailIndex =0;
				}
				
				private int tailIndex;
				public void enqueue (T data)
				{
					if(tailIndex >= queue.length)
					{
						System.out.println("queue is full");
						return;
					}
					queue[tailIndex] = data;
					tailIndex ++;
					
				}
				public T dequeue ()//Method
				{
					T retData = queue[0];
					for(int i =0; i<queue.length-1;i++)
					{
						queue[i]= queue[i + 1];
					}
					queue[queue.length-1] = null;
					tailIndex--;
					return retData;
				}
				public T peek()//Method
				{
					return queue [0];
				}
				public void print()
				{
					for(T node:queue)
					{
						if(node ==null)
							break;
						System.out.println(node.toString());
					}
					
				}
				public void showQueue()//Method
				{
				}
				
	}




