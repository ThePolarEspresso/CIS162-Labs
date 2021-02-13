package lab8;

import javax.swing.JOptionPane;

public class MainStatistics
{
    
    public static void main( String[] args )
    {       
   //     Statistics stats = new Statistics("Raw data");
        Statistics stats100 = new Statistics("Raw data", 100, 100 );
        Statistics stats12 = new Statistics("Preciptation", 12, 11 );
                
        // stats.display( 5, null );
        stats100.display( 10, null );
        
        String[] months = {"","Jan","Feb","Mar", "Apr", "May","Jun", "Jul", "Aug","Sep", "Oct", "Nov","Dec" };
        ColumnHeaders headers = new ColumnHeaders( months);
        stats12.display( 12, headers );

        JOptionPane.showMessageDialog(null, "Success");
        JOptionPane.showMessageDialog(null, "Average precipation: " + stats12.average() );
        
        
    }
    
}
