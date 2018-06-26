/*
 * Mark Kwayisi
 */
import java.util.*;
public class Graph {
	private class Vertex
	{
	String name;
	ArrayList<Edge> neighbors;
	public Vertex(String aName)
		{
		this.name = aName;
		this.neighbors = new ArrayList<Edge>();
		}
	}
	private class Edge
	{
	Vertex v1;
	double weight;
	public Edge(Vertex av1, double aWeight)
		{
		v1 = av1;
		weight = aWeight;
		}
	}
	private Vertex origin;
	private ArrayList<Vertex>Vertices;
	private ArrayList<Vertex>markedVertices;
	private ArrayList<Vertex>visitedVertices;
	private double maxlength;
	public Graph(double aLength)
	{
	origin=null;
	Vertices=new ArrayList<Vertex>();
	markedVertices=new ArrayList<Vertex>();
	visitedVertices=new ArrayList<Vertex>();
	maxlength = aLength;
	}
	public void addVertex(String aName) 
	{
	if(vertexIsContained(aName))
		{
		return;
		}
	Vertex x = new Vertex(aName);
	Vertices.add(x);
	if(origin == null)
		{
		origin = x;
		}
	}
	public boolean vertexIsContained(String aName)
		{
		for(Vertex vert : Vertices)
		{
			if(vert.name.equals(aName))
				{
					return true;
				}
		}
	return false;
		}
	public void addEdge(String fromVert, String toVert, double weight)
	{
	Vertex v1 = getVertex(fromVert);
	Vertex v2 = getVertex(toVert);
	if(v1==null || v2==null)
	return;
	v1.neighbors.add(new Edge(v2, weight));
	}
	public Vertex getVertex(String aName)
	{
	for(Vertex vert: Vertices)
		{
		if(vert.name.equals(aName))
			return vert;
		}
	return null;
	}

	public void printDFS()
	{
	markedVertices.clear();
	printDFS(origin);
	}
	private void printDFS(Vertex vert)
	{
	if(markedVertices.contains(vert))
	return;
	System.out.println(vert.name);
	markedVertices.add(vert);
	for(Edge edge : vert.neighbors)
		{
		printDFS(edge.v1);
		}
	}
	public void printBFS()
	{
		markedVertices.clear();
		visitedVertices.clear();
		System.out.println(origin.name);
		printBFS(origin);
	}
	private void printBFS(Vertex vert)
	{
		if(markedVertices.contains(vert))
			return;
		markedVertices.add(vert);
		for(Edge edge : vert.neighbors)
		{
			if(visitedVertices.contains(edge.v1) || markedVertices.contains(edge.v1))
				continue;
			System.out.println(edge.v1.name);
			visitedVertices.add(edge.v1);
		}
	for(Edge edge : vert.neighbors)
			{
			printBFS(edge.v1);
			}
	}
	public void printLazyDFS()
	{
	markedVertices.clear();
	printLazyDFS(origin);
	}
	private void printLazyDFS(Vertex vert)
	{
	if(markedVertices.contains(vert))
	return;
	System.out.println(vert.name);
	markedVertices.add(vert);
	for(Edge edge : vert.neighbors)
		{
	if(edge.weight < maxlength)
			{
			printLazyDFS(edge.v1);
			}
		}
	}
}
