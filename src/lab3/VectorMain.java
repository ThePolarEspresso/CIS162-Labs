package lab3;

/**
 * The VectorMain class defines the main method as the point
 * of entry in a program to test the Vector class.
 *
 * @author Anna
 * @version 9/17/20
 */
public class VectorMain
{
    public static void main( String[] args )
    {
        System.out.println( "Anna Carvalho\n" );
        System.out.println( "Lab 3 Vector Project\n" );


        Vector v1 = new Vector( 3.0, 4.0 );
        System.out.println( "1)  v1 = " + v1.toString() );

        Vector v2 = new Vector( v1 );
        System.out.println( "2)  v2 = " + v2.toString() );
        v2.magnify( 2.0 );
        System.out.println( "3)  v2 = " + v2.toString() );

        Vector v3 = new Vector( 1.0, 2.0 );
        System.out.println( "4)  v3 = " + v3.toString() );
        v3.add( 0.0, 1.0 );
        System.out.println( "5)  v3 = " + v3.toString() );

        Vector v4 = v1.add( v1 );
        System.out.println( "6)  v4 = " + v4.toString() );
    }
}

