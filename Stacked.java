/*
 * Mark Kwayisi
 */
import java.*;
public class Stacked {
	public class StackArrayList {
		public static final int CAPACITY = 100;
		private char[] stack;
		private int top;
		public StackArrayList()
		{
		stack = new char[CAPACITY];
		top = -1;
		}
		public int getTop()
		{
		return top;
		}
	//checks to see if the stack is empty
		public boolean isEmpty()
		{
		if(top == -1)
		return true;
		return false;
		}
		public boolean push(char value)
		{
		top++;
		if(top == CAPACITY)
		return false;
		stack[top] = value;
		return true;
		}
		public char pop() 
		{
		if(top == -1)
		return ' '; 
		char value = stack[top];
		top--;
		return value;

	}
	}

	public void push(char y) {
		// TODO Auto-generated method stub
		
	}

	public char pop() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
