package lab2; /**
 * CIS 162 - Lab 2
 * Semptember 10, 2020
 * Anna Carvalho
 */

import java.util.Scanner;

public class ConvertToDollars
{
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner (System.in);
        
        System.out.print("Please enter the number of quarters: ");
        int quarters = scnr.nextInt();
        System.out.print("Please enter the number of dimes: ");
        int dimes = scnr.nextInt();
        System.out.print("Please enter the number of nickles: ");
        int nickles = scnr.nextInt();
        System.out.print("Please enter the number of pennies: ");
        int pennies = scnr.nextInt();
        
        int totalCents = pennies + (nickles * 5) + (dimes * 10) + (quarters * 25);
        double amount = totalCents/100.0;
        
        System.out.print(quarters + " quarters + " + dimes + " dimes + " 
            + nickles + " nickles + " + pennies + " pennies = $");
        System.out.printf("%.2f", amount);
        
    }
}
