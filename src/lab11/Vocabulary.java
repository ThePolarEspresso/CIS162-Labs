package lab11;
/**
 * Write a description of class Fruit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vocabulary
{
    private ArrayList<String> words;

    public Vocabulary()
    {
        this.words = new ArrayList<String>();
    }

    public void addWord( String str )
    {
        this.words.add(str);
    }

    public void addWords( int num )
    {
        String str;
        for (int n = 0; n < num; n++) {
            str = JOptionPane.showInputDialog( "Enter a word" );
            this.words.add( str );
        }
    }

    public String getWord( int n )
    {
        if (0 <= n && n < this.words.size()) {
            return this.words.get(n - 1);
        } else {
            return "";
        }
    }

    public void display()
    {
        System.out.println( "\t Vocabulary" );

        for (String wrd : this.words) {
            System.out.println(wrd);
        }
    }

    public int search( String str )
    {
        int index = 0;
        for (index = 1; index < this.words.size(); index++) {
            if (this.getWord(index).equalsIgnoreCase(str)) {
                return index;
            }
        }
        return index;
    }

    public boolean removeWord( int index )
    {
        if (index >= 0 && index < this.words.size()) {
            this.words.remove(index);
            return true;
        }        
        return false;
    }

    public void removeEvenNumberedWords()
    {
        for (int n = this.words.size() - 1; n >= 0; n--) { //Start at the end since the array is decreasing
            if (n % 2 == 0) {
                this.words.remove(n);
            }
        }
    }

    public static void main( String[] args )
    {
        Vocabulary fruit = new Vocabulary( );
        
        fruit.addWord( "Prunes" );
        
        fruit.addWords( 5 );
        fruit.display( );
        
        int index = fruit.search( "prunes" );
        System.out.println( fruit.getWord( index ) + " was found at index location " + index );
        
        fruit.removeEvenNumberedWords();
        fruit.display( );
    }
}
