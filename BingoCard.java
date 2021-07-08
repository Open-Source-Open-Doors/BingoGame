public class BingoCard{
    int [][] card;
    int[] stream;             //list of 75 integers
    boolean[][] marks;        //Places the marks on the bingo card when the user has a number
    int position;              //Determines the positions the user won in (vertical, horizontal, and diagonal)
    
    Random rand = new Random();
    int rand_int = rand.nextInt(75);
    
    public Bingo(){
        card = new int[5][5];
        stream = new int[75];
        marks = new boolean[5][5];
    }
    
    
    public void write(String outputFile)throws IOException{
		throw new RuntimeException ("You need to implement this method");
	}
    
    public void shuffle(ArrayList<Integer> list)
   {
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
            }
        }
        //checks for marks in a column (vertical)
        for( int vertical = 0; vertical < 5; vertical++){
            if(card[0][vertical] == 0 && card[1][vertical] == 0 && card[2][vertical] == 0 && card[3][vertical] == 0 && card[4][vertical] == 0){
              System.out.print("Crongrats, you won! All of the spots in the column were marked");
            }
        }
        
        //checks for marks in the first diagonal from left to right
        if(card[0][0] == 0 && card[1][1] == 0 && card[2][2] == 0 && card[3][3] == 0 && card[4][4] == 0){
            System.out.print("Crongrats, you won! All of the spots in the diagonal were marked");
        }
        
        //checks for marks in the first diagonal from right to left
        if(card[0][4] == 0 && card[1][3] == 0 && card[2][2] == 0 && card[3][1] == 0 && card[4][0] == 0){
            System.out.print("Crongrats, you won! All of the spots in the diagonal were marked");
        }
        
        //checks the four the corners to see if there marked
        if(card[0][0] == 0 && card[4][0] == 0 && card[0][4] == 0 && card[4][4]){
            System.out.print("Crongrats, you won! All of the spots in the 4 corners were marked");
        }
             
	}
    
    /*
    public void shuffle(){
         //Arralylist represents the bingo card
        List<List<Integer>> card = new ArrayList<>();
    
    
        //Prints the random numbers into all 5 rows
        for(int k = 0, low = 0; k < 5; k++, low += 15 ){
            
            //nums is the list integers that will be added into the card arraylist
            List<Integer> nums = new ArrayList<>();
                card.add(nums);              
            
            
            
            for(int l = 1; l <= 15; l++){
                nums.add(low + l);          //Adds all the numbers into the nums list until reaches 75 integers 
                Collections.shuffle(nums);  //Shuffles the arrangement of numbers
            }
        }
        
      }
      
      */
    
    /*
    
    public void printCard(){
        System.out.println("B\t|\tI\t|\tN\t|\tG\t|\tO");
        for( int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
               System.out.printf("%2d", card.get(j).get(i));
                if(j<4) System.out.printf("\t|\t");
            }
            System.out.println();
        }      
    }
    
    */
    
    
    
    }
    
