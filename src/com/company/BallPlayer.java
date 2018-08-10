package com.company;






       public class BallPlayer
       {
           private String name;
           private int score;
            private int position;
           public BallPlayer(String name)
           {
               this.name = name;
               score = 0;
           }

           public String getName()
           {
               return name;
           }

           public int getScore()
           {
               return score;
           }

           public void scorePoints(int points)
           {
               score += points;
           }











    public int getPosition()
    {
        return position;
    }


    public int getPlayerScore()
    {
        return score;
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
