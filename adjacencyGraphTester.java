
public class adjacencyGraphTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adjacencyGraph g = new adjacencyGraph();

		System.out.println("Adding vertices");

		g.addEdge(1, 6, 17);

		g.addEdge(7, 5, 8);

		g.addEdge(5, 6, 19);

		g.addEdge(3, 4, 16);

		g.addEdge(6, 5, 13);

		g.addEdge(4, 3, 20);

		g.addEdge(1, 2, 30);

		g.addEdge(6, 2, 30);

		g.addEdge(3, 2, 30);

		System.out.println("Printing DFS");

		g.printDFS();

		System.out.println("Printing BFS");

		g.printBFS();

		System.out.println("Printing Depth First Search For All");

		g.printDFSForAll();

		System.out.println("Printing Breadth First Search For All");

		g.printBFSForAll();

		}

		}
