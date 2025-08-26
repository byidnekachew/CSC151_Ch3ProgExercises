// Write your imports here if needed
import java.util.Scanner;


public class Exercise {
   public static void main(String[] args){
      Scanner myObj = new Scanner(System.in);
      
      System.out.print("Enter a: ");
      double a = myObj.nextDouble();

      System.out.print("Enter b: ");
      double b = myObj.nextDouble();

      System.out.print("Enter c: ");
      double c = myObj.nextDouble();

      double discriminant = ( (Math.pow(b, 2)) - (4*a*c) );

      if (discriminant < 0) {
         System.out.print("The equation has no real roots");
      }
      else if (discriminant == 0) {
         System.out.print("The root is ");
         double root1 = ( ( (-b) + (Math.pow(discriminant, 0.5)) ) / (2*a) );
         System.out.print(root1);
      }
      else {
         System.out.print("The roots are ");
         double root1 = ( ( (-b) + (Math.pow(discriminant, 0.5)) ) / (2*a) );
         double root2 = ( ( (-b) - (Math.pow(discriminant, 0.5)) ) / (2*a) );
         System.out.print(root1);
         System.out.print(" and ");
         System.out.print(root2);
      }
   }
   
}