
import java.util.*;
import java.io.*;
public class updatedWriteMethodBingoGame
{
	private Random rand = new Random();
	private int[][] card;       //Bingo card configuration
	private int[] stream;       //list of 75 integers
	private boolean[][] marks;  //simulates placing chips on a Bingo card
	public updatedWriteMethodBingoGame()
	{
		card   = new int[5][5];
		stream = new int[75];
		marks  = new boolean[5][5];
	}

	public void write(String outputFile) throws IOException {
		FileWriter writer = new FileWriter("output.txt");
		BufferedWriter buffer = new BufferedWriter(writer);

		int r=0;
			Random rand=new Random();
			ArrayList <Integer>cardNumUsed=new ArrayList<Integer>();
			ArrayList<Integer>streamNumbers=new ArrayList<Integer>();
			
			 boolean inside=false;
			 boolean correct=false;
			 
			for(int row = 0; row < card.length; row++)
			 {
			
				 
			        while(!inside)
			        {
			        	r = (int)(Math.random()*15)+1;
			            if(!cardNumUsed.contains(r))
			            {
			            	inside = true;
			            	cardNumUsed.add(r);
			            	
			               
			            }
			        }
			      card[row][0]=r;
			      inside=false;
			 }
			 for(int row = 0; row < card.length; row++)
			 {
							  
			        while(!inside)
			        {
			        	r= (int)(Math.random()*15)+16;
			            if(!cardNumUsed.contains(r))
			            {
			                inside = true;
			                cardNumUsed.add(r);
			            }
			        }
			        
			        
			      card[row][1]=r;
			      inside=false;
			 }
			 for(int row = 0; row < card.length; row++)
			 {
			
			 
			        while(!inside)
			        {
			        	r = (int)(Math.random()*15)+31;
			            if(!cardNumUsed.contains(r))
			            {
			                inside = true;
			                cardNumUsed.add(r);
			            }
			        }
			      card[row][2]=r;
			      inside=false;
			 }
			 for(int row = 0; row < card.length; row++)
			 {
				
						 
			        while(!inside)
			        {
			        	r = (int)(Math.random()*15)+46;
			            if(!cardNumUsed.contains(r))
			            {
			                inside = true;
			                cardNumUsed.add(r);
			            }
			        }
			      card[row][3]=r;
			      inside=false;
			 }
			 for(int row = 0; row < card.length; row++)
			 {
					 
			        while(!inside)
			        {
			        	r= (int)(Math.random()*15)+61;
			            if(!cardNumUsed.contains(r))
			            {
			                inside = true;
			                cardNumUsed.add(r);
			            }
			        }
			      card[row][4]=r;
			      inside=false;
			 }
			 
			 card[2][2]=0;
			 
			  for(int row=0;row<card.length;row++)
			  {
		            for(int col=0;col<card[row].length;col++)
		            {
		                buffer.write(card[row][col]+ "\t");
		            }
		 
		            buffer.newLine();
			  }
			
			  int s=0;
				 for (int i=0;i<75;i++) 
				 {
					  
					 while(!correct) 
					 {
						 s=rand.nextInt(75)+1;
						 if (!streamNumbers.contains(s)) 
						 {
							 correct=true;
							 streamNumbers.add(s);
						 }
								 
					 }
					 stream[i]=s;
					 correct=false;
				 }
				for (int i=0;i<stream.length;i++) {
					buffer.write(stream[i]+" ");
				}
			  
		
		
		buffer.close();
	}

   public void shuffle(ArrayList<Integer> list)
   {
		
	   Random num=new Random();
	   int x=0;
	   for(int i=0;i<list.size();i++) 
	   {
		   x=num.nextInt(75)+1;
		   list.set(i, x);
	   }
		
   }

   public void read(String inputFile) 
   {
		
	}

   public int playGame()
   {
		return -1;
	}

	public static void main(String[] args) throws IOException {


		/**
		 Bingo game = new Bingo();
		 game.write("input1.txt");
		 game.read("Test1.txt");
		 // int x = game.playGame();
		 // System.out.println("the winning number is " + x);
		 **/


		/**
		 Random rand = new Random();
		 int rand_int1 = rand.nextInt(75);
		 **/

		//uses write method to write into
		updatedWriteMethodBingoGame game = new updatedWriteMethodBingoGame();
		game.write("output.txt");

		//row x column



	}
}