package lab6;

import java.util.Scanner;

public class InterstateHighway {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        int highwayNumber;
        int primaryNumber;

        highwayNumber = scnr.nextInt();

        if (highwayNumber < 1 || 999 < highwayNumber) {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        } 
        else if (highwayNumber < 100) {
            System.out.print("I-" + highwayNumber + " is primary, going ");
            if (highwayNumber % 2 == 0) {
                System.out.println("east/west.");
            } 
            else {
                System.out.println("north/south.");
            }
        } 
        else {
            System.out.print("I-" + highwayNumber + " is auxiliary, serving I-" + (highwayNumber % 100) + ", going ");
            if (highwayNumber % 2 == 0) {
                System.out.println("east/west.");
            } 
            else {
                System.out.println("north/south.");
            }
        }
    }
}