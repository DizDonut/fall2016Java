import java.util.Scanner;

public class Square
{
   public static void main(String[] args)
   {
      int side, s,l;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("How big are the sides of your square? ");
      side = keyboard.nextInt();
      
      while(side>15)
      {
         System.out.println("Invalid, choose number less than or equal to 15.");
         side = keyboard.nextInt();
      }      
         for (s = 0; s < side; s ++)
         {
            for (l = 0; l<side; l++)
            {
               System.out.print("X");
            }
         
            System.out.println();
         }
   }
}