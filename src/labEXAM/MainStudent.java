package labEXAM;
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;

public class MainStudent
{
    public static Random rand = new Random();

    public static void main()
    {
        String[ ]  names    = { "Adam", "Beth", "Carl", "Earl", "" };
        int[ ]     minimums = { 90, 80, 70, 60 };
        Student[ ] student = {  
                new Student( names[0], (1000 + rand.nextInt(9000)) ),
                new Student( names[1], (1000 + rand.nextInt(9000)) ),
                new Student( names[2], (1000 + rand.nextInt(9000)) ),
                new Student( names[3], (1000 + rand.nextInt(9000)) )
            };

        student[0].assignLetterGrade( minimums );
        System.out.println( student[0].toString( ) );
        
        student[1].assignLetterGrade( minimums );
        System.out.println( student[1].toString( ) );
        
        student[2].assignLetterGrade( minimums );
        System.out.println( student[2].toString( ) );
        
        student[3].assignLetterGrade( minimums );
        System.out.println( student[3].toString( ) );
    }
}
