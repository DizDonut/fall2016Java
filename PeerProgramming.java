import java.util.Scanner;

public class PeerProgramming
{
   public static void main (String []args)
   {
      final double BASE = 10;
      int count, checks = 0;
      double service=0, display=0;
      Scanner keyboard = new Scanner(System.in);
      
      do {
          checks = written();
          service = serviceFee(checks);
          display = displayFee(BASE, service);
          System.out.println("\nWould you like to check your fees again? Y = 1 N = 0");
          count = keyboard.nextInt();                    
            if(count == 0)
               {
                  System.out.printf("Goodbye!");
               }   
          }  while(count == 1); 

   
   
   } //end main method
   
   /**
      Written method asks for and returns the number checks written in the month   
   */
   
   public static int written ()
   {
      int checks;
      Scanner keyboard = new Scanner(System.in);

      System.out.println("How many checks did you write this month?");
      checks = keyboard.nextInt();
      while (checks < 0)
      {
         System.out.println("Please enter a positive number.  How many checks did you write this month?");
         checks = keyboard.nextInt();
      }      
      return checks;
   }

   /**
      serviceFee method calculates the service fee for the month, given the number of checks
      @param x Number of checks returned from written method   
   */
   public static double serviceFee(int x)
   {
      final double BASE = 10;
      double service = 0;
      
      if (x <= 20)
      {
         service = x * 0.10;
      }
      else if(x <= 39)
      {
         service = x * 0.08;
      }
      else if(x <= 59)
      {
         service = x * 0.06;
      }
      else
      {
         service = x * 0.04;
      }
      
      return service;
   }
   
   /**
      displayFee method displays the total fees, given the base fee and service fee from checks
      @param x BASE constant variable from main method
      @param y service fee calculated and returned from serviceFee method
   */
   
   public static double displayFee(double x, double y)
   {
      double total=0;
      System.out.printf("Base Fee:              $%,.2f\n", x);
      System.out.printf("Fees for checks:       $%,.2f\n",y);      
      total = x + y;
      System.out.printf("Total Fees for Month:  $%,.2f\n",total);
      return 0;
   }
}