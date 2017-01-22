import java.util.Scanner;

public class PenniesForPay
{
   public static void main(String[]args)
   {
      double pennies = 0.01, total = 0;
      int days=0, i=0;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Your first day of pay is $" + pennies+".");
      System.out.println("Please enter the number of days working: ");
      days = keyboard.nextInt();
      
      System.out.println(" Days    " + "  Salary");
      System.out.println("-------------------");      

      while(i < days)
      {
         if(days <= 0)
         {
            System.out.println("Plense enter a number greater than 0: ");
            days = keyboard.nextInt();
         }
         
         pennies += pennies;
         i++;
         
         System.out.printf("\t" + i + "      \t" + "$%,.2f\n",pennies);
      }
   }
}