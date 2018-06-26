

/*
 * Mark Kwayisi
 */

public class shapeTree <T extends Comparable <T>> {
	
	
		private class Node
	{
		private T data;
		private Node rightTriangle;
		private Node Circle;
		private Node Rectangle;
		public Node()
		{
			this.data = null;
			this.rightTriangle = null;
			this.Circle = null;
			this.Rectangle = null;
		}
	}
	private Node root;
	public shapeTree()
	{
		this.root = null;
	}
	public void insert(T data)
	{
		Node newNode = new Node(); // New instance of a node and populate it with data
		newNode.data = data;
		if(root == null) // Empty Tree
		{
			root = newNode;
		}
		else
		{
			//call recursive insert
			insert(root, data);
		}
	}
	private Node insert(Node aNode, T data)
	{
		if(aNode == null)
		{
			aNode.rightTriangle = insert(aNode.rightTriangle,data);
		}
		else if(data.compareTo(aNode.data)<0) // Go Left
		{
			aNode.Circle = insert(aNode.Circle,data);
		}
		else if(data.compareTo(aNode.data)>=0) // Go Right
		{
			aNode.Rectangle = insert(aNode.Rectangle,data);
		}
		return aNode;
	}
	public boolean search(T data)
	{
		//TODO recursive search
		return recursiveSearch(root, data);
	}
	private boolean recursiveSearch(Node aNode, T data)
	{
		if(aNode == null) // Could Not Be Found
		{
			return false;
		}
		if(aNode.data.compareTo(data)==0) // Found It
		{
			return recursiveSearch(aNode.rightTriangle,data);
		}
		else if(aNode.data.compareTo(data)>0)
		{
			return recursiveSearch(aNode.Circle,data);
		}
		else
		{
			return recursiveSearch(aNode.Rectangle,data);
		}
	}
	public void delete(T value)
	{
		//TODO call recursive delete
		root = delete(root,value);
	}
	public Node delete(Node aNode, T value)
	{
		//Searching for the value
		if(aNode == null)//value not found
		return null;
		if(value.compareTo(aNode.data)<0) // Go Left
			aNode.Circle = delete(aNode.Circle,value);
		else if(value.compareTo(aNode.data)>0) // Go Right
			aNode.Rectangle = delete(aNode.Rectangle, value);
		else
			aNode.rightTriangle = delete(aNode.rightTriangle,value);
		{
			//At least one child is null, could be both
		if(aNode.rightTriangle == null)
			return aNode.Circle;
		if(aNode.Circle == null) // Left child was not null but right was
			return aNode.Rectangle;
		if(aNode.Rectangle == null)
			return aNode.rightTriangle;
		//If program reaches here then the node has two children
		Node temp = aNode;
		//find the minimum in the right subtree.
		aNode = findMinInTree(aNode.rightChild); 
		//TODO delete that minimum from the right subtree.
		aNode.rightChild = deleteMinFromTree(temp.rightChild);
		//TODO link the new node's left child.
		aNode.leftChild = temp.leftChild;
		}
		return aNode;
		}
	private Node findMinInTree(Node aNode)
	{
		if(aNode == null)
			return null;
		if(aNode.leftChild == null)
			return aNode;
		else
			return findMinInTree(aNode.leftChild);
		}
	private Node deleteMinFromTree(Node aNode)
	{
		if(aNode == null)
			return null;
		if(aNode.leftChild == null)
		{
			return aNode.rightChild;
		}
		aNode.leftChild = deleteMinFromTree(aNode.leftChild);
		return aNode;
				
	}
	public void printInOrder()
	{
		//call recursive print in order
		printInOrder(root);
	}
	public void printInOrder(Node aNode)
	{
		if(aNode == null)
			return;
		if(aNode.leftChild != null)
			printInOrder(aNode.leftChild);
		System.out.println(aNode.data.toString());
		if(aNode.rightChild != null)
			printInOrder(aNode.rightChild);
		return;
	}
	}



