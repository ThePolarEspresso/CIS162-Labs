package labEXAM;
/**
 * Write a description of class MainCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;

public class MainCourse
{
    public static Random rand = new Random( );

    public static void main( )
    {
        String[ ]  names    = { "Adam", "Beth", "Carl", "Erma", "Fred", "Gord", "Hank", "Irma", "Jane", "Kurt" };
        int[ ]     minimums = { 90, 80, 70, 60 };
        int[ ]     nums = new int[names.length];
        for (int n = 0; n < nums.length; n++)
        {
            nums[n ] = 1000 + rand.nextInt(9000);
        };       
        Student[ ] students = new Student[ names.length ];  
        for (int n = 0; n < students.length; n++)
        {
            students[n ] = new Student( names[n], nums[n] );
        };

        ArrayList<String> gNumbers = new ArrayList<String>();
        for (int n = 0; n < nums.length; n++)
        {
            if ( n % 2 == 0)
            {
                gNumbers.add( "G" + nums[n] );
            }
        }
        Course c = new Course( );

        c.addStudent( students[0] );

        c.addStudents( students );
        c.assignLetterGrades( minimums );
        c.display();


        ArrayList<Student> sortedList = c.sortedList( );
        System.out.println( "\n\tStudents sorted by scores " );
        for (Student s: sortedList)
        {
            System.out.println( s.toString( ) );
        }

        ArrayList<Student> higherScores = c.getTopStudents( minimums[ 1 ] );
        System.out.println( "\n\tTop Students " );
        for (Student s: higherScores)
        {
            System.out.println( s.toString( ) );
        }

        ArrayList<Student> sampleList = c.getStudentsSample( gNumbers ) ;
        System.out.println( "\n\tA Sample list of Students " );
        for (Student s: sampleList)
        {
            System.out.println( s.toString( ) );
        }

        c.setName( "CIS 700" );
        c.setSection( 50 );
        c.setSemester( "Summer" );
        c.setYear( 2021 );
        System.out.print( "\n\t\t\t" + c.getName() + " " );
        System.out.print( c.getSection() + " "  );
        System.out.print( c.getSemester() + " "  );
        System.out.println( c.getYear() );
    }   
}
