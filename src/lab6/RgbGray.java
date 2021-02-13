package lab6;

import java.util.Scanner;

public class RgbGray {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter an integer in the range 0..255 for red: ");
        int red = scnr.nextInt();

        System.out.println("Enter an integer in the range 0..255 for green: ");
        int green = scnr.nextInt();

        System.out.println("Enter an integer in the range 0..255 for blue: ");
        int blue = scnr.nextInt();

        int gray = red;
        if(gray > blue) {
            gray = blue;
        }
        if (gray > green) {
            gray = green;
        }
        
        System.out.println("Composite color: " + red + ", " + green + ", " + blue);
        
        red -= gray;
        green -= gray;
        blue -= gray;
        
        System.out.println("Compisote color: " + red + ", " + green + ", " + blue);
    }
}