package ca.jaycen05myyorku.rex2lab6;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 3/5/17.
 */
public class ScoreModel
{
    //attributes
    private int attempt,success;
    private long elapsed_time, start;

    //default constructor
    public ScoreModel()
    {
        this.attempt = 0;
        this.success = 0;
        this.start = new Date().getTime();
    }

    //accessor methods
    public int getAttempts()
    {
        return this.attempt;
    }

    public int getSuccess()
    {
        return this.success;
    }

    public long getStart()
    {
        return this.start;
    }

    public long getElapsedTime()
    {
        this.elapsed_time = (new Date().getTime() - this.start)/1000;
        return this.elapsed_time;
    }

    public void record(boolean success)
    {
        if(success)
            this.attempt++;
    }

    public double getAverageScore()
    {
        return (this.success / this.attempt) * 100;
    }

    public void resetTimer()
    {
        this.start = new Date().getTime();
    }

    public static void main(String[] args)
    {
        ScoreModel model = new ScoreModel();
        long s = model.getStart();
        System.out.println("The starting time is "+s);
        long e = model.getElapsedTime();
        System.out.println("The elapsed time is "+e);
    }
}
