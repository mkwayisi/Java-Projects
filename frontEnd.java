/*
 * Mark Kwayisi
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Set;
public class frontEnd {
	
public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
	
BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

Hashtable<String, Phobia> table = new Hashtable<String, Phobia>();

System.out.println("Welcome to the Fear Hash Table!\n");

int choice = 0;
while (true)
	{
		System.out.println("Enter: \n1. To add a fear\n2. To remove a fear\n3. To look up a fear\n4. Print all fears\n5. Quit");
		choice = Integer.parseInt(scan.readLine());
		switch(choice)
		{
			case 1: addFear(scan, table); break;
			case 2: removeFear(scan, table); break;
			case 3: lookUpFear(scan, table); break;
			case 4: printFears(table); break;
			case 5: System.exit(0); break;
		}
	}
}
		   public static void addFear(BufferedReader scan, Hashtable<String, Phobia> table) throws IOException{
		       System.out.println("What is the fear's name");
		       Phobia p = new Phobia();
		       String name = scan.readLine();
		       p.setName(name);
		       System.out.println("Describe the fear");
		       String description = scan.readLine();
		       p.setDescription(description);
		       table.put(name, p);
		       System.out.println("Fear details added");
		   }
		   public static void removeFear(BufferedReader scan, Hashtable<String, Phobia> table) throws IOException{
		       System.out.println("Enter the fear's name that to be removed");
		       String name = scan.readLine();
		       table.remove(name);
		       System.out.println("Fear removed");
		   }
		   public static void lookUpFear(BufferedReader scan, Hashtable<String, Phobia> table) throws IOException{
		       System.out.println("Enter the fear's name");
		       String name = scan.readLine();  
		       Phobia p = (Phobia)table.get(name);
		       System.out.println(p.toString());
		   }
		   public static void printFears(Hashtable<String, Phobia> table){
		       Set<String> keys = table.keySet();
		       for(String key: keys){
		           Phobia p = table.get(key);
		           System.out.println(p.toString());
		       }
		   }  
		}  

