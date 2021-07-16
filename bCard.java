import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class bCard
{
  private Random random = new Random();
  private int[][] card;       //Bingo card configuration
  private int[] stream;       //list of 75 integers
  private boolean[][] marks;  //simulates placing chips on a Bingo card


  public bCard()
  {
    card   = new int[5][5];
    stream = new int[75];
    marks  = new boolean[5][5];
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
  public void write(String outputFile) throws IOException 
  {
    FileWriter writer = new FileWriter(outputFile);
    BufferedWriter buffer = new BufferedWriter(writer);

    int num = 0;

    Random random = new Random();

    ArrayList<Integer>cardNumUsed = new ArrayList<Integer>();
    ArrayList<Integer>streamNumbers = new ArrayList<Integer>();

    boolean inside = false;
    boolean correct = false;

    for(int row = 0; row < card.length; row++)
    {
      while(!inside)
      {
        num = (int)(Math.random() * 15) + 1;

        if(!cardNumUsed.contains(num))
        {
          inside = true;
          cardNumUsed.add(num);       
        }
      }
      card[row][0] = num;
      inside = false;
    }

    for(int row = 0; row < card.length; row++)
    {
      while(!inside)
      {
        num = (int)(Math.random() * 15) + 16;

        if(!cardNumUsed.contains(num))
        {
           inside = true;
           cardNumUsed.add(num);
        }
      } 
      card[row][1] = num;
      inside = false;
    }

    for(int row = 0; row < card.length; row++)
    {
      while(!inside)
      {
        num = (int)(Math.random() * 15) + 31;
               if(!cardNumUsed.contains(num))
               {
                   inside = true;
                   cardNumUsed.add(num);
               }
           }
         card[row][2] = num;
         inside = false;
    }

    for(int row = 0; row < card.length; row++)
    {
      while(!inside)
      {
        num = (int)(Math.random() * 15) + 46;

        if(!cardNumUsed.contains(num))
        {
          inside = true;
          cardNumUsed.add(num);
        }
      }
      card[row][3] = num;
      inside = false;
    }

    for(int row = 0; row < card.length; row++)
    {
      while(!inside)
      {
        num = (int)(Math.random() * 15) + 61;

        if(!cardNumUsed.contains(num))
        {
          inside = true;
          cardNumUsed.add(num);
        }
      }
      card[row][4] = num;
      inside = false;
    }

    card[2][2] = 0;

    for(int row = 0;row < card.length;row++)
    {
      for(int column = 0; column < card[row].length; column++)
      {
        buffer.write(card[row][column]+ "\t");
      }
      buffer.newLine();
    }

    int s = 0;

    for (int count = 0; count < stream.length; count++)
    {
      while(!correct)
      {
        s = random.nextInt(75) + 1;

        if (!streamNumbers.contains(s))
        {
          correct = true;
          streamNumbers.add(s);
        }
      }
      stream[count] = s;
      correct = false;
    }
      
    shuffle(streamNumbers);
    buffer.write(streamNumbers.stream()
    .map(Object::toString)
    .collect(Collectors.joining(" ")));

    buffer.close();
  }

  /**
  *  Shuffles the list of numbers
  *  //throw new RuntimeException ("You need to implement this method");
  */
  public void shuffle(ArrayList<Integer> list) throws RuntimeException, IOException 
  {
    FileWriter writer = new FileWriter("output.txt");
    BufferedWriter buffer = new BufferedWriter(writer);

    /* Creating a object for Random class */
    Random random = new Random();

    /* New Arraylist object 'temp' */
    ArrayList<Integer> temp = new ArrayList<Integer>(list);

    /* Start from the last element and swap one by one. */
    for (int count = 0; count < list.size(); count++) 
    {
      // Pick a random index from 0 to count
      int index = random.nextInt(list.size());

      // Swap kth index with a random index
      while(index == count || temp.get(index) == null)
      {
        index = random.nextInt(list.size());
      }
      list.set(count, temp.get(index));
      temp.set(index, null);
    }
  }

  /**
    * This method reads a given inputFile that contains a Bingo card configuration and
    * a stream of numbers between 1 and 75.
    * .
    * A Bingo card configuration is stored in the card array.
    * A list of 75 integers is stored in the stream array.
    * 
    * //throw new RuntimeException ("You need to implement this method");
  */
  public void read(String inputFile) 
  {
    try 
    {
      FileReader reader = new FileReader(inputFile);
      BufferedReader bufferedReader = new BufferedReader(reader);

      String line;

      while ((line = bufferedReader.readLine()) != null) 
      {
        System.out.println(line);
      }
      reader.close();
    }
    catch (IOException e) 
    {
      e.printStackTrace();
    }
  }

  /**
  *  This method returns the first integer from the stream array that
  *  gives you the earliest winning condition.
  *
  *  - all the spots in a column are marked
  *  - all the spots in a row are marked
  *  - all the spots in either of the two diagonals are marked
  *  - all four corner squares are marked
  * 
  */
  public int playGame() throws IOException
  {
    
      
      //Traverses through the stream array
      for(int i = 0; i < 75; i++){
          
          //Checks off the numbers in the card that match the stream
          for(int j = 0; j < card.length; j++){
              for(int k = 0; k < card[j].length; k++){
                  if(stream[i] == card[j][k]){
                      card[j][k] = 0;
                  }
              }
          }
          
          //Checks through the 4 corners
         if(card[0][0] == card[0][4] && card[4][0] == card[4][4] && card[0][0] == card[4][4]){
             return stream[i];
           }
          
         //Checks through columns in card array
          for(int col = 0; col < 5; col++){
          if(card[0][col] == card[1][col] && card[2][col] == card[3][col] && card[4][col] == card[0][col]
             && card[4][col] == card[2][col]){
                 return stream[i];
               }
          }
          
          //Checks through rows in card array
          for(int row = 0; row < 5; row++){
           if (card[row][0] == card[row][1] && card[row][2] == card[row][3] 
               && card[row][4] == card[row][0] && card[row][4] == card[row][2]){
                 return stream[i];         
                }
            }
          
           //checks the diagnols from left to right in array
            if (card[0][0] == card[1][1] && card[2][2] == card[3][3]
                && card[4][4] == card[1][1] && card[4][4] == card[2][2]) {
                    return stream[i];
              }
          
           //checks the diagnols from right to left in array
           if (card[4][0] == card[3][1] && card[2][2] == card[1][3] 
               && card[0][4] == card[4][0] && card[0][4] == card[2][2]) {
                    return stream[i];
               
           }

          
          }

      
      return -1;
  }

  
}