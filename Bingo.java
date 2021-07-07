import java.util.*;


public class Bingo{

public static void main(String[] args){
    
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
        
        //Shows the bingo card
        System.out.println("B\t|\tI\t|\tN\t|\tG\t|\tO");
        for( int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
               System.out.printf("%2d", card.get(j).get(i));
                if(j<4) System.out.printf("\t|\t");
            }
            System.out.println();
        }
    
   }

}