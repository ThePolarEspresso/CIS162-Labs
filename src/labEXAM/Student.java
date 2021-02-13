package labEXAM;
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Collections;

public class Student implements Comparable<Student>
{
    public String name;
    public String gNumber;
    public int    score;
    public String letterGrade;

    public static Random rand = new Random();

    public Student( String n, int num )
    {
        this( n, num, 50 + rand.nextInt(51) );
    }

    public Student( String n, int num, int s )
    {
        this.name        = n;
        this.gNumber     = "G" + num;
        this.score       = s;
        this.letterGrade = "";
    }

    public int compareTo( Student that )
    {
        if (this.score < that.score)
        {
            return 1;
        }
        else if (this.score > that.score)
        {
            return -1;
        }
        else 
        {
            return 0;
        }
    }

    public int getScore()
    {
        return this.score;
    }

    public void assignLetterGrade( int[ ] min )
    {
        final int A = 0;
        final int B = 1;
        final int C = 2;
        final int D = 3;
        if (this.score >= min[ A ])
        {
            this.letterGrade = "A";
        }
        else if (this.score >= min[ B ])
        {
            this.letterGrade = "B";          
        }
        else if (this.score >= min[ C ])
        {
            this.letterGrade = "C";          
        }        
        else if (this.score >= min[ D ])
        {
            this.letterGrade = "D";          
        }       
        else 
        {
            this.letterGrade = "F";          
        }        
    }

    public String toString( )
    {
        return this.name + " " + this.gNumber + " " + this.score + " " + this.letterGrade;
    }

}
