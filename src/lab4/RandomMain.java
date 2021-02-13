package lab4; /**
 * CIS 162 05 Lab 4 
 * Activity 5 - Random Ranges
 * 
 * Anna Carvalho
 * 9/24
 */

import java.util.Random;
import java.util.Scanner;
public class RandomMain
{
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter low: ");
        int low = scnr.nextInt();
        System.out.println("Enter high: ");
        int high = scnr.nextInt();

        System.out.print(rand.nextInt(high - low + 1) + low);
        System.out.print(" ");
        System.out.print(rand.nextInt(high - low + 1) + low);
        System.out.print(" ");
        System.out.print(rand.nextInt(high - low + 1) + low);
    }
}
