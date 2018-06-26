/*
 * Mark Kwayisi 
 */


import java.util.*; // Searches All Java.util
import java.applet.*; // Creates The Window, But Does Not Draw 
import java.awt.*; // Draws A Window 
public class triangleFractal extends Applet {

	private Image display; // Displays an Image
	private Graphics drawingArea; // Drawing To An Image
	
	Point x1,y1,t1,x2,y2,t2,x3,y3,t3;
	int deep = 5;// Amount of times the recursive method continues
	//Initializes applet window
	
	public void init() // Initialization, Overwrites An Applet Method
	{
		int height = getSize().height; // 
		int width = getSize().width; 
		
		display = createImage(width,height); // creates the window to be able to display image
		drawingArea = display.getGraphics(); // Uses graphics in order to draw to the image, "paintbrush"
		
		//TODO call Triforce

		
		
	}
	public void paint(Graphics g)
	{
		g.drawImage(display, 0, 0, null);
		int pointX[] = {20,400,210}; //X coordinates for big triangle
		int pointY[] = {400, 400, 20}; //Y coordinates for big triangle
		g.setColor(Color.BLACK);// Color for big triangle
		g.fillPolygon(pointX, pointY, 3);
		triangleFractal(g,new Point(20,400), new Point(400,400), new Point(210,20),deep);//Calls recursive method
		// Develop Parameters for Square
	}
	
	private void triangleFractal(Graphics drawingArea, Point point1, Point point2,
			Point point3, int level) {
		// TODO Auto-generated method stub
		if(level == 0)
		{
			return;
		}
		level -= 1;
		int pointX[] = {point3.x,(point3.x+point2.x)/2, (point1.x+point3.x)/2};
		int pointY[] = {point2.y,(point3.y+point1.y)/2,(point3.y+point1.y)/2};
		//1st triangle
		x1 = point1;
		y1 = new Point(point3.x,point2.y);
		t1 = new Point((point1.x+point3.x)/2, (point3.y+point1.y)/2);
		triangleFractal(drawingArea, x1, y1, t1, level);
		//2nd triangle
		x2 = new Point(point3.x,point2.y);
		y2 = point2;
		t2 = new Point((point3.x+point2.x)/2,(point3.y+point1.y)/2);
		triangleFractal(drawingArea, x2, y2, t2, level);
		//3rd triangle
		x3 = new Point((point1.x+point3.x)/2,(point3.y+point1.y)/2);
		y3 = new Point((point3.x+point2.x)/2,(point3.y+point1.y)/2);
		t3 = point3;
		triangleFractal(drawingArea, x3, y3, t3, level);
		drawingArea.setColor(Color.YELLOW); //Color for inside triangles
		drawingArea.fillPolygon(pointX, pointY, 3);

	
	
		}
	}


