
import java.util.*;
import java.io.*;


public class Bingo{
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
        Bingo game = new Bingo();
        game.write(" ");

        //row x column
        int [][]arr = new int [5][5];
        int max = 30;
        int min = 16;
        int range = max - min + 1;

        int max2 = 45;
        int min2 = 31;
        int range2 = max2 - min2 + 1;

        //46-60
        int max3 = 60;
        int min3 = 46;
        int range3 = max3 - min3 + 1;

        //61-75
        int max4 = 75;
        int min4 = 61;
        int range4 = max4 - min4 + 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[2][2]= 0;
                arr[0][j] = ((int)(Math.random()*15));
                arr[1][j] = ((int)(Math.random()*range))+min;
                arr[2][j] = ((int)(Math.random()*range2))+min2;
                arr[3][j] = ((int)(Math.random()*range2))+min3;
                arr[4][j] = ((int)(Math.random()*range2))+min4;
            }

        }
        //Helps display the 2d array in the console log
        for (int[] a : arr)
        {
            for (int i : a)
            {
                System.out.print(i + "\t");
            } System.out.println("\n");
        }

        // System.out.println("Random numbers = "+Arrays.deepToString(arr));

    }



    /**
     * This method writes a random Bingo card configuration and a stream of random
     * number between 1 and 75 to the output file.
     * <p>
     * The first column in the table contains only integers between 1 and 15,
     * the second column numbers are all between 16 and 30, the third are 31 to 45,
     * the fourth 46-60, and the fifth 61-75.
     * <p>
     * There are no duplicate numbers on a Bingo card.
     */
    public void write(String outputFile) throws IOException {
        try {
            File myObj = new File("output.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        }catch(RuntimeException e){
            System.out.println("You need to implement this method");
            e.printStackTrace();
        }

        //throw new RuntimeException("You need to implement this method");
    }

    /**
     * Shuffles the list of numbers
     */
    public void shuffle(ArrayList<Integer> list) {
        //swaps k-th index with a random index

        throw new RuntimeException("You need to implement this method");
    }


    /**
     * This method reads a given inputFile that contains a Bingo card configuration and
     * a stream of numbers between 1 and 75.
     * .
     * A Bingo card configuration is stored in the card array.
     * A list of 75 integers is stored in the stream array.
     */
    public void read(String inputFile) throws IOException {
        throw new RuntimeException("You need to implement this method");
    }


    /**
     * This method returns the first integer from the stream array that
     * gives you the earliest winning condition.
     * <p>
     * - all the spots in a column are marked
     * - all the spots in a row are marked
     * - all the spots in either of the two diagonals are marked
     * - all four corner squares are marked
     */
    public int playGame() {
        throw new RuntimeException("You need to implement this method");
    }

    public static int generateMinMax(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }



}


