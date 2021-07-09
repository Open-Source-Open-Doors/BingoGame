//package bingodriver;
import java.util.*;

public class BingoOmar
{
	private Random rand = new Random();
	private int[][] card;       //Bingo card configuration
	private int [] stream;       //list of 75 integers
	private boolean[][] marks;  //simulates placing chips on a Bingo card

	public BingoOmar(int [][] card, int[] stream, boolean [][]marks) {
		this.card = card;
		this.stream = stream;
		this.marks = marks;
	}

	public BingoOmar()
	{
		card   = new int[5][5];
		stream = new int[75];
		marks  = new boolean[5][5];
	}
	public int[][] getcard() {
		return card;
	}

	public void setcard(int [][] card) {
		this.card = card;
	}

	public int [] getstream() {
		return stream;
	}

	public void setStream(int [] stream) {
		this.stream = stream;
	}
	public boolean [][] getmarks() {
		return marks;
	}

	public void setmarks(boolean [][]marks) {
		this.marks = marks;
	}

  //arraylist to add the numbers that are used in the bingo chart. If number is not a duplicate, boolean value will become true, and the number will be added to the arraylist. 
  //While the number is already in the arraylist(it's a duplicate) loop will continue running until it isn't.
  public void write(String outputFile) 
	{
		Random rand=new Random();
		ArrayList <Integer>cardNumUsed=new ArrayList<Integer>();
		 for(int row = 0; row < card.length; row++)             
		 {
			 int r = 0;
			 boolean inside=false;		 
		   while(!false)
		   {
          r = rand.nextInt(15)+1;
		      if(!cardNumUsed.contains(r))
		      {
		          inside = true;
		          cardNumUsed.add(r);      
		      }
			   card[row][0]=r;
			   inside=false;
		    }
		    /**card[row][0]=r;
		      inside=false;
			 **/
		 }
		 for(int row = 0; row < card.length; row++)
		 {
			 int r = 0;
			 boolean inside=false;		 
		        while(!false)
		        {
		            r = rand.nextInt(15)+16;
		            if(!cardNumUsed.contains(r))
		            {
		                inside = true;
		                cardNumUsed.add(r);
		            }
					card[row][1]=r;
					inside=false;
		        }
		      /**
			   card[row][1]=r;
		      inside=false;
			   **/
		 }
		 for(int row = 0; row < card.length; row++)
		 {
			 int r = 0;
			 boolean inside=false;		 
		        while(!false)
		        {
		            r = rand.nextInt(15)+31;
		            if(!cardNumUsed.contains(r))
		            {
		                inside = true;
		                cardNumUsed.add(r);
		            }
					card[row][2]=r;
					inside=false;
		        }
		        /**
		      card[row][2]=r;
		      inside=false;
				 **/
		 }
		 for(int row = 0; row < card.length; row++)
		 {
			 int r = 0;
			 boolean inside=false;		 
		        while(!false)
		        {
		            r = rand.nextInt(15)+46;
		            if(!cardNumUsed.contains(r))
		            {
		                inside = true;
		                cardNumUsed.add(r);
		            }
					card[row][3]=r;
					inside=false;
		        }
		      /**
		      card[row][3]=r;
			   inside=false;
		       **/

		 }
		 for(int row = 0; row < card.length; row++)
		 {
			 int r = 0;
			 boolean inside=false;		 
		        while(!false)
		        {
		            r = rand.nextInt(15)+61;
		            if(!cardNumUsed.contains(r))
		            {
		                inside = true;
		                cardNumUsed.add(r);
		            }
					card[row][4]=r;
					inside=false;
		        }
		        /**
		      card[row][4]=r;
		      inside=false;
				 **/
		 }
		
		
		
		
	}

   public void shuffle(ArrayList<Integer> list)
   {

	   Random num=new Random();
	   int x=0;
	   for(int i=0;i<list.size();i++) 
	   {
		   x=num.nextInt(75)+1;

		   //list[i]=list[x];
		   list.set(i,list.get(x));
	   }
		
   }

   public void read(String inputFile) 
   {
		
	}

   public int playGame()
   {
			return -1;
	}
}
