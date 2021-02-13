package lab2; /**
 * CIS 162 - Lab 2
 * September 10, 2020
 * Anna Carvalho
 */

import java.util.Scanner;

public class ConvertFromSeconds
{
   public static void main(String[] args){
       
       Scanner scnr = new Scanner(System.in);

       System.out.println("Enter the number of seconds:");
       int totalSeconds = scnr.nextInt();
       
       int hours = totalSeconds / 3600;
       int minutes = (totalSeconds / 60) % 60;
       int seconds = totalSeconds % 60;
       
       System.out.println("Number of hours: " + hours);
       System.out.println("Number of minutes: " + minutes);
       System.out.println("Number of seconds: " + seconds);
   }
}
