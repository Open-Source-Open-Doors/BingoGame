# BingoGame
package com.company;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Game {

        ArrayList Lb = new ArrayList();
        ArrayList Li = new ArrayList();
        ArrayList Ln = new ArrayList();
        ArrayList Lg = new ArrayList();
        ArrayList Lo = new ArrayList();
        boolean bingo = false;

        public void populateList() {
            Random rd = new Random();
             for (int i = 0; i < 5; i++) {
                Lb.add(rd.nextInt(15));
                Li.add(rd.nextInt(15) + 15);
                Ln.add(rd.nextInt(15) + 30);
                Lg.add(rd.nextInt(15) + 45);
                Lo.add(rd.nextInt(15) + 60);
        }
    }
        public void addlettersAndNumbers() {
            Lb.add("B");
            Li.add("I");
            Ln.add("N");
            Lg.add("G");
            Lo.add("O");
            populateList();
        }

        public void printTXT(){
            for (int i = 0; i < this.Lb.size() ; i++) {
                try {
                    FileWriter myWriter = new FileWriter("/Users/nelsonenriquez/Desktop/test1.txt");
                    myWriter.write("|\t" + this.Lb.get(i) + "\t|\t" + this.Li.get(i) + "\t|\t" + this.Ln.get(i) + "\t|\t" + this.Lg.get(i) + "\t|\t" + this.Lo.get(i) + "\t|\t");
                    myWriter.close();

                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }

        }

        public void chart() {
            System.out.println("-----------------------------------------------------------");
                for (int i = 0; i < this.Lb.size(); i++) {
                System.out.println("|\t" + this.Lb.get(i) + "\t|\t" + this.Li.get(i) + "\t|\t" + this.Ln.get(i) + "\t|\t" + this.Lg.get(i) + "\t|\t" + this.Lo.get(i) + "\t|\t");
                System.out.println("------------------------------------------------------");

                }
            }

        public ArrayList xChart(ArrayList lista, int number) {
            int pos = lista.indexOf(number);
                if (pos >= 0) {
                    lista.set(pos, "X");
        }
        return lista;
    }

        public void bingoPrint() {
            String[] bingoLetters = new String[5];
            bingoLetters[0] = "B";
            bingoLetters[1] = "I";
            bingoLetters[2] = "N";
            bingoLetters[3] = "G";
            bingoLetters[4] = "O";

            Random rd = new Random();

            String randomNumner = bingoLetters[rd.nextInt(5)];

            int numbers = rd.nextInt(15);
            switch (randomNumner) {
                case "B":
                    xChart(Lb, numbers);
                    break;
                case "I":
                    numbers += 15;
                    xChart(Li, numbers);
                    break;
                case "N":
                    numbers += 30;
                    xChart(Ln, numbers);
                    break;
                case "G":
                    numbers += 45;
                    xChart(Lg, numbers);
                    break;
                case "O":
                    numbers += 60;
                    xChart(Lo, numbers);
                    break;
            }
            System.out.println(randomNumner + numbers);
        }
}
////////////////////////////////////////////

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Game bn = new Game();
        bn.printTXT();

        bn.addlettersAndNumbers();

        Scanner sc = new Scanner(System.in);
        while (!bn.bingo) {
            bn.chart();
            bn.bingoPrint();

            System.out.println("Do you have a bingo?");
            String bingo = sc.nextLine();
            if (bingo.equalsIgnoreCase("bingo")) {
                bn.bingo = !bn.bingo;

            }
        }
    }
}
