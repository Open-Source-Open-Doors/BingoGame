
import java.util.*;
import java.io.*;


public class BingoLola{

    ArrayList<Integer> list = new ArrayList<>();
    //int [][]arr = new int [5][5];
    int[] stream;
    int[][] card;
    boolean[][] marks;

    public BingoLola()
    {
        card   = new int[5][5];
        stream = new int[75];
        marks  = new boolean[5][5];
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
        FileWriter writer = new FileWriter("output.txt");
        BufferedWriter buffer = new BufferedWriter(writer);

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

        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                card[2][2] = 0;
                card[0][j] = ((int) (Math.random() * 15));
                list.add(card[0][j]);
                buffer.write(card[0][j] + " ");
                buffer.newLine();

                card[1][j] = ((int) (Math.random() * range)) + min;
                list.add(card[1][j]);
                buffer.write(card[1][j] + " ");


                card[2][j] = ((int) (Math.random() * range2)) + min2;
                list.add(card[2][j]);
                buffer.write(card[2][j] + " ");


                card[3][j] = ((int) (Math.random() * range3)) + min3;
                list.add(card[3][j]);
                buffer.write(card[3][j] + " ");


                card[4][j] = ((int) (Math.random() * range4)) + min4;
                list.add(card[4][j]);
                buffer.write(card[4][j] + " ");


                int num = card[i][j];

                for (int z = j + 1; z < card.length; z++) {
                    if (list.equals(num)) {
                        list.remove(num);
                    }
                }

            }

            System.out.println("Success");
            buffer.close();
        }
    }


    /**
     * Shuffles the list of numbers
     * Prevents repetition
     */
    ///Test the shuffle Method to ensure it works as intended
    public void shuffle(ArrayList<Integer> list) throws RuntimeException {

        //converts arraylist to an array arrgh[]
        Integer[] arrgh = new Integer[list.size()];
        arrgh = list.toArray(arrgh);
        int i = 0;
        int j = 0;
        //check this one ->
        //int temp = Integer.parseInt(null);
        int temp = 0;

        for (i = arrgh.length - 1; i > 0; i -= 1) {
            j = (int) Math.floor(Math.random() * (i + 1));
            temp = arrgh[i];
            arrgh[i] = arrgh[j];
            arrgh[j] = temp;
        }


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
    public int playGame() throws RuntimeException {

        return 0;
    }

    public static int generateMinMax(int min, int max) {

        int range = (max - min) + 1;

        return (int)(Math.random() * range) + min;
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
        BingoLola game = new BingoLola();
        game.write("output.txt");

        //row x column



        }
    }





