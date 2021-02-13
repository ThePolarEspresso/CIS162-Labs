package labEXAM;
/*************************************************************************************************
 * This project contains the following classes: Course, MainCourse, Student, MainStudent.
 * 
 * As is, this project should compile without error. The following methods have been defined with 
 * stubs for code, which need to be replaced.
 * 
 *      Ten methods to complete, or to correct, within a one-hour and fifty minute time period.
 *      ---------------------------------------------------------------------------------------
 * 0)   Type in your name below for the author
 * 
 * 1)   public String getName( )
 * 2)   public void setName( String n )
 * 3)   public int getSection( )
 * 4)   public void setSection( int s )
 * 5)   public String getSemester( )
 * 6)   public void setSemester( String s )
 * 7)   public int getYear( )
 * 8)   public void setyear( int y )
 * 9)   public ArrayList<Student> getTopStudents( int minScore )
 * 10)  public ArrayList<Student> getStudentsSample( ArrayList<String>  gNums )
 * 
 * Submit a zipped copy of your solution to this project to the Blackboard LabExam subfolder before
 * 4:50 PM.
 * -----------------------------------------------------------------------------------------------
 * 
 * @author Anna Carvalho
 * 
 * @version 11/17/2020
 * 
 *************************************************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Course
{

    private String name;        // e.g. "CIS 162"
    private int section;
    private String semester;    // "Fall", "Winter", or "Summer"
    private int year;
    private ArrayList<Student> students;

    public static Random rand = new Random( );

    public Course( )
    {
        this( 
            "CIS 162",
            05,
            "Fall",
            2020 
        );
    }

    public Course( String n, int s, String semester, int y )
    {
        this.name     = n;
        this.section  = s;
        this.semester = semester;
        this.year     = y;

        this.students = new ArrayList<Student>( );
    }

    /***********************************************
     * 1)  Fix the definion of the following get method
     ***********************************************/
    public String getName( )
    {
        return this.name;
    }

    /***********************************************
     * 2)  Fix the definion of the following set method
     ***********************************************/
    public void setName( String n )
    {
        this.name = n;
    }

    /***********************************************
     * 3)  Fix the definion of the following get method
     ***********************************************/
    public int getSection( )
    {
        return  this.section;
    }

    /***********************************************
     * 4)  Fix the definion of the following set method
     ***********************************************/
    public void setSection( int s )
    {
        this.section = s;
    }

    /***********************************************
     * 5) Fix the definion of the following get method
     ***********************************************/
    public String getSemester( )
    {
        return  this.semester;
    }

    /***********************************************
     * 6)  Fix the definion of the following set method
     ***********************************************/
    public void setSemester( String s )
    {
        this.semester = s;
    }

    /***********************************************
     * 7)  Fix the definion of the following get method
     ***********************************************/
    public int getYear( )
    {
        return  this.year;
    }

    /***********************************************
     * 8)  Fix the definition of the following set method
     ***********************************************/
    public void setYear( int y)
    {
        this.year = y;
    }

    /*******************************************************************************
     * Searches this.students ArrayList for the student with gNumber equal to gNUm.
     * Returns that student reference, or null, if no such student is found in
     * this.students.
     * 
     * 1)  Declare stu as a Student type variable and initialize it to null.
     * 
     * 2)  Use a "for each" loop, or a "for" loop, to search this.students
     *     arraylist for a student with gNumber that equals gNum and assign
     *     it to stu.
     * 
     * 3)  Return stu.
     * 
     * @param gNum
     * @return a Student reference
     ****************************************************************8*************/
    public Student getStudent( String gNum )
    {
        Student stu = null;

        for ( Student s: this.students )
        {
            if (s.gNumber.equals( gNum ) )
            {
                stu = s;
            }
        }

        return stu;
    }

    /*************************************************************************
     * Invokes this.getStudent method and returns true or false whether the
     * encapsulated this.students ArrayList contains the Student s reference.
     * 
     * @param Student s
     * @return boolean
     *************************************************************************/
    public boolean containsStudent( Student s )
    {
        return this.getStudent( s.gNumber ) != null;
    }

    /*************************************************************************
     * Adds a single Student s to the encapsulated this.students ArrayList,
     * but first invokes the this.containsStuden method to avoid duplicate
     * containment.
     * 
     * @param Student s
     *************************************************************************/
    public void addStudent( Student s )
    {
        if ( ! this.containsStudent( s ) )
        {
            this.students.add( s );
        }
    }

    /*************************************************************************
     * Adds an array of Students to the encapsulated this.students ArrayList,
     * by repeatedly invoking the addStudent method for each student in the 
     * array.
     * 
     * @param Student[] students
     *************************************************************************/
    public void addStudents( Student[ ] students )
    {
        for ( Student s: students )
        {
            this.addStudent( s );
        }
    }

    /****************************************************************************
     * Invokes the Student assignLetterGrade method, and passes to it the
     * minimums array, to assign a letter grade to each student in this.students
     * ArrayList,
     * 
     * @param int[] minimums
     ****************************************************************************/
    public void assignLetterGrades( int[ ] minimums )
    {
        for (Student s: this.students)
        {
            s.assignLetterGrade( minimums );
        }
    }

    /****************************************************************************
     * Returns the average of all scores for students in this.students ArrayList.
     * 
     * @return double for the student scores average
     ************************************************************************/
    public double getAverageScore(  )
    {
        if (this.students.size( ) > 0)
        {
            int total = 0;
            for ( Student s: this.students )
            {
                total += s.getScore( );
            }

            return (double)total/this.students.size( );
        }
        else
        {
            return 0.0;
        }
    }

    /*****************************************************************************
     * Searches this.students ArrayList for the student with the highest score,
     * and returns the student.
     * 
     * 1)  Declare topStu as a Student, and initialize it to the 0th student.
     *     Declare high as an int variable and initialize it with the topStu 
     *     score.
     * 
     * 2)  Use a "for each" loop, or a "for" loop, to search this.students
     *     arraylist for each student with a still higher score. 
     * 
     * 3)  Return topStu.
     * 
     * @return a Student reference
     ************************************************************************/
    public Student getTopStudent( )
    {
        if (this.students.size( ) > 0)
        {
            Student topStudent = this.students.get( 0 );

            int high = topStudent.getScore( );
            for ( Student s: this.students )
            {
                if (s.getScore( ) > high)
                {
                    high = s.getScore( );
                    topStudent  = s;
                }
            }

            return topStudent;
        }
        else
        {
            return null;
        }
    }

    /*****************************************************************************
     *
     * 9)  Fix the definition of the following method
     * 
     * -------------------------------------------------
     * Filters out an ArrayList of all Students from this.students ArrayList with
     * scores greater than or equal to the specified minScore.
     * 
     * 1)  Declare an ArrayList for topStudents and instantiate it.
     * 
     * 2)  Use a "for each" loop, or a "for" loop, to add each student in this.students
     *     ArrayList, with a score at least as great as the minScore, to topStudents.
     * 
     * 3)  Return topScores.
     * 
     * @return an ArrayList<Student> reference
     ************************************************************************/
    public ArrayList<Student> getTopStudents( int minScore )
    {
        if (this.students.size( ) > 0) {
            ArrayList<Student> topStudents = new ArrayList<Student>();

            for ( Student s : this.students )
            {
                if (s.getScore( ) >= minScore)
                {
                    topStudents.add(s);
                }
            }

            return topStudents;
        }
        else {
            return null;
        }
    }

    /*****************************************************************************
     * 
     * 10)  Fix the definition of the following method
     * 
     * -------------------------------------------------
     * Returns an ArrayList of students in this.students ArrayList with a gNumber
     * included in the gNum array of gNumbers.
     * 

     * @param String[]  gNum
     * @return an ArrayList<Student> reference
     ************************************************************************/
    public ArrayList<Student> getStudentsSample(  ArrayList<String>  gNums)
    {
        ArrayList<Student> sample = new ArrayList<Student>();
        
        for (int n = 0; n < gNums.size(); n++) {
            for (Student s : this.students) {
                if (s.gNumber.equals( gNums.get(n) )) {
                    sample.add(s);
                }
            }
        }  
        
        return sample;
    }

    /************************************************************************
     * returns an array copy of this.students ArrayList
     * 
     * 1)  Declare stu as an array variable of Student type and initialize it
     *     with this.students size.
     * 
     * 2)  Use a "for each" loop, or a "for" loop, to populate the stu array.
     * 
     * 3)  Return stu.
     * 
     * @return a Student[ ] reference
     ************************************************************************/
    public Student[] copyStudentsToArray()
    {
        Student[ ] stu = new Student[this.students.size( )];

        int n = 0;
        for (Student s: this.students )       
        {
            stu[n] = s;
            n++;
        }

        return stu;
    }

    /************************************************************************
     * returns a sorted ArrayList copy of this.students ArrayList
     * 
     * @return an ArrayList<Student> reference
     ************************************************************************/
    public ArrayList<Student> sortedList( )
    {
        ArrayList<Student> copy = new ArrayList<Student>( );

        for ( Student s: this.students )
        {
            copy.add( s );
        }

        Collections.sort( copy );

        return copy;
    }

    public void display( )
    {
        System.out.print( "\n" + this.toString( ) );
        System.out.println( " \tStudents: " + this.students.size( ) );
        if ( this.students.size( ) == 0)
        {
            return;   
        }
        for (Student s: this.students )
        {
            System.out.println( s.toString( ) );
        }
        System.out.println( "\tAverage: " + this.getAverageScore( ) );
        System.out.println( "\tTop student: " + this.getTopStudent( ).toString( ) );
        System.out.println( );
    }

    public String toString( )
    {
        return this.name + "-" + this.section + " " + this.semester + " " + this.year;
    }

}
