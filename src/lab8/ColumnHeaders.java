package lab8;

import java.awt.Font;
import java.awt.Color;

public class ColumnHeaders
{
    private String[] headers;

    public ColumnHeaders( String[] h )
    {
        this.headers = h;
    }

    public void display( Window wind )
    {
        if (headers == null)
        {
            return;
        }
        for ( int n = 0; n < headers.length; n++ )
        {
            wind.print(headers[ n ] + "\t" );
        }
        wind.println();

    }

    public static void main( String[] args )
    {       
        Window localMainWindow = new Window( "Terminal output window", 0, 0, 1000, 300, Color.BLUE, false );

        String[] months = {"", "Jan","Feb","Mar", "Apr", "May","Jun", "Jul", "Aug","Sep", "Oct", "Nov","Dec" };

        ColumnHeaders ch = new ColumnHeaders( months);

        ch.display( localMainWindow );
    }
}
