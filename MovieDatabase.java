/*
 * Mark Kwayisi
 */

import java.io.*;
import java.util.Scanner;
public class MovieDatabase {
	private Movie[] Movie;
	public static final int MovieDB_SIZE = 1000;
	public static final String delim = "\t";
	public static final int FIELD_AMT = 5;
	public MovieDatabase()
	{
		Movie = new Movie[MovieDB_SIZE];
	}
	public Movie[] getMovie()
	{
		return this.Movie;
	}
	public void AddMovie(Movie aMovie)
	{
		//Check if movie array is full
		if(Movie[Movie.length-1] != null)
		{
			System.out.println("Sorry, but the Movie database is full.");
			return;
		}
		//Find the first empty space
		for(int i=0;i<Movie.length;i++)
		{
			if(Movie[i] == null)
			{
				Movie[i] = aMovie;
				break;
			}
		}
	}
	public void RemoveMovie(String aName)
	{
		int removeIndex = -1;//Set this to an index that cannot exist for a check later
		for(int i=0;i<Movie.length;i++)//Find the movie by name
		{
			if(Movie[i].getName().equalsIgnoreCase(aName))
			{
				removeIndex = i;
				break;
			}
		}
		if(removeIndex == -1)//The movie was never found
		{
			System.out.println("This movie was not found");
		}
		else//Movie was found so shift everything to the left by one
		{
			for(int i=removeIndex;i<Movie.length-1;i++)
			{
				Movie[i] = Movie[i+1];
			}
			Movie[Movie.length-1] = null;//Make sure the last index is always null
		}
	}
	private void SortMovieByBOG()
	{
		//Using Bubble Sort
		boolean swapped = true;
		while(swapped == true)
		{
			swapped = false;
			for(int i=0;i<Movie.length-1;i++)
			{
				if(Movie[i+1]==null)
				{
					break;
				}
				if(Movie[i].getBOG()>Movie[i+1].getBOG())//Out of order swap!
				{
					Movie temp = Movie[i];
					Movie[i] = Movie[i+1];
					Movie[i+1] = temp;
					swapped = true;
				}
			}
		}
	}

	public void WriteMovieDBFile(String aFileName)
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aFileName));
			for(Movie movie:Movie)
			{
				if(Movie == null)
				{
					break;
				}
				fileWriter.println(movie.getName()+delim+
									movie.getYear()+delim+
									movie.getRating()+delim+
									movie.getDirector()+delim+
									movie.getBOG()+delim);
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e.getMessage());
		}
	}
	public void ReadMovieDBFile(String aFileName)
	{
		try
		{
			Movie = new Movie[MovieDB_SIZE];
			Scanner fileScanner = new Scanner(new File(aFileName));
			int movieCount = 0;
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(delim);
				if(splitLines.length == FIELD_AMT)//Well formed line
				{
					String Name = splitLines[0];
					int Year = Integer.parseInt(splitLines[1]);
					int Rating = Integer.parseInt(splitLines[2]);
					String Director = splitLines[3];
					double BOG = Double.parseDouble(splitLines[4]);
					Movie aMovie = new Movie(Name,Year,Rating,Director,BOG);
					
					this.AddMovie(aMovie);
					movieCount++;
				}
				else
				{
					System.out.println("Not well formed so ignored");
				}
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			
		}
	}
}

