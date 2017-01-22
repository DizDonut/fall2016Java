import java.util.Scanner;

public class PeerProgramming2
{
   public static void main (String []args)
   {
      int num1, num2 = 1;
      int remainder;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter first number: \n");
      num1 = keyboard.nextInt();
      System.out.println("Enter second number: \n");
      num2 = keyboard.nextInt();
      
      while (num2 == 0)
      {
         System.out.println("Error: Divisor cannot be zero.  Please enter second number again: \n");
         num2 = keyboard.nextInt();   
      }
      remainder = num1 % num2;
      System.out.println("Remainder = " + remainder);
   }//end main method
}