import java.io.*;
import java.util.*;
import java.util.Random;


public class BingoCard{
    int [][] card;
    int[] stream;             //list of 75 integers
    boolean[][] marks;        //Places the marks on the bingo card when the user has a number
    int position;              //Determines the positions the user won in (vertical, horizontal, and diagonal)
    Random randomNum = new Random();

    
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
        
        //counts the number of integers in the file
        int count = 0;
        try{
            
            fin =  new Scanner(new File(outputFile));
            
            //Runs until the file has reached all integers
            while(fin.hasNextInt()){
                
                stream[count++] = fin.nextInt();
                
                if(count == 75){
                    break;
                }
            }
            
            /*for(int i = 0; i < stream.length; i++){
                System.out.println(stream[i]);
            }*/
            
           }
        
        //Add the elements into the stream array
        catch(FileNotFoundException e){
            System.out.println("File not found");
            
            }
        
        
        //Loop to add into the bingo card, numbers 1-15
        
        
        for(int b = 1; b < 15; b++){
            for(int j = 0; j < 5; j++){
             
            
                card[i][j] = randomNum.nextInt(15-1) + 1;
          }
            //System.out.println(card[i][j]); 
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
        
        //Iterates through stream and card arrays to see if their entries match
        
        //To go through first column
        for( int b = 0; b < 5; b++){

            if (stream[b] == card[b][0]){
		
                //card[b][0] = stream[b]
                marks[b][0] == true;

            }
            else{
                //card[b][0] = stream[b]
                marks[b][0] == false;
              }
        }
        
        //To go through second column
        for( int i = 5, vi = 0; i < 10; i++, vi++){

            if (stream[i] == card[vi][1]){
		
                //card[vi][0] = stream[i]
                marks[vi][1] = true;
                }
            
            else{
                //card[b][0] = stream[b]
                marks[vi][1] == false;
              }
        }
        
        //To go through third column
        for( int n = 10, vn = 0; n < 15; n++, vn++){

            if (stream[n] == card[vn][2]){
		
                //card[vi][0] = stream[i]
                marks[vn][2] = true;
                }
            
            else{
                //card[b][0] = stream[b]
                marks[vn][2] == false;
              }
        }
        
        //To go through fourth column
        for( g = 15 vg = 0; g < 20; g++, vg++){

            if (stream[g] == card[vg][3]){
		
                //card[vi][0] = stream[i]
                marks[vg][3] = true;
                }
            
            else{
                //card[b][0] = stream[b]
                marks[vg][3] == false;
              }
        }
        
        //To go through fifth column
        for( o = 20 vo = 0; o < 25; o++, vo++){

            if (stream[o] == card[vo][4]){
		
                //card[vi][0] = stream[i]
                marks[vo][4] = true;
                }
            
            else{
                //card[b][0] = stream[b]
                marks[vo][4] == false;
              }
        }
        
        
        
        
		//checks for marks in a rows (horizontal)
        for( int row = 0; row < 5; row++){
            
            if(card[row][0] == 0 && card[row][1] == 0 && card[row][2] == 0 && card[row][3] == 0 && card[row][4] == 0){
                System.out.print("Crongrats, you won! All of the spots in the row were marked"); 
                return 0;
            }
        }
        //checks for marks in a column (vertical)
        for( int column = 0; column < 5; column++){
            if(card[0][column] == 0 && card[1][column] == 0 && card[2][column] == 0 && card[3][column] == 0 && card[4][column] == 0){
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
        
        return 0 ;
             
     }
    
       /*public void markCard(int num){
        
        for(int i = 0; i < 5; i++){
            
            for(int j = 0; j < 5; j++){
                
                if(card[i][j] == num){
                   marks[i][j] = true;
                   card[i][j] = 0;
                }
                else{
                    mark[i][j] = false;
                    
                }
                
            }
        }
    }
    */
    
    
    
    
   
    
    }
    
