import java.util.Scanner;


public class Population
{
   public static void main(String[] args)
   {
      double starting;
      double increase;
      double organisms;
      int days;
      
      Scanner keyboard = new Scanner(System.in);
      
      
      System.out.println("Please enter the number of starting " +
                        "organisms");
      starting = keyboard.nextDouble();
      
      while (starting < 2)
      {
         System.out.println("Invalid.  Must be at least 2.  " +
                           "Please re-enter: ");
         starting = keyboard.nextDouble();
      }
      
      System.out.println("enter the daily increse: ");
      increase = keyboard.nextDouble();
      
      while (increase < 0)
      {
         System.out.println("Invalid.  Must be greater than 0.  " +
                           "Please re-renter: ");
         increase = keyboard.nextDouble();
         }
         
      System.out.println("Please enter the number of days" +
                        " the organism will multiply:");
      days = keyboard.nextInt();
      
      while (days < 1)
      {
         System.out.println("Invalid.  Must be greater " +
                             "than 1.  Please re-enter: ");
         days = keyboard.nextInt();
         }
      
      organisms = starting;
      System.out.println("Day\t\tOrganisms");
      System.out.println("-----------------------");
      
      for (int i = 1; i <= days; i++)
      {
         System.out.printf("%1d%22.2f\n", i, organisms);
         organisms += (organisms * increase);
      }
      
    } 
}               
     