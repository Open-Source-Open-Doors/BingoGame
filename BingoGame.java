import java.util.*;
import java.io.*;
import java.lang.Math;

 
public class BingoGame 
{
  
  ArrayList<Integer> B = new ArrayList<>();
  ArrayList<Integer> I = new ArrayList<>();
  ArrayList<Integer> N = new ArrayList<>();
  ArrayList<Integer> G = new ArrayList<>();
  ArrayList<Integer> O = new ArrayList<>();
  Random randomB = new Random();
  Random randomI = new Random();
  Random randomN = new Random();
  Random randomG = new Random();
  Random randomO = new Random();
  Random randomNumber = new Random();
    
  int column;
  int row;
      
 
  public static void main(String[] args) throws IOException 
  {
    InputStreamReader inStream = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(inStream);
    System.out.println("B | I | N | G | O |");
 
    int[][] board = new int[5][5];
    
    
    /* For loops that represent B-I-N-G-O */
 
    for (int b = 1; b <= 15; b++) 
    {      
      /* Random Bs */
      int randomb = randomB.nextInt(15 - 1) + 1;
      
      if (numCheck(B, randomb)) 
      {
        B.add(randomb);
      }
    }
    
    for (int i = 16; i <= 30; i++) 
    {
      /* Random Is */
      int randomi = randomI.nextInt(30 - 16) + 16;
      
      if (numCheck(I, randomi)) 
      {
        I.add(randomi);
      }
    }
    
    for (int n = 31; n <= 45; n++) 
    {
      /* Random Ns */
      int randomn = randomN.nextInt(45 - 31) + 31;
      
      if (numCheck(N, randomn)) 
      {
        N.add(randomn);
      }
    }
    
    for (int g = 46; g <= 60; g++) 
    {
      /* Random Gs */
      int randomg = randomG.nextInt(60 - 46) + 46;
      
      if (numCheck(G, randomg)) 
      {
        G.add(randomg);
      }
    } 
    
    for (int o = 61; o <= 75; o++) 
    {
      /* Random Os */
      int randomo = randomO.nextInt(75 - 61) + 61;
      
      if (numCheck(O, randomo)) 
      {
        O.add(randomo);
      }
    }
    boardDisplay(board);
         
    int randomNum = randomNumber.nextInt (75 - 1) + 1;
    System.out.print("" + randomNum);
  }
  
  public void boardDisplay(int[][] board) 
  {
    for (int count = 0; count < board.length; count++) 
    {
      System.out.println("");
      System.out.print(B.get(count) + "|---|---|---|---|---|");
      System.out.print(I.get(count) + "|---|---|---|---|---|");
      System.out.print(N.get(count) + " | ");
      System.out.print(G.get(count) + " | ");
      System.out.print(O.get(count) + " | ");
    }
  }
  
     
  public boolean numCheck(ArrayList<Integer> check, int num) 
  {
    for (int count = 0; count < check.size(); count++) 
    {
      if (check.get(count) == num) 
      {
        return false;
      }
    }
    return true;
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
