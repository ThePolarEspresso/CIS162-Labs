package lab9; /**
 * Temps class
 * 
 * @author Anna Carvalho
 * @version 10/29/2020
 */

import java.text.DecimalFormat;
public class Temps
{
    // instance variables
    String monthName;
    int year;
    int[] temps;

    //constructor
    public Temps(String monthName, int year) {
        this.monthName = monthName;
        this.year = year;
    }

    public void setTemps(String tempStr) {
        String[] aux = tempStr.split(",");
        this.temps = new int[aux.length];

        for (int i = 0; i < this.temps.length; i++) {
            this.temps[i] = Integer.parseInt(aux[i]);
        }
    }

    public int getHighest() {
        int high = this.temps[0];

        for (int i = 0; i < this.temps.length; i++) {
            if (this.temps[i] > high) {
                high = this.temps[i];
            }
        }

        return high;
    }

    public int getLowest() {
        int low = this.temps[0];

        for (int i = 0; i < this.temps.length; i++) {
            if (this.temps[i] < low) {
                low = this.temps[i];
            }
        }

        return low;
    }

    public double getAverage() {
        double total = 0;

        for (int i = 0; i < this.temps.length; i++) {
            total += this.temps[i];
        }

        double average = (total / this.temps.length);

        return average;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return ("The average high temperature for " + this.monthName + ", " + this.year + " was: " + df.format(this.getAverage())
        + "\nThe highest temperature for " + this.monthName + ", " + this.year + " was: " + this.getHighest() 
        + "\nThe lowest temperature for " + this.monthName + ", " + this.year + " was: " + this.getLowest());
    }

    public void printTemps() {
        System.out.println("Daily Temperatures\n================== ");
        for (int i = 0; i < this.temps.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + this.temps[i] + "\u00B0F");
        }
    }
}
