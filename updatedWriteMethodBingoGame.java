
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class updatedWriteMethodBingoGame
{
	private Random rand = new Random();
	private int[][] card;       //Bingo card configuration
	private int[] stream;       //list of 75 integers
	private boolean[][] marks;  //simulates placing chips on a Bingo card


	public updatedWriteMethodBingoGame()  {
		card   = new int[5][5];
		stream = new int[75];
		marks  = new boolean[5][5];
	}

	public void write(String outputFile) throws IOException {
		FileWriter writer = new FileWriter(outputFile);
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

				//My for loop
				//for (int i=0;i<stream.length;i++) {
				//buffer.write(cardNumUsed+" ");
				//}

                 //Omer's For loop
				//for (int i=0;i<stream.length;i++) {
				//buffer.write(stream[i]+" ");
				//}

		shuffle(streamNumbers);
		buffer.write(streamNumbers.stream()
				.map(Object::toString)
				.collect(Collectors.joining(" ")));
		
		buffer.close();
	}

	public void shuffle(ArrayList<Integer> list) throws RuntimeException, IOException {
		FileWriter writer = new FileWriter("output.txt");
		BufferedWriter buffer = new BufferedWriter(writer);

		// Creating a object for Random class
		Random r = new Random();
		int arr[] = new int[0];
		int n =0;
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {

			// Pick a random index from 0 to i
			int j = r.nextInt(i+1);

			// Swap arr[i] with the element at random index
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}


		}


   public void read(String inputFile) 
   {
	   try {
		   FileReader reader = new FileReader(inputFile);
		   BufferedReader bufferedReader = new BufferedReader(reader);

		   String line;

		   while ((line = bufferedReader.readLine()) != null) {
			   System.out.println(line);
		   }
		   reader.close();

	   } catch (IOException e) {
		   e.printStackTrace();
	   }
   }
		


   public int playGame() {
//Iterates through stream and card arrays to see if their entries match


	   //To go through first column
	   for (int b = 0; b < 5; b++) {

		   if (stream[b] == card[b][0]) {

			   //card[b][0] = stream[b];
			   marks[b][0] = true;

			   //System.out.println(card[b][0]);

		   } else {
			   //card[b][0] = stream[b]
			   marks[b][0] = false;
		   }


		   if (stream[b] == card[b][1]) {

			   //card[b][0] = stream[b]
			   marks[b][1] = true;

			   // System.out.println(card[b][1]);
		   } else {
			   //card[b][0] = stream[b]
			   marks[b][1] = false;
		   }


		   if (stream[b] == card[b][2]) {

			   //card[b][0] = stream[b]
			   marks[b][2] = true;
			   // System.out.println(card[b][2]);


		   } else {
			   //card[b][0] = stream[b]
			   marks[b][2] = false;
		   }


		   if (stream[b] == card[b][3]) {

			   //card[b][0] = stream[b]
			   marks[b][3] = true;


			   //System.out.println(card[b][3]);

		   } else {
			   //card[b][0] = stream[b]
			   marks[b][3] = false;
		   }

		   if (stream[b] == card[b][4]) {

			   //card[b][0] = stream[b]
			   marks[b][4] = true;

			   //System.out.println(card[b][4]);

		   } else {
			   //card[b][0] = stream[b]
			   marks[b][4] = false;
		   }


	   }

	   //To go through second column
	   for (int i = 5; i < 10; i++) {

		   for (int vi = 0; vi < 5; vi++) {

			   if (stream[i] == card[vi][0]) {

				   //card[vi][0] = stream[i]
				   marks[vi][0] = true;
				   //System.out.println(card[vi][0]);
			   } else {
				   //card[b][0] = stream[b]
				   marks[vi][0] = false;
			   }

			   if (stream[i] == card[vi][1]) {

				   //card[b][0] = stream[b]
				   marks[vi][1] = true;
				   //System.out.println(card[vi][1]);
			   } else {
				   //card[b][0] = stream[b]
				   marks[vi][1] = false;
			   }


			   if (stream[i] == card[vi][2]) {

				   //card[b][0] = stream[b]
				   marks[vi][2] = true;
				   //System.out.println(card[vi][2]);
			   } else {
				   //card[b][0] = stream[b]
				   marks[vi][2] = false;
			   }


			   if (stream[i] == card[vi][3]) {

				   //card[b][0] = stream[b]
				   marks[vi][3] = true;
				   //System.out.println(card[vi][3]);

			   } else {
				   //card[b][0] = stream[b]
				   marks[vi][3] = false;
			   }

			   if (stream[i] == card[vi][4]) {

				   //card[b][0] = stream[b]
				   marks[vi][4] = true;
				   //System.out.println(card[vi][4]);

			   } else {
				   //card[b][0] = stream[b]
				   marks[vi][4] = false;
			   }
		   }

	   }


	   //To go through third column
	   for (int n = 10; n < 15; n++) {
		   for (int vn = 0; vn < 5; vn++) {

			   if (stream[n] == card[vn][0]) {

				   //card[vi][0] = stream[i]
				   marks[vn][0] = true;
				   //System.out.println(card[vn][0]);
			   } else {
				   //card[b][0] = stream[b]
				   marks[vn][0] = false;
			   }

			   if (stream[n] == card[vn][1]) {

				   //card[b][0] = stream[b]
				   marks[vn][1] = true;
				   // System.out.println(card[vn][1]);
			   } else {
				   //card[b][0] = stream[b]
				   marks[vn][1] = false;
			   }


			   if (stream[n] == card[vn][2]) {

				   //card[b][0] = stream[b]
				   marks[vn][2] = true;
				   //System.out.println(card[vn][2]);

			   } else {
				   //card[b][0] = stream[b]
				   marks[vn][2] = false;
			   }


			   if (stream[n] == card[vn][3]) {

				   //card[b][0] = stream[b]
				   marks[vn][3] = true;
				   // System.out.println(card[vn][3]);

			   } else {
				   //card[b][0] = stream[b]
				   marks[vn][3] = false;
			   }

			   if (stream[n] == card[vn][4]) {

				   //card[b][0] = stream[b]
				   marks[vn][4] = true;
				   // System.out.println(card[vn][4]);

			   } else {
				   //card[b][0] = stream[b]
				   marks[vn][4] = false;
			   }
		   }
	   }

	   //To go through fourth column
	   for (int g = 15; g < 20; g++) {

		   for (int vg = 0; vg < 5; vg++) {

			   if (stream[g] == card[vg][0]) {

				   //card[vi][0] = stream[i]
				   marks[vg][0] = true;
				   //  System.out.println(card[vg][0]);
			   } else {
				   //card[b][0] = stream[b]
				   marks[vg][3] = false;
			   }

			   if (stream[g] == card[vg][1]) {

				   //card[b][0] = stream[b]
				   marks[vg][1] = true;
				   // System.out.println(card[vg][1]);
			   } else {
				   //card[b][0] = stream[b]
				   marks[vg][1] = false;
			   }


			   if (stream[g] == card[vg][2]) {

				   //card[b][0] = stream[b]
				   marks[vg][2] = true;
				   //   System.out.println(card[vg][2]);

			   } else {
				   //card[b][0] = stream[b]
				   marks[vg][2] = false;
			   }


			   if (stream[g] == card[vg][3]) {

				   //card[b][0] = stream[b]
				   marks[vg][3] = true;
				   // System.out.println(card[vg][3]);

			   } else {
				   //card[b][0] = stream[b]
				   marks[vg][3] = false;
			   }

			   if (stream[g] == card[vg][4]) {

				   //card[b][0] = stream[b]
				   marks[vg][4] = true;
				   //  System.out.println(card[vg][4]);

			   } else {
				   //card[b][0] = stream[b]
				   marks[vg][4] = false;
			   }

		   }
	   }

	   //To go through fifth column
	   for (int o = 20; o < 25; o++) {

		   for (int vo = 0; vo < 5; vo++) {

			   if (stream[o] == card[vo][0]) {

				   //card[vi][0] = stream[i]
				   marks[vo][4] = true;
				   //   System.out.println(card[vo][0]);
			   } else {
				   //card[b][0] = stream[b]
				   marks[vo][4] = false;
			   }

			   if (stream[o] == card[vo][1]) {

				   //card[b][0] = stream[b]
				   marks[vo][1] = true;
				   //  System.out.println(card[vo][1]);
				   //System.out.println("This is a match");
			   } else {
				   //card[b][0] = stream[b]
				   marks[vo][1] = false;
			   }


			   if (stream[o] == card[vo][2]) {

				   //card[b][0] = stream[b]
				   marks[vo][2] = true;
				   //System.out.println(card[vo][2]);

			   } else {
				   //card[b][0] = stream[b]
				   marks[vo][2] = false;
			   }


			   if (stream[o] == card[vo][3]) {

				   //card[b][0] = stream[b]
				   marks[vo][3] = true;
				   //System.out.println(card[vo][3]);

			   } else {
				   //card[b][0] = stream[b]
				   marks[vo][3] = false;
			   }

			   if (stream[o] == card[vo][4]) {

				   //card[b][0] = stream[b]
				   marks[vo][4] = true;
				   // System.out.println(card[vo][4]);

			   } else {
				   //card[b][0] = stream[b]
				   marks[vo][4] = false;

			   }

		   }

	   }


	   //checks for marks in a rows (horizontal)
	   for (int row = 0; row < 5; row++) {

		   if (marks[row][0] == true && marks[row][1] == true && marks[2][row] == true && marks[row][3] == true && marks[row][4] == true) {
			   System.out.print("Congrats, you won! All of the spots in the row were marked");
			   return card[row][4];


		   }
	   }
	   //checks for marks in a column (vertical)
	   for (int column = 0; column < 5; column++) {
		  if (marks[0][column] == true &&  marks[1][column] == true && marks[2][column] == true && marks[3][column] == true && marks[4][column] == true) {
			   System.out.print("Congrats, you won! All of the spots in the column were marked");
			   //System.out.println(card[4][column]);
			  	return card[4][column];

		   }
	   }
		//Test condition
	   //checks for marks in the first diagonal from left to right
	   if (marks[0][0] == true && marks[1][1] == true && marks[2][2]== true && marks[3][3] == true && marks[4][4] == true) {
		   System.out.print("Congrats, you won! All of the spots in the diagonal were marked");
		   //.out.println(card[4][4]);

		   return card[4][4];
	   }

	   //Test condition
	   //checks for marks in the first diagonal from right to left
	    if (marks[0][4] == true && marks[1][3] == true && marks[3][1] == true && marks[2][2]== true && marks[4][0] == true) {
		   System.out.print("Congrats, you won! All of the spots in the diagonal were marked");
		   //System.out.println(card[4][0]);
		   return card[4][0];
	   }

	   //checks the four the corners to see if there marked
	   if (marks[0][0] == true && marks[4][0] == true && marks[0][4] == true && marks[4][4] == true) {
		   System.out.print("Congrats, you won! All of the spots in the 4 corners were marked");
		   //System.out.println(card[4][4]);

		   return card[4][4];
	   }else
		return 0;
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
		game.read("C:\\Users\\lolas\\IdeaProjects\\ODXOS\\output.txt");

		int x = game.playGame();
		game.playGame();

		System.out.println("the winning number is " + x);




	}
}
