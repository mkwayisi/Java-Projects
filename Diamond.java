/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class Diamond extends ShapeBasics implements DiamondInterface
{
	private int width;


	public Diamond()
	{
		super();
	width = 0;
	}


	public Diamond(int width, int offset)
	{
	super(offset);
	this.width = width;
	}

	public int getWidth() {
	return width;
	}
	// this sets the width of the diamond.
	public void setWidth(int width)
	{
	if(width > 0)
	this.width = width;

	else
	{
	System.out.println("Width Can not be negetive ");
	this.width = 0;
	}
	}
	public void drawHere()
	{
	if(width % 2 == 0)
	{
	drawTopV(width / 2);
	drawBottomV(width / 2 - 1);
	}
	else
	{
	drawTopV(width / 2 + 1);
	drawBottomV(width / 2);
	}
	}

	private void drawTopV(int width)
	{
	for (int i = 1; i <= width; i++)
	{
		skipSpaces(super.getOffset());
	for (int j = 0; j < (width - i); j++)
	skipSpaces(1);
	for (int j = 1; j <= i; j++)
	if(j == 1)
	System.out.print("*");
	else
	skipSpaces(1);
	for (int k = 1; k < i; k++)
	if(k == i-1)
	System.out.print("*");
	else
	skipSpaces(1);
	System.out.println();
	}
	}

	private void drawBottomV(int width)
	{
	for (int i = width; i >= 1; i--)
	{
		skipSpaces(super.getOffset());
	for (int j = 0; j < (width - i + 1); j++)
	skipSpaces(1);
	for (int j = 1; j <= i; j++)
	if(j == 1)
	System.out.print("*");
	else
	skipSpaces(1);
	for (int k = 1; k < i; k++)
	if(k == i - 1)
	System.out.print("*");
	else
	skipSpaces(1);
	System.out.println();
	}
	}


	public static void skipSpaces(int spaces)
	{
	while(spaces > 0)
	{
	System.out.print(" ");
	spaces--;
	}
	}
}

	

