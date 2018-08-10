package com.company;

import com.sun.media.jfxmedia.events.PlayerEvent;

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


        System.out.println("welcome to the arena!");
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

            int diceSum = dieOne.getValue() + dieTwo.getValue();

            if (diceSum == 2 || diceSum == 10 || diceSum == 12)
            {
                currentPlayer.scorePoints(3);
                System.out.println(" Great job! You got three points!");
            }
            if (diceSum == 4 || diceSum == 6 || diceSum == 8)
            {
                currentPlayer.scorePoints(2);
                System.out.println(" You're amazing! Two points!");
            }
            if (diceSum == 3 || diceSum == 7 || diceSum == 9 || diceSum == 11)
            {
                currentPlayer.scorePoints(0);
                System.out.println("Oh Man! You lost the ball!");
            }
            if (diceSum == 5)
            {
                currentPlayer.scorePoints(1);
                System.out.println("Foul shot! You get one point!");
            }
            if (currentPlayer.getScore() >= 21)
            {
                gameOver = true;
            }
            System.out.println(currentPlayer.getName() + " score is " + currentPlayer.getPlayerScore());
            currentPlayer = getNextPlayer(currentPlayer, playerOne, playerTwo);

        } while (!gameOver);

        System.out.println(currentPlayer.getName() + " Wins!");
        System.out.println("Other player gets a participation trophy!");
    }

    public static BallPlayer getNextPlayer(BallPlayer currentPlayer, BallPlayer playerOne, BallPlayer
            playerTwo)
    {
        BallPlayer nextPlayer;

        if (currentPlayer == playerOne)
        {
            nextPlayer = playerTwo;
        } else
        {
            nextPlayer = playerOne;
        }
        return nextPlayer;

        }

    }

