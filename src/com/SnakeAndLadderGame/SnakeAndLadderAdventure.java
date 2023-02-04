package com.SnakeAndLadderGame;

public class SnakeAndLadderAdventure {
    public static void main(String[] args) {
        System.out.println("Welcome to SnakeAndLadder Adventure");
        int player1position = 0;            //initial position of player1
        int player2position = 0;                //initial position of player2
        int DiceValue;              //to get random value

        while (player1position != 100 && player2position != 100) {
            DiceValue = (int) Math.floor(Math.random() * 10) % 6 + 1; //generate random values

            if ((player1position + DiceValue) <= 100) {
                player1position = DiceValue + player1position; //position of player1 calculation
                System.out.println("player1 throws " + DiceValue);
                System.out.println("player1 reaches to cell " + player1position);
            }
            if (player1position == 5) {
                System.out.println("player1 climbs the ladder ");            //for ladder
                System.out.println(" player1 moves to position 17");
            } else if (player1position == 9) {
                System.out.println(" player1 climbs the ladder ");
                System.out.println(" player1 moves to 25");
            } else if (player1position == 19) {
                System.out.println("player1 climbs up the ladder ");
                System.out.println(" player1 moves to the position 36");
            } else if (player1position == 34) {
                System.out.println(" player1 climbs up the ladder ");
                System.out.println("player1 moves to the position 48");
            } else if (player1position == 11) {                                 //for snake byte
                System.out.println("player1 got snake byte ");
                System.out.println("player1 returned to the position 3");
            } else if (player1position == 33) {
                System.out.println(" player1 got snake byte ");
                System.out.println(" player1 returned to the postion 17");
            } else if (player1position == 73) {
                System.out.println("player1 got the snake byte ");

                System.out.println("player1 returned to the position 39");
            } else if (player1position == 99) {
                System.out.println("player1 got snake byte");
                System.out.println(" player1 moves to the postion 9");
            }

        }
        System.out.println();
        DiceValue = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
        if ((player2position + DiceValue) <= 100) {

            player2position = DiceValue + player2position;       //position of player2 calculation
            System.out.println(" player2 throws " + DiceValue);

            System.out.println(" player2 reaches to cell " + player2position);
        }

        if (player2position == 5) {
            System.out.println(" player2 climbs uo the ladder ");
            System.out.println("player2  moves to the postion 17");             //for ladder
        } else if (player2position == 9) {
            System.out.println(" player2 climbs up the ladder ");
            System.out.println("player2  moves to the position 25");
        } else if (player2position == 19) {
            System.out.println(" player2 climbs up the ladder ");
            System.out.println("player2 moves to the position 36");
        } else if (player2position == 34) {
            System.out.println(" player2 climbs up the  ladder ");
            System.out.println("player2 moves upto the position  88");
        } else if (player2position == 11) {                                 //for the snake byte
            System.out.println("player2 got the snake byte ");
            System.out.println("player2 moves down to 3");
        } else if (player2position == 33) {
            System.out.println("player2 got the snake byte ");
            System.out.println(" player2 moves down to 17");
        } else if (player2position == 73) {
            System.out.println("player2 got the snake byte ");
            System.out.println(" player2 moves down to the position 39");
        } else if (player2position == 99) {
            System.out.println("player2 got the snake byte ");
            System.out.println("player2  moves down to the position 9");
        } else {
            System.out.println();
        }
        if (player1position == 100) {
            System.out.println("Hurrey!!! player1 won the match");
        } else {
            System.out.println(" Hurrey!!! player2 won the match");
        }
    }
}
