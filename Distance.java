import java.util.Scanner;
public class Distance
{
   public static void main(String[] args)
   {
      int userSpeed, userMiles=0, hours, distance=0, perHour=0, i;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("How fast are you going (in mph)? ");
      userSpeed = keyboard.nextInt();
      
      System.out.println("How may hours have you traveled? ");
      hours = keyboard.nextInt();
      
      System.out.println("Hour    Distance Traveled");
      System.out.println("-------------------------");
      
      for (i = 1; i <= hours; i++)
      {
         distance = userSpeed * hours;
         perHour += distance / hours;
         System.out.println(i + "           " + perHour);
         
      }
      
   }
}