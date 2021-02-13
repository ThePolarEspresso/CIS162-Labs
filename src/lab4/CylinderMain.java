package lab4; /**
 * CIS 162 05 Lab 4
 * Activity 2 - Cylinders
 * 
 * Anna Carvalho
 * 9/24
 */

import java.util.Scanner;
public class CylinderMain
{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter radius of circle: ");
        double radius = scnr.nextDouble();
        System.out.println("Enter height of circle: ");
        double height = scnr.nextDouble();
        
        double volume = Math.PI * Math.pow(radius, 2) * height;
        double latSurfA = 2 * Math.PI * radius * height;
        
        System.out.printf("Volume = %.2f cubic inches.\n", volume);
        System.out.printf("Lateral Surface Area = %.2f square inches.", latSurfA);
    }
}
