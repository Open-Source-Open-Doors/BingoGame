
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
		


   public int playGame()
   {

   		int x =0;
	   //Iterates through stream and card arrays to see if their entries match

	   //To go through first column
	   for( int b = 0; b < 5; b++){

		   if (stream[b] == card[b][0]){

			   //card[b][0] = stream[b]
			   marks[b][0] = true;

		   }
		   else{
			   //card[b][0] = stream[b]
			   marks[b][0] = false;
		   }


		   if (stream[b] == card[b][1]){

			   //card[b][0] = stream[b]
			   marks[b][1] = true;
			   //my edit
			   x = card[b][1];
			   System.out.println("This is a match");
		   }
		   else{
			   //card[b][0] = stream[b]
			   marks[b][1] = false;
		   }


		   if (stream[b] == card[b][2]){

			   //card[b][0] = stream[b]

			   marks[b][2] = true;
			   x = card[b][2];

		   }
		   else{
			   //card[b][0] = stream[b]
			   marks[b][2] = false;
		   }


		   if (stream[b] == card[b][3]){

			   //card[b][0] = stream[b]
			   marks[b][3] = true;
			   x = card[b][3];

		   }
		   else{
			   //card[b][0] = stream[b]
			   marks[b][3] = false;
		   }

	   }

	   //To go through second column
	   for( int i = 5, vi = 0; i < 10; i++, vi++){

		   if (stream[i] == card[vi][1]){

			   //card[vi][0] = stream[i]
			   marks[vi][1] = true;
			   x = card[vi][1];
		   }

		   else{
			   //card[b][0] = stream[b]
			   marks[vi][1] = false;
		   }
	   }

	   //To go through third column
	   for( int n = 10, vn = 0; n < 15; n++, vn++){

		   if (stream[n] == card[vn][2]){

			   //card[vi][0] = stream[i]
			   marks[vn][2] = true;
			   x = card[vn][2];
		   }

		   else{
			   //card[b][0] = stream[b]
			   marks[vn][2] = false;
		   }
	   }

	   //To go through fourth column
	   for(int g = 15, vg = 0; g < 20; g++, vg++){

		   if (stream[g] == card[vg][3]){

			   //card[vi][0] = stream[i]
			   marks[vg][3] = true;
			   x = card[vg][1];
		   }

		   else{
			   //card[b][0] = stream[b]
			   marks[vg][3] = false;
		   }
	   }

	   //To go through fifth column
	   for(int o = 20, vo = 0; o < 25; o++, vo++){

		   if (stream[o] == card[vo][4]){

			   //card[vi][0] = stream[i]
			   marks[vo][4] = true;
			   x = card[vo][1];
		   }

		   else{
			   //card[b][0] = stream[b]
			   marks[vo][4] = false;
		   }
	   }



	   //checks for marks in a rows (horizontal)
	   for( int row = 0; row < 5; row++){

		   if(card[row][0] == 0 && card[row][1] == 0 && card[row][3] == 0 && card[row][4] == 0){
			   System.out.print("Congrats, you won! All of the spots in the row were marked");
			   return x;
		   }
	   }
	   //checks for marks in a column (vertical)
	   for( int column = 0; column < 5; column++){
		   if(card[0][column] == 0 && card[1][column] == 0 && card[3][column] == 0 && card[4][column] == 0){
			   System.out.print("Congrats, you won! All of the spots in the column were marked");
			   return 0;
		   }
	   }

	   //checks for marks in the first diagonal from left to right
	   if(card[0][0] == 0 && card[1][1] == 0 && card[3][3] == 0 && card[4][4] == 0){
		   System.out.print("Congrats, you won! All of the spots in the diagonal were marked");
		   return 0;
	   }

	   //checks for marks in the first diagonal from right to left
	   if(card[0][4] == 0 && card[1][3] == 0 && card[3][1] == 0 && card[4][0] == 0){
		   System.out.print("Congrats, you won! All of the spots in the diagonal were marked");
		   return 0;
	   }

	   //checks the four the corners to see if there marked
	   if(card[0][0] == 0 && card[4][0] == 0 && card[0][4] == 0 && card[4][4] == 0){
		   System.out.print("Congrats, you won! All of the spots in the 4 corners were marked");
		   return 0;
	   }
	   //List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
	   List<List<Integer>> list = Arrays.stream(stream).mapToObj(Arrays::asList).collect(Collectors.toList());

	   Optional<List<Integer>> first = list.stream().findFirst();

	   if (first.isPresent()) {
		   List<Integer> result = first.get();
		   System.out.println(result);       // 1

	   } else {
		   System.out.println("no value?");
	   }

	   return 0 ;


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
