/*
 * Name: Fractions Formatter
 * Purpose: To determine whether a user inputed numerator and denominator create a proper or improper fraction and return a simplified/formatted version.
 * Programmer: Biruk Yidnekachew
 * Date: 27 August 2025
 */

 // Imports Scanner for input
import java.util.Scanner;


public class Exercise03_01Extra {
   public static void main(String[] args){
      // Declares Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // Declares variables which will contain user input
      int numerator;
      int denominator;

      // Assigns values to variables based on user input
      System.out.print("Enter a numerator: ");
      numerator = keyboard.nextInt();
      System.out.print("Enter a denominator: ");
      denominator = keyboard.nextInt();

      // Conditional statement to determine whether a proper/improper fraction is formed
      if (numerator < denominator){
        // Outputs that it is a proper fraction
        System.out.print(numerator + "/" + denominator + " is a proper fraction.");
      }
      else {
        // Conditional statement to determine whether the improper fraction is a whole or mixed number
        if ((numerator % denominator) == 0){
            // Outputs simplified whole number
            System.out.print(numerator + "/" + denominator + " is an improper fraction and it can be reduced to " + (numerator/denominator) );
        }
        else{
            // Outputs formatted mixed number
            System.out.print(numerator + "/" + denominator + " is an improper fraction and its mixed fraction is " + (numerator/denominator) + " + " + (numerator-( (numerator/denominator)*denominator) ) + "/" + denominator);
        }
      }
   }
}