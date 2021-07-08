import java.io.*;
import java.util.*;

public class BingoCard{
    int [][] card;
    int[] stream;             //list of 75 integers
    boolean[][] marks;        //Places the marks on the bingo card when the user has a number
    int position;              //Determines the positions the user won in (vertical, horizontal, and diagonal)
    

    
    public BingoCard(){
        card = new int[5][5];
        stream = new int[75];
        marks = new boolean[5][5];
    }
    
    
   /**
   * This method writes a random Bingo card configuration and a stream of random
   * number between 1 and 75 to the output file.
   *
   * The first column in the table contains only integers between 1 and 15,
   * the second column numbers are all between 16 and 30, the third are 31 to 45,
   * the fourth 46-60, and the fifth 61-75.
   *
   * There are no duplicate numbers on a Bingo card.
   */
    
    public void write(String outputFile) throws IOException{
		//throw new RuntimeException ("You need to implement this method");
        
        //Scanner fin = new Scanner(new File(outputFile));
        Scanner fin = null;
        //Counts the number of lines ile
        int count = 0;
        try{
            
            fin =  new Scanner(new File(outputFile));
            
            while(fin.hasNextInt()){
                
                stream[count++] = fin.nextInt();
                
                if(count == 75){
                    break;
                }
            }
            
            for(int i = 0; i < stream.length; i++){
                System.out.println(stream[i]);
            }
        }
        
        //Add the elements into the stream array
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
	}
    
    public void shuffle(ArrayList<Integer> list){
		//swaps k-th index with a random index

		throw new RuntimeException ("You need to implement this method");
   }
    
    
    public void read(String inputFile) throws IOException{
		throw new RuntimeException ("You need to implement this method");
	}
    
    
    
    public int playGame(){
        
		//checks for marks in a rows (horizontal)
        for( int horizontal = 0; horizontal < 5; horizontal++){
            
            if(card[horizontal][0] == 0 && card[horizontal][1] == 0 && card[horizontal][2] == 0 && card[horizontal][3] == 0 && card[horizontal][4] == 0){
                System.out.print("Crongrats, you won! All of the spots in the row were marked"); 
                return 0;
            }
        }
        //checks for marks in a column (vertical)
        for( int vertical = 0; vertical < 5; vertical++){
            if(card[0][vertical] == 0 && card[1][vertical] == 0 && card[2][vertical] == 0 && card[3][vertical] == 0 && card[4][vertical] == 0){
              System.out.print("Crongrats, you won! All of the spots in the column were marked");
              return 0;
            }
        }
        
        //checks for marks in the first diagonal from left to right
        if(card[0][0] == 0 && card[1][1] == 0 && card[2][2] == 0 && card[3][3] == 0 && card[4][4] == 0){
            System.out.print("Crongrats, you won! All of the spots in the diagonal were marked");
            return 0;
        }
        
        //checks for marks in the first diagonal from right to left
        if(card[0][4] == 0 && card[1][3] == 0 && card[2][2] == 0 && card[3][1] == 0 && card[4][0] == 0){
            System.out.print("Crongrats, you won! All of the spots in the diagonal were marked");
            return 0;
        }
        
        //checks the four the corners to see if there marked
        if(card[0][0] == 0 && card[4][0] == 0 && card[0][4] == 0 && card[4][4] == 0){
            System.out.print("Crongrats, you won! All of the spots in the 4 corners were marked");
            return 0;
        }
        
        return 0;
             
	} 
    
    
    
    
    }
    
