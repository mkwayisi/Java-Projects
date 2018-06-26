/*
 * Mark Kwayisi
 */
import java.util.Scanner;
import java.util.Random;

public class mineWalker {
	enum Spaces {Free, Player, Marked, Goal};
	public static final int BOARD_AREA = 10;
	public static final int COLD_TERR = (BOARD_AREA/2)*(BOARD_AREA/2); // A Half Of The Board Is Cold.
	public static final int WARM_TERR = (BOARD_AREA/4)*(BOARD_AREA/4); // A Quarter Of The Board Is Warm.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				int Moves = 0; // Keeps Track Of The Number Of Moves Made By The Player.
				
				int pU = 0; // Marks The Player's Location.
				int pV = 0;
				
				Random p = new Random(); // The Goal's Location.
				int tU = p.nextInt(BOARD_AREA);
				int tV = p.nextInt(BOARD_AREA);
				
				Scanner keyboard = new Scanner(System.in); // Allows For User Input.
				
				Spaces[][] board = new Spaces[BOARD_AREA][BOARD_AREA]; // Sets Up The Board.
				
				for(int y=0;y<board.length;y++) // Initializes The Board.
				{
					for(int x=0;x<board[y].length;x++)
						{
							board[x][y] = Spaces.Free;
						}
				}
				
				board[pU][pV] = Spaces.Player; // Puts The User On The Board.
				
				board[tU][tV] = Spaces.Goal; // Puts The Goal On The Board.
				
				System.out.println("Welcome to catch me where you must catch the enemy!"); // Prompts The User.
				
				boolean gameOver = false; // Sets Up A Game Over.
				
				while(gameOver == false)
				{
					
					for(int y=0;y<board.length;y++) // Draws The Board.
					{
							for(int x=0;x<board[y].length;x++)
						{
							switch(board[x][y])
							{
								case Free:
								System.out.print("_");
								break;
								case Player:
								System.out.print("X");
								break;
								case Marked:
								System.out.print("#");
								break;
								case Goal:
								System.out.print("_");
								break;
								default:
								System.out.print("?");
								break;
							}
						}
							System.out.println(" ");
					}
					
					int distance = (pU-tU)*(pU-tU)+(pV-tV)*(pV-tV); // Calculates The Distance,  This Doesn't Use Square In Order To Save Processing Cycles.
											// Indicates Player Position.
					if(distance > COLD_TERR)// Greater Than Half The Distance The Board Is Cold.
						{
							System.out.println("You are cold!");
						}
					else if(distance>WARM_TERR)// Greater Than A Quarter Of The Board But Less Than Half The Board Distance Is Warm.
						{
							System.out.println("You are warm!");
						}
					else // Less Than A Quarter Of The Board Distance Is Hot!
						{
							System.out.println("YOU ARE HOT!!!");
						}
					
					System.out.println("Enter either -1,0,1 to move in the X or 9 to quit."); // Player Controls.
					
					int dU = keyboard.nextInt(); // X Direction Movement.
					
					if(dU == 9)// Player Ops To Quit The Game.
						{
							System.out.println("Game over!");
							break;
						}
					
					System.out.println("Enter either -1,0,1 to move in the Y.");
					
					int dV = keyboard.nextInt(); // Movement In The Y Direction.
					
					
					if(dU <-1 || dU>1) // Checks To See If The Movement Is Valid.
						{
							System.out.println("Invalid input X.");
							dU = 0;
						}
					if(dV <-1 || dV>1)
						{
							System.out.println("Invalid input Y.");
							dV = 0;
						}
					
					
					board[pU][pV] = Spaces.Marked; // Sets The Player Position To A Walked Path.
					
					pU+=dU; // Moves The Player.
					pV+=dV;

					
					if(pU < 0) // Keeps everything on the field.
						{
							pU = 0;
						}
					else if(pU>BOARD_AREA-1)
						{
							pU = BOARD_AREA-1;
						}
					if(pV < 0)
						{
							pV = 0;
						}
					else if(pV> BOARD_AREA-1)
						{
							pV = BOARD_AREA-1;
						}

					if(board[pU][pV]==Spaces.Goal) // Winning Conditions .
						{
							System.out.println("You win! The secret location was at "+tU+" "+tV);
							System.out.println("It took "+Moves+" moves");
							gameOver = true;
						}
					
						board[pU][pV] = Spaces.Player; //Sets The Player In New Position.
						Moves++;
				}
			}
		

	}


