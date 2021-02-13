package lab4; /**
 * CIS 162 05 Lab 4 
 * Activity 1 - Generate Login Name
 * 
 * Anna Carvalho
 * 9/24
 */

import java.util.Scanner;
public class LoginMain
{
    public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    
    System.out.println("Enter first name: ");
    String firstName = scnr.next();
    System.out.println("Enter last name: ");
    String lastName = scnr.next();
    System.out.println("Enter 4-digit number: ");
    int fourDigits = scnr.nextInt();
    
    String login = lastName.substring(0, 5).concat(firstName.substring(0, 1));
    login += (fourDigits % 100);
    
    System.out.println("You login name: " + login);
    
    }
}
