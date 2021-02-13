package lab4; /**
 * CIS 162 05 Lab 4 
 * Activity 4 - Ordering Pizza
 * 
 * Anna Carvalho
 * 9/24
 */

import java.util.Scanner;
public class PizzaMain
{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("How many pizzas? ");
        int numPizza = scnr.nextInt();
      
        double subTotal = numPizza * 9.99;
      
        System.out.printf("Sub Total: $%.2f\n", subTotal);
        System.out.printf("Tax: $%.2f\n", (subTotal * .06));
        System.out.printf("Total Due: $%.2f", (subTotal + (subTotal * .06)));
    }
}
