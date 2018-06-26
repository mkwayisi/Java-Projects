/*
 * Mark Kwayisi
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
public class reversePolishCalculator {
	
	// Implements Operators.
	 public static int evaluate(String[] tokens, int size) 
	  {

	      int returnValue = 0;

	      String Operators = "+-*/";

	      Stack<String> stack = new Stack<String>();
	      int i = 0;
	      for (i = 0; i < size; i++)
	      {
	          String t = tokens[i];
	          if (!Operators.contains(t))
	          {
	              stack.push(t); // If Token Is Not An Operator Then The Digit Is Pushed Into The Stack
	          }
	          else
	          // If The Token Is An Operator Then The Top 2 Values In The Stack And Applies The Operation
	          {
	              int a = Integer.valueOf(stack.pop());
	              int b = Integer.valueOf(stack.pop());
	              int index = Operators.indexOf(t);
	              switch (index)
	              {
	                  case 0:
	                      stack.push(String.valueOf(a + b));
	                      break;
	                  case 1:
	                      stack.push(String.valueOf(b - a));
	                      break;
	                  case 2:
	                      stack.push(String.valueOf(a * b));
	                      break;
	                  case 3:
	                      if (a == 0)
	                      {

	                          return -2000;
	                      }
	                      stack.push(String.valueOf(b / a));
	                      break;
	              }
	          }
	      }

	      returnValue = Integer.valueOf(stack.pop());
	      if (!stack.isEmpty())// Improper returned if Stack Is In Incorrect Format.
	      {

	          return -1000;
	      }
	      return returnValue;

	  }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		{
		      /* Reads Input From User And Provides Input Before Running */
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      String line = "";
		      while (line != "quit")// Executes The Loop To Quit .
		      {
		          System.out.println("Enter a reverse polish expression or \"q\" to quit");
		          line = br.readLine();
		          
		          if (line.equals("quit"))
		          {
		              System.out.println("Goodbye");

		              break;

		          }

		          StringTokenizer st = new StringTokenizer(line);
		          String[] tokens = new String[20];
		          int i = 0;
		          while (st.hasMoreTokens())
		          {
		              
		              tokens[i] = st.nextToken();
		              
		              i++;
		          }

		          
		          int val = evaluate(tokens, i);
		          if (val == -1000)// 
		          {
		              System.out.println("This was not properly formatted");
		          }
		          else if (val == -2000)// 
		          {
		              System.out.println("the denominator should not be 0");
		          }
		          else
		              System.out.println(val);
		      }
		      br.close();
		  }
		}
	}


