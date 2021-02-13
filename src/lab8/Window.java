package lab8;
/*
reference: http://www.java2s.com/Code/Java/Swing-JFC/TextPaneSample.htm

Definitive Guide to Swing for Java 2, Second Edition
By John Zukowski     
ISBN: 1-893115-78-X
Publisher: APress
 */

/*
 * @ author LJK
 * @ date 12-31-2015
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

//import cis163.timers.TimePanel.TimerListener;

public class Window extends JFrame
{
    static final long serialVersionUID = 0;

    private StyledDocument 		document;
    private SimpleAttributeSet 	attributes;

    public Window( )
    {
        this( "Window", 100, 200, 350, 700, Color.GRAY, false );
    }

    public Window( String title, int x, int y, int width, int height, Color color, boolean disableClose )
    {
        super( title );

        Container content = this.getContentPane( );

        StyleContext context = new StyleContext( );
        document = new DefaultStyledDocument(context);

        attributes = new SimpleAttributeSet( );
        StyleConstants.setBold(attributes, true);
        StyleConstants.setItalic(attributes, true);

        this.setColor( color );

        StyleConstants.setFontSize(attributes, 14);
        StyleConstants.setSpaceAbove(attributes, 4);
        StyleConstants.setSpaceBelow(attributes, 4);

        JTextPane textPane = new JTextPane(document);
        Font font = new Font("Calibri", Font.PLAIN, 24);        
        textPane.setFont( font );
        textPane.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textPane);
        content.add(scrollPane, BorderLayout.CENTER);

        this.setLocation( x, y );
        this.setSize( width, height );
        this.setVisible(true);		

        if ( disableClose )
        {
            setDefaultCloseOperation( WindowConstants.DO_NOTHING_ON_CLOSE );
        }		

        javax.swing.Timer timer;
        final int DELAY = 20;
        // Creates a Timer, along with a TimerListener.
        timer = new javax.swing.Timer( DELAY, new TimerListener() );
        timer.start();
    }

    public void setColor( Color color )
    {
        StyleConstants.setForeground(attributes, color ); 
    }

    public void setFontSize( int size )
    {
        StyleConstants.setFontSize(attributes, size ); 
    }

    public void print( String datum )
    {     
        try
        {
            document.insertString(document.getLength(), datum, attributes);
        }
        catch (BadLocationException badLocationException)
        {
        }    	
    }    

    public void print( int datum )
    {
        this.print( "" + datum );
    }

    public void print( long datum )
    {
        this.print( "" + datum );
    }

    public void print( double datum )
    {
        this.print( "" + datum );
    }

    public void print( float datum )
    {
        this.print( "" + datum );
    }

    public void print( boolean datum )
    {
        this.print( "" + datum );
    }

    public void print( char datum )
    {
        this.print( "" + datum );
    }

    public void print( Object datum )
    {
        this.print( datum.toString( ) );
    }

    public void println( Object datum )
    {
        this.print( datum );
        this.println( );
    }

    public void println( String datum )
    {
        this.print( datum );
        this.println( );
    }

    public void println( int datum )
    {
        this.print( datum );
        this.println( );
    }

    public void println( long datum )
    {
        this.print( datum );
        this.println( );
    }

    public void println( double datum )
    {
        this.print( datum );
        this.println( );
    }

    public void println( float datum )
    {
        this.print( datum );
        this.println( );
    }

    public void println( boolean datum )
    {
        this.print( datum );
        this.println( );
    }

    public void println( char datum )
    {
        this.print( datum );
        this.println( );
    }

    public void println(  )
    {
        this.print( "\n" );
    }

    /**
     * Determines the time in hours, minutes, and seconds
     * 
     * @return     current time
     */
    public String getCurrentTime()
    {
        String[ ] AM_PM = {"AM", "PM"};
        GregorianCalendar date;
        int    hour;
        String minute, second;

        date   = new GregorianCalendar();
        hour   = date.get(Calendar.HOUR);
        minute = "0" + date.get(Calendar.MINUTE);
        second = "0" + date.get(Calendar.SECOND);

        return 
        (
            hour + ":" + 
            minute.substring( minute.length()-2 ) + ":" + 
            second.substring( second.length()-2 ) + " " +
            AM_PM[ date.get(Calendar.AM_PM) ]
        );
    }
    /**
     * Defines TimerListener as an ActionListener type,
     * to handle timer (action) events.
     */
    private class TimerListener implements ActionListener
    {
        /**
         * Updates the time
         * 
         * @param  event    a timer interrupt
         */
        public void actionPerformed (ActionEvent event)
        {
            String time = getCurrentTime();

            //           label.setText( time );
            //          label.setFont(new Font( "calibri", Font.BOLD, 50));
            setTitle( "Time: " + time );
        }
    }

    public static void main( String[] args)
    {
        Window window = new Window( "Terminal output window", 100, 200, 700, 300, Color.RED, false );
        window.setFontSize( 18 );
        window.print( "\t RED " );

        window.setColor( Color.GREEN );
        window.setFontSize( 30 );
        window.print( "GREEN " );

        window.setFontSize( 48 );
        window.setColor( Color.BLUE );
        window.println( "BLUE " );
        
        window.setFontSize( 96 );
        window.setColor( Color.BLUE );
        window.print( "BLUE " );
    }    
}