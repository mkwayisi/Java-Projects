/*
 * Mark Kwayisi
 */
import java.util.*;
public class FwordSorter {
	public static void main(String[] args) { 
		 
	    MyObject array[] = new MyObject[100];
	    array[0] = new MyObject("FUN",1);
	    array[1] = new MyObject("Fluffy",3);
	    array[2] = new MyObject("Fife",2);
	    array[3] = new MyObject("Five Dollar Foot Long For Five Dollars",4);
	    array[4] = new MyObject("FfffFFffuuu!",8);
	    array[5] = new MyObject("Farmer Fred Fiddles for Food",5);
	    array[6] = new MyObject("After Friday fear the final. Be afraid friend.",6);
	    
	    System.out.println("Before Sort:");
	    for (MyObject o: array) {
	        System.out.println(o.key + " : " + o.number );
	    }
	 
	    Arrays.sort(array);
	 
	    System.out.println("After Sort:");
	    for (MyObject o: array) {
	        System.out.println(o.key + " : " + o.number );
	    }
	  }
	}
	 
	class MyObject implements Comparable<MyObject> {
	 
	  String key;
	  int number;
	 
	  MyObject(String key, int number){
	    this.key = key;
	    this.number = number;
	  }
	 
	  public int compareTo(MyObject o) {
	    return o.key.compareTo(this.key);
	  }
	}
		