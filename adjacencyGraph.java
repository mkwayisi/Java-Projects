
/*
 * Mark Kwayisi
 */
import java.util.*;
public class adjacencyGraph {
	public static final int DEFAULT_NODE_COUNT = 8;
	private double [][] adjMatrix;
	private ArrayList<Integer> markedVerts;

	private ArrayList<Integer> visitedVerts;

	public adjacencyGraph()

	{

	adjMatrix = new double[DEFAULT_NODE_COUNT][DEFAULT_NODE_COUNT];

	markedVerts = new ArrayList <Integer>();

	visitedVerts = new ArrayList <Integer>();

	}

	public adjacencyGraph(int size)

	{

	if(size <=0)

	{

	return;

	}

	adjMatrix = new double[size][size];

	markedVerts = new ArrayList <Integer>();

	visitedVerts = new ArrayList <Integer>();

	}

	public void addEdge(int toVertex, int fromVertex, double weight)

	{

	if(toVertex < 0 || fromVertex < 0)

	{

	return;

	}

	adjMatrix[toVertex][fromVertex] = weight;

	}

	public void printDFS()

	{

	markedVerts.clear();

	printDFS(1);

	}

	public void printDFS(int index) //Depth First Search

	{

	System.out.println(index);

	markedVerts.add(index);

	for(int i=0; i<adjMatrix[index].length; i++)

	{

	if(adjMatrix[index][i] !=0 && markedVerts.contains(i) == false)

	{

	printDFS(i);

	}

	}

	return;

	}

	public void printBFS() //Breadth First Search

	{

	markedVerts.clear();

	visitedVerts.clear();

	printBFS(1);

	}

	public void printBFS(int index)

	{

	if(visitedVerts.contains(index) == false)

	{

	System.out.println(index);

	visitedVerts.add(index);

	}

	markedVerts.add(index);

	for(int i=0; i<adjMatrix[index].length;i++)

	{

	if(adjMatrix[index][i] != 0 && visitedVerts.contains(i) == false)

	{

	System.out.println(i);

	visitedVerts.add(i);

	}

	}

	for(int i=0;i<adjMatrix[index].length;i++)

	{

	if(adjMatrix[index][i] != 0 && markedVerts.contains(i) == false)

	{

	printBFS(i);

	}

	}

	return;

	}

	public void printDFSForAll() //Print DFS For All

	{

	for(int i = 1; i < adjMatrix.length; i++){

	markedVerts.clear();

	System.out.println(" ");

	printDFS(i);

	}

	}

	public void printBFSForAll() //Print BFS For All

	{

	for(int i = 1; i < adjMatrix.length; i++){

	markedVerts.clear();

	visitedVerts.clear();

	System.out.println(" ");

	printBFS(i);

	}

	}

	}