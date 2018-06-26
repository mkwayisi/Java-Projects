/*
 * Mark Kwayisi
 */
import java.util.Scanner; // Packages
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Sort 
{
	static Random x = new Random();  
	public static ArrayList<Integer> sort(ArrayList<Integer> list) {
		if (list.size() <= 1)
		return list;
		int rotationplacement = x.nextInt(list.size());
		int rotation = list.get(rotationplacement);
		list.remove(rotationplacement);
		        // Array List 
		        ArrayList<Integer> lower = new ArrayList<Integer>();
		        ArrayList<Integer> higher = new ArrayList<Integer>();
		        for (int num : list)
		            if (num <= rotation)
		                lower.add(num);
		        
		            else
		                higher.add(num);
		        sort(lower);
		        sort(higher);

		        list.clear();
		        list.addAll(lower);
		        list.add(rotation);
		        list.addAll(higher);
		        return list;
		    }
		        public static void main(String[] args){
		    	int cont = 3;
		    	while(cont > 0){
		    Scanner q = new Scanner(System.in); // User Input 
		
		    System.out.println("Enter size of the Array List: ");
		        int size=q.nextInt();
		     // Randomizes Array List
		        ArrayList y = new ArrayList();
		        Random x = new Random();
		        for (int t = 0; t < size; t++) 
		        {
		        	y.add(x.nextInt(100));           
		        }

		        System.out.println("Before sorting: ");
		       
		        for (int t = 0; t < size; t++) 
		        {
		System.out.println(y.get(t)); // Prints Presorted Array 
		        }

		        ArrayList a2=sort(y);
		        System.out.println("After sorting: "); // Prints Sorted Array in Queue
		        for (int t = 0; t < size; t++) 
		        {
		System.out.println(a2.get(t));
		        }
		        // Reverses Queue In Stack 
		        Stack st=new Stack();
		        Queue que=new LinkedList();
		   
		        System.out.println("Printed Queue: ");
		        for (int t = 0; t < a2.size(); t++) 
		        {
		            que.add(a2.get(t));
		        }
		       
		        for (int t = 0; t < a2.size(); t++) 
		        {
		        System.out.println(que.remove());
		        }
		      
		        System.out.println("Printed STACK: ");
		       
		        for (int t = 0; t < a2.size(); t++) {
		            st.add(a2.get(t));
		        }
		        
		        for (int t = 0; t < a2.size(); t++)
		        {
		        System.out.println(st.pop());
		        }  
		        cont -- ;
		    	}
		    }	
	

		

	}


