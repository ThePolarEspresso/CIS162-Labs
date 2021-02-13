package lab8;
/**
 * Write a description of class Statistics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.util.Random;

public class Statistics
{
    private String title;
    private int[]  population; // data
    private int    populationSize;

    private static Window myWindow;  // = new Window( "Terminal output window", 0, 0, 700, 1200, Color.BLUE, false );
    private static int windowFontSize = Dialog.getInteger( "Enter Window font size", "String dialog", "24" );
    private static int dialogFontSize = Dialog.getInteger( "Enter Dialog font size", "String dialog", "24" );
    private static Random rand = new Random();

    public Statistics( String t )    
    {
        this.title = t;

        this.populate();
    }

    public Statistics( String t, int count, int upperBound )    
    {
        this.title = t;

        this.populate( count, upperBound );
    }

    private void populate()
    {
        int count = Dialog.getInteger( "Enter the population size", "String dialog", "5" );

        population = new int[ count ];
        for (int n = 0; n < population.length; n++ )
        {
            population[ n ] = Dialog.getInteger( "Enter a datum value", "String dialog", "" + rand.nextInt(100) );
        }        
    }

    private void populate( int count, int upperBound )
    {
        population = new int[ count ];
        for (int n = 0; n < population.length; n ++ )
        {
            population[ n ] = rand.nextInt( upperBound );  
        }       
    }

    private String padLeft( int n )
    {
        if (n >= 0 && n <= 9)
        {
            return " " + n;
        }
        else
        {
            return "" + n;
        }
    }

    public void display( int columns, ColumnHeaders headers )
    {
        Window localWindow = new Window( "Terminal output window", 0, 0, 1000, 300, Color.BLUE, false );

        localWindow.println( this.title );
        if (headers != null)
        {
            headers.display( localWindow );
        }

        for (int n = 0; n < population.length; n++ )
        {
            if ( n % columns == 0 )
            {
                localWindow.print( this.padLeft( n ) + ")\t" );
            }

            localWindow.print( this.padLeft( population[ n ] ) + "\t" );

            if ( n % columns == columns - 1  )
            {
                localWindow.println( );
            }
        }

        localWindow.println( "Statistics" );
        localWindow.println( "Sum:     " + this.sum() );
        localWindow.println( "Average: " + this.average() );
    }

    // Use a while loop
    public int sum()
    {
        int s = 0;

        for (int n = 0; n < this.population.length; n++ )
        {
            s += population[ n ];
        }       

        return s;
    }

    public double average()
    {
        // double ave;
        
        // ave = (double) this.sum()/ this.population.length;
        
        // return ave;
        
        return (double) this.sum()/ this.population.length;
    }

    public void infinite()     
    {        
        while (true) 
        {
            ;
        }
    }

    public int high()
    {
        return 0;
    }

    public int low()
    {
        return 0;
    }

    /**
     * returns a count for a sample of the population, with values ranging from low to high
     */
    public int sampleCount( int low, int high )   
    {
        int cnt = 0;

        return cnt;       
    }

    public int[] sampleRange( int low, int high )   
    {
        int[] sample = new int[ this.sampleCount( low, high ) ];
        
        

        return sample;  
    }

    public int[] randomSample( int[ ] indices )   
    {
        int[] sample = new int[ indices.length ];

        
        return sample;  
    }
}