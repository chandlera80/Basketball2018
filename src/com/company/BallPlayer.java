package com.company;

public class BallPlayer

{
    private int START_POSITION = 0;
    private int position;
    private String name;
    private int score;

    public int getScore()
    {
        return score;
    }

    public BallPlayer(String name)
    {
        this.position = 0;
        this.name = name;
        score = 0;
    }

    public int otherPlayer()
    {

        return otherPlayer();
    }

    public int getPosition()
    {
        return position;
    }

    public String getName()
    {
        return name;
    }

    public int getNextRollNeeded()
    {
        int nextRollNeeded;
        if (position == 0)
        {
            nextRollNeeded = 5;
        } else
        {
            nextRollNeeded = position + 1;
        }
        return nextRollNeeded;
    }

    public void moveForwardOne()
    {
        this.position++;
    }

    public void moveForwardTwo()
    {
        this.position = this.position + 2;
    }

    public int moveForwardThree()
    {

        return moveForwardThree();
    }

}
