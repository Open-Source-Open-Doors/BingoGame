import java.io.*;
import java.util.*;

public class Bingo
{
   public static void main (String[] args) throws IOException
   {
       
        bCard game = new bCard();
        
		game.write("output.txt");
        game.read("output.txt");
       
		int x = game.playGame();
		game.playGame();
		System.out.println("the winning number is " + x);                
	}
}