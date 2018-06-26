/*
 * Mark Kwayisi
 */

public class IntBSTree <i extends Comparable<i>> {
	private i[] dataArr;
	private static final int ARR_SIZE = 100;
	
	public IntBSTree()
	{
		dataArr = (i[])(new Comparable[ARR_SIZE]);
	}
	
	
	public IntBSTree(int size)
	{
		if(size <= 0)
			return;
		dataArr = (i[])(new Comparable[size]);
	}
		public void insert(i data)
		{
			if(dataArr[0] == null)
			{
				dataArr[0] = data;
			}
			else
			{
				//TODO recursive insert
			}
		}
		public void insert(int index, i data)
		{
			if(dataArr[index] == null) // Found a null position put data here
			{
				dataArr[index] = data;
			}
			else if(data.compareTo(dataArr[index])<0) // Go Left
			{
				if(index*2+1 < dataArr.length) //Make sure we can go left
					insert(index*2+1,data);
			}
			else if(data.compareTo(dataArr[index])>=0) // Go Right
			{
				if(index*2+2 < dataArr.length)
					insert(index*2+2,data);
			}
			else
			{
				//call recursive insert
				insert(index, data);
			}
		}
		
		public void printInorder()
		{
			
					printInorder(0);
				}
				public void printInorder(int data )
				{
					if(dataArr[data] == null)
						return;
					if(dataArr[data*2+1] != null)
						printInorder(dataArr.length);
					System.out.println(data*2+1 + " ");
					if(dataArr[data*2+2] != null)
						printInorder(data*2+2);
		}
		public Object printBreadthOrder()
		{
			for(i val : dataArr)
			{
				if(val != null)
					System.out.println(val.toString());
				else
					System.out.println("Null");
			}
			return dataArr;
			
			
		}
		public Object getDepth(int value)
		{
			int depth = -1;
			//call recursive depth
			return getDepthRec(0, value, depth);
		}
		public int getDepthRec(int index, i value, int depth)
		{
			depth++;
			if(dataArr[index] == null)//check if empty
			{
				return -1;
			}
			else if (value.compareTo(dataArr[index])==0)//check found value
			{
				return depth;
			}
			else if (value.compareTo(dataArr[index])<0)//check left
			{
				return getDepthRec(index*2+1, value, depth);
			}
			else if (value.compareTo(dataArr[index])>0)//check right 
			{
				return getDepthRec(index*2+2, value, depth);
			}
			else 
			{
				return -1;
			}
		}
				


		private Object getDepthRec(int i, int value, int depth) {
			// TODO Auto-generated method stub
			return null;
		}
			
		}
