package lab9;

/**
 * Main method
 *
 * @author Anna Carvalho
 * @version 10/29/2020
 */
public class MainTemp {
    public static void main (String[] args) {
        Temps tmp = new Temps("June", 2004);
        tmp.setTemps("73,68,74,74,77,81,85,90,85,72,63,74,83,80,81,81,79,79,69,71,69,70,75,70,68,70,73,72,79,76");
        tmp.printTemps();
        System.out.println(tmp.toString());
        
    }
}