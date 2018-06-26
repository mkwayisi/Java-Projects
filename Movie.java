/*
 * Mark Kwayisi
 */
/*
TODO 
Add a movie
Remove a movie by title
Sort a movie by Title
Sort a movie by Rating
Sort a movie by Box Office Gross
Sort Movie by a director (Last Name)
Print to a database file
Read from a database file 
*/

public class Movie {
	private String Name;
	private int Year;
	private int Rating;
	private String Director;
	private double BOG;
	//Default Constructors
	public Movie()
	{
		this.Name = "No name yet";
		this.Year = 0000;
		this.Rating = 0;
		this.Director = "no name yet";
		this.BOG = 0.0;
	}
	//Constructors
	public Movie(String aName, int aYear, int aRating, String aDirector, double aBOG)
	{
		this.Name = aName;
		this.Year = aYear;
		this.Rating = aRating;
		this.Director = aDirector;
		this.BOG = aBOG;
	}
	//Mutators
	public String getName() {
		return Name;
	}
	public void setName(String aName) {
		this.Name = aName;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int aYear) {
		this.Year = aYear;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int aRating) {
		this.Rating = aRating;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String aDirector) {
		this.Director = aDirector;
	}
	public double getBOG() {
		return BOG;
	}
	public void setBOG(double aBOG) {
		if(aBOG>=0.01)
		{
			this.BOG = aBOG;
		}
	}
}
