import java.io.*;
import java.util.*;

public class Bingo
{
   public static void main (String[] args) throws IOException
   {
       
        Scanner fin = null;  //Input for the file
        int count = 0;
		BingoCard game = new BingoCard();
		game.write("test1.txt");
       
		//game.read("test2.txt");
		//int x = game.playGame();
		//System.out.println("the winning number is " + x);
        
       
       /*
       //Attempts to get input from the file
        try{
            fin = new Scanner(new File("test1.txt"));   
        }
               
        //If their is an issue with reaching the file
        catch(IOException e){
            System.out.println("Could not access file");
            System.exit(0);
        }
               
        //Saves the text from the file
        while(fin.hasNextLine()){
            
        }
        
        fin.close();
       
        for(int i = 0; i < count; i++) {
            System.out.println(game.stream[i]);
        }
        
        */
       
                 
	}
}