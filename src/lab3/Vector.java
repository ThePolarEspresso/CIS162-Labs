package lab3; /**
 * The Vector Class encapsulate a two-dimensional vector,
 * <x. y> with real coordinates.
 *
 * @author Anna Carvalho
 * @version 9/17/20
 */
import java.util.Scanner;

public class Vector
{
    private double x;
    private double y;

    private static Scanner scnr = new Scanner( System.in );

    public Vector( )
    {
        System.out.print( "Enter a decimal number for an x coordinate: (e.g 1.7)");
        this.x = scnr.nextDouble();

        System.out.print( "Enter a decimal number for an x coordinate: (e.g 3.14)");
        this.x = scnr.nextDouble();
    }

    public Vector(double px, double py )
    {
        this.y = py;
        this.x = px;
    }

    public Vector( Vector that )
    {
        this.set( that );
    }


    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    /**
     * This set method assigns the coordinates of this
     * Vector by the coordinates of that Vector, respectively.
     *
     * @param  that  the assigned value for the   this   fields     
     */
    public void set( Vector that )
    {
        this.x = that.x;
        this.y = that.y;
    }

    /**
     * This set method assigns the coordinates of this
     * Vector by the parameters, respectively.
     *
     * @param  px  the assigned value for the x field
     * @param  py  the assigned value for the y field
     */
    public void set( double px, double py )
    {
        this.x = px;
        this.y = py;
    }










    /**
     * This add method increments the coordinates of this
     * Vector by the parameters, respectively.
     *
     * @param  px  the increment for the x field
     * @param  py  the increment for the y field
     */
    public void add( double px, double py )
    {
        this.x += px;
        this.y += py;
    }    

    /**
     * The add method returns a new Vector with coordinates equal to the
     * sum of the coordinates of this Vector and the coordinates of that
     * Vector, respectively.
     *
     * @param  that   some other Vector
     * @return        the Vector sum this Vector and that Vector.
     */
    public Vector add( Vector that )
    {
        //Vector helper = new Vector( 0, 0 );
        //helper.add(this.x, this.y);
        //helper.add(that.x, that.y);
        //return helper;
        
        return  new Vector( this.x + that.x, this.y + that.y);
    }

    /**
     * The magnify method multiplies the both the x coordinate field
     * and the y coordinate field the encapsulated Vector instance by
     * the scale factor.
     *  
     * @param  y    the size for the scalar magnification
     */
    public void magnify( double scaleFactor )
    {
        this.x *= scaleFactor;
        this.y *= scaleFactor;
    }







    /**
     * The toString methed returns a string description of the
     * encapsulated Vector instance.
     *
     * @return    a string of the form <3.0, 4.0>
     */
    public String toString()
    {
        return "<" + this.x + "," + this.y + ">";
    }

}