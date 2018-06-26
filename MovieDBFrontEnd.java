/*
 * Mark Kwayisi
 */
import java.util.Scanner;
public class MovieDBFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieDatabase movieDB = new MovieDatabase();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the movie database");
		boolean quit = false;
		while(quit == false)
		{
			System.out.println("Enter 1 to add a movie\n"
					+ "Enter 2 to remove a movie\n"
					+ "Enter 3 to read a movie database file\n"
					+ "Enter 4 to write to a movie database file\n"
					+ "Enter 5 to sort movie by title\n"
					+ "Enter 6 to sort movie by rating\n"
					+ "Enter 7 to sort movie by box office gross\n"
					+ "Enter 8 to sort movie by director\n"
					+ "Enter 9 to quit");
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(choice)
			{
			case 1://Add Movie
				System.out.println("Enter the name of the movie");
				String name = keyboard.nextLine();
				System.out.println("Enter the year of the movie was produced");
				int year = keyboard.nextInt();
				System.out.println("Enter the rating of the movie was produced");
				int rating = keyboard.nextInt();
				System.out.println("Enter the director of the movie");
				String director = keyboard.nextLine();
				System.out.println("Enter the box office gross of the movie.");
				Double BOG = keyboard.nextDouble();
				movieDB.AddMovie(new Movie(name,year,rating,director,BOG));
				break;
			case 2://Remove Movie
				System.out.println("Enter the name of the Movie to remove");
				name = keyboard.nextLine();
				movieDB.RemoveMovie(name);
				break;
			case 3://Read Movie file
				System.out.println("Enter the file name to read a MovieDB");
				String fileName = keyboard.nextLine();
				movieDB.ReadMovieDBFile(fileName);
				break;
			case 4://Write Movie
				System.out.println("Enter the file name to write a MovieDB File");
				fileName = keyboard.nextLine();
				movieDB.WriteMovieDBFile(fileName);
				break;
			case 9://Quit
				quit = true;
				break;
			default:
				System.out.println("Invalid input");
			}
			//Prints the movie
			for(Movie movie:movieDB.getMovie())
			{
				if(movie == null)
				{
					break;
				}
				System.out.println(movie.getName()+" "+movie.getYear()+" "+movie.getRating()+" "+movie.getDirector()+" $"+movie.getBOG());
			}
		}
		System.out.println("Good bye");
	}

}
