import java.util.*;
import java.io.*;

public class Bingo
{
	private Random rand = new Random();
	private int[][] card;       //Bingo card configuration
	private int[] stream;       //list of 75 integers
	private boolean[][] marks;  //simulates placing chips on a Bingo card

	public Bingo()
	{
		card   = new int[5][5];
		stream = new int[75];
		marks  = new boolean[5][5];
	}

 /**
   * This method writes a random Bingo card configuration and a stream of random number between 1 and 75 to the output file.
   *
   * The first column in the table contains only integers between 1 and 15, the second column numbers are all between 16 and 30,
   * the third column numbers are 31 to 45 and the fourth 46-60, and the fifth 61-75.
   *
   * There are no duplicate numbers on a Bingo card.
   */
	public void write(String outputFile)  throws IOException
	{   
		FileWriter writer = new FileWriter("test1.txt");
		throw new RuntimeException ("You need to implement this method");
	}

 /**
   *  Shuffles the list of numbers
   */
   public void shuffle(ArrayList<Integer> list)
   {
		//swaps k-th index with a random index

		throw new RuntimeException ("You need to implement this method");
   }


 /**
   * This method reads a given inputFile that contains a Bingo card configuration and
   * a stream of numbers between 1 and 75.
   * .
   * A Bingo card configuration is stored in the card array.
   * A list of 75 integers is stored in the stream array.
   */
   public void read(String inputFile) throws IOException
   {
		throw new RuntimeException ("You need to implement this method");
	}


 /**
   * This method returns the first integer from the stream array that
   * gives you the earliest winning condition.
   *
   * - all the spots in a column are marked
   * - all the spots in a row are marked
   * - all the spots in either of the two diagonals are marked
   * - all four corner squares are marked
   */
   public int playGame()
   {
		throw new RuntimeException ("You need to implement this method");
	}
}



