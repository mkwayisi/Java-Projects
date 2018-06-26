
public class Square 
	{
	private int length; // Saves Length
	public Square()
		{
			this.length= 0;
		}
	public Square (int aLength)
	{
		this.length = aLength;
	}
	public int getLength()
	{
		return this.length;
	}
	public void setLength(int aLength) throws DimensionException // Takes from DimensionException
	{
		if(aLength > 0)
	{
		this.length = aLength;
	}
		else
	{
			throw new DimensionException("Invalid Length");
		}
	}
	public void draw() // Draws the Square
	{
		for (int x=0; x<length; x++)
		{
			for (int y=0; y<length; y++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public int getArea() // Finds Area
	{
		return length*length;
	}
	public int getPerimeter()
	{
		return length *4;
		}
	
}
					
	

