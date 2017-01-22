import java.util.Scanner;

public class Chapter4
{
   public static void main (String []args)
   {
      double total = 0;                
      for (int num = 1, denom = 30; num <= 30; num ++, denom --)
      {
         total += num/denom;
         System.out.println("Total = " + total);
      }

   }


}