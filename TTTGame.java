/*
 * Mark Kwayisi
 */
	import java.util.Scanner;
	public class TTTGame {
		public static Scanner sc = new Scanner(System.in);

		public static void main(String[] args)
		{

		    final int SIZE = 3;
		    char[][] board = new char[SIZE][SIZE]; // Tic Tac Toe Board

		    resetBoard(board); // Initialize The Board 

		    
		    System.out.println(" Welcome to Tic Tac Toe Journey !\n"); // Welcomes User To The Game And Creates The Game Board.
		    showBoard(board);

		    
		    System.out.print(" Which symbol do you want to play, \"X\" or \"O\"? "); // Prompts The User To Choose A Symbol; Ignoring The Case
		    char userSymbol = sc.next().toLowerCase().charAt(0);
		    char compSymbol = (userSymbol == 'x') ? 'o' : 'x';

		   
		    System.out.println();  // Asks User If The Want The First Drive 
		    System.out.print(" Do you want to go first (Y/N)? ");
		    char ans = sc.next().toLowerCase().charAt(0);

		    int turn; // 0 = User Turn, 1 = CPU Turn
		    int remainCount = SIZE * SIZE; // Cell Count

		    
		    if (ans == 'y') { // First Move 
		      turn = 0;
		      userPlay(board, userSymbol); // User Places First Symbol
		    }
		    else {
		      turn = 1;
		      compPlay(board, compSymbol); // Computer Places First Symbol
		    }
		   // Shows The Board And Remaining Spaces
		    showBoard(board);
		    remainCount--;

		    // Game Continues Until A Winner Is Declared
		    boolean done = false;
		    int winner = -1;   // 0 = User, 1 = CPU, -1 = Draw

		    while (!done && remainCount > 0) {
		     // Winner Sets Done Flag To True 
		      done = isGameWon(board, turn, userSymbol, compSymbol); // Did the turn won?

		      if (done)
		        winner = turn; // Last Move Wins The Game 
		      else {
		        // Winner Has Not Been Decided, Continue On 
		        turn = (turn + 1 ) % 2;

		        if (turn == 0)
		          userPlay(board, userSymbol);
		        else
		          compPlay(board, compSymbol);

		        // Shows Board After One Move
		        showBoard(board);
		        remainCount--;
		      }
		    }

		    // Winner Is Found And Declared.
		    if (winner == 0)
		      System.out.println("\n Lucky Win!! ");
		    else if (winner == 1)
		      System.out.println("\n** I knew you'd LOSE!");
		    else
		      System.out.println("\n It's a TIE my friend!");

		}

		public static void resetBoard(char[][] brd)
		{
		    for (int i = 0; i < brd.length; i++)
		      for (int j = 0; j < brd[0].length; j++)
		        brd[i][j] = ' ';
		}

		public static void showBoard(char[][] brd)
		{
		    int numRow = brd.length;
		    int numCol = brd[0].length;

		    System.out.println();

		    // First Column Header
		    System.out.print("    ");
		    for (int i = 0; i < numCol; i++)
		      System.out.print(i + "   ");
		    System.out.print('\n');

		    System.out.println(); // 

		    // Write The Table 
		    for (int i = 0; i < numRow; i++) {
		      System.out.print(i + " ");
		      for (int j = 0; j < numCol; j++) {
		        if (j != 0)
		          System.out.print("||");
		        System.out.print(" " + brd[i][j] + " ");
		      }

		      System.out.println();

		      if (i != (numRow - 1)) {
		        // Seperator Line 
		        System.out.print("   ");
		        for (int j = 0; j < numCol; j++) {
		          if (j != 0)
		            System.out.print("*");
		          System.out.print("----");
		        }
		        System.out.println();
		      }
		    }
		    System.out.println();
		}

		public static void userPlay(char[][] brd, char usym)
		{
		    System.out.print("\nEnter co ordinates: ");
		    int rowIndex = sc.nextInt();
		    int colIndex = sc.nextInt();

		    while (brd[rowIndex][colIndex] != ' ') {
		      System.out.print("\n!! The cell is already taken.\nEnter co ordinates: ");
		      rowIndex = sc.nextInt();
		      colIndex = sc.nextInt();
		    }

		    brd[rowIndex][colIndex] = usym;
		}

		public static void compPlay(char[][] brd, char csym)
		{
		    // Finds Empty Sell And Places Symbol There 
		    for (int i = 0; i < brd.length; i++) {
		      for (int j = 0; j < brd[0].length; j++) {
		        if (brd[i][j] == ' ') { // Empty Cell 
		          brd[i][j] = csym;
		          return;
		        }
		      }
		    }
		}

		public static boolean isGameWon(char[][] brd, int turn, char usym, char csym)
		{
		    char sym;
		    if (turn == 0)
		      sym = usym;
		    else
		      sym = csym;

		    int i, j;
		    boolean win = false;

		    // Checks Win By Row 
		    for (i = 0; i < brd.length && !win; i++) {
		      for (j = 0; j < brd[0].length; j++) {
		        if (brd[i][j] != sym)
		          break;
		      }
		      if (j == brd[0].length)
		        win = true;
		    }

		    // Checks Win By Column
		    for (j = 0; j < brd[0].length && !win; j++) {
		      for (i = 0; i < brd.length; i++) {
		        if (brd[i][j] != sym)
		          break;
		      }
		      if (i == brd.length)
		        win = true;
		    }

		    // Checks Win By Diagonal (1)
		    if (!win) {
		      for (i = 0; i < brd.length; i++) {
		        if (brd[i][i] != sym)
		          break;
		      }
		      if (i == brd.length)
		        win = true;
		    }

		    // Checks Win By Diagonal (2)
		    if (!win) {
		      for (i = 0; i < brd.length; i++) {
		        if (brd[i][brd.length - 1 - i] != sym)
		          break;
		      }
		      if (i == brd.length)
		        win = true;
		    }

		    // Finally Return Win
		    return win;
		}
		}

