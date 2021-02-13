package lab4; /**
 * CIS 162 05 Lab 4
 * Activity 3 - Area of a Triangle
 * 
 * Anna Carvalho
 * 9/24
 */

import java.util.Scanner;
public class TriangleMain
{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter side A: ");
        Double sideA = scnr.nextDouble();
        System.out.println("Enter side B: ");
        Double sideB = scnr.nextDouble();
        System.out.println("Enter side C: ");
        Double sideC = scnr.nextDouble();
        
        Double s = .5 * (sideA + sideB + sideC);
        double area = Math.sqrt(s * ((s - sideA) * (s - sideB) * (s - sideC)));
        
        System.out.printf("The are of the triangle is: %.3f", area);
    }
}
