package lab2; /**
 * CIS 162 - Lab 2
 * Semptember 10, 2020
 * Anna Carvalho
 */

import java.util.Scanner;

public class ConvertToSeconds
{
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Please enter the number of hours:");
        int hours = scnr.nextInt();
        System.out.print("Please enter the number of minutes:");
        int minutes = scnr.nextInt();
        System.out.print("Please enter the number of second:");
        int seconds = scnr.nextInt();
        
        int totalSeconds = (hours * 60 * 60) + (minutes * 60) + seconds;
        
        System.out.println("The total number of seconds in");
        System.out.println(hours + " hour(s),");
        System.out.println(minutes + " minute(s),");
        System.out.println(seconds + " second(s),");
        System.out.println("is " + totalSeconds + " seconds.");
    }
}
