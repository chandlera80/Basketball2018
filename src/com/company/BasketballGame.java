package com.company;

import java.util.Scanner;

public class BasketballGame

{
    public static void main(String[] args)
    {
        playGame();
    }

        public static void playGame()
        {
            final int WINNING_SCORE = 21;
            Die dieOne = new Die();
            Die dieTwo = new Die();
            int playerOneBallPosition = 0;
            int playerTwoBallPosition = 0;
            int diceSum = dieOne.getValue() + dieTwo.getValue();
            System.out.println("welcome t the arena!");
            Scanner in = new Scanner(System.in);

            System.out.println("Player One enter your name: ");
            String name = in.nextLine();
            BallPlayer playerOne = new BallPlayer(name);

            System.out.println("Player Two enter your name: ");
            name = in.nextLine();
            BallPlayer playerTwo = new BallPlayer(name);

            boolean gameOver = false;

            BallPlayer currentPlayer = playerOne;

        do
        {
            dieOne.roll();
            dieTwo.roll();

            if (diceSum == 2 || diceSum == 10 || diceSum == 12) ;
            {
                playerOneBallPosition = playerOneBallPosition + 3;
                System.out.println(" Great job! You got three points!");
                {
                    if (diceSum == 4 || diceSum == 6 || diceSum == 8) ;

                    {
                        playerOneBallPosition = playerOneBallPosition + 2;
                        System.out.println(" You're amazing! Two points!");
                        {
                            if (diceSum == 3 || diceSum == 7 || diceSum == 9 || diceSum == 11) ;
                            {

                                playerOneBallPosition = playerOneBallPosition + 0;
                                System.out.println("Oh Man! You lost the ball!");
                            }
                            if (diceSum == 5)
                            {
                                playerOneBallPosition = playerOneBallPosition + 1;
                                System.out.println("Foul shot! You get one point!");
                            }

                            if (playerOneBallPosition >= 21)
                            {
                                System.out.println("Player One Wins!");
                                System.out.println("Other player gets a participation trophy!");
                                gameOver = true;

                            } else if (diceSum == 2 || diceSum == 10 || diceSum == 12) ;
                            {
                                playerOneBallPosition = playerOneBallPosition + 3;
                                System.out.println(" Great job! You got three points!");
                                {
                                    if (diceSum == 4 || diceSum == 6 || diceSum == 8) ;

                                    {
                                        playerOneBallPosition = playerOneBallPosition + 2;
                                        System.out.println(" You're amazing! Two points!");
                                        {
                                            if (diceSum == 3 || diceSum == 7 || diceSum == 9 || diceSum == 11) ;
                                            {

                                                playerOneBallPosition = playerOneBallPosition + 0;
                                                System.out.println("Oh Man! You lost the ball!");
                                            }
                                            if (diceSum == 5)
                                            {
                                                playerOneBallPosition = playerOneBallPosition + 1;
                                                System.out.println("Foul shot! You get one point!");
                                            }

                                            if (playerOneBallPosition >= 21)
                                            {
                                                System.out.println("Player two Wins!");
                                                System.out.println("Other player gets a participation trophy!");
                                                gameOver = true;
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } while (!gameOver);
    }
}



