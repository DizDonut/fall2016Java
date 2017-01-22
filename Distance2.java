import java.io.*;
import java.util.Scanner;

public class Distance2
{
   public static void main(String[] args) throws IOException
   {
      int userSpeed, userMiles=0, hours, distance=0, perHour=0, i;
      PrintWriter outputFile = new PrintWriter("Distance.txt");
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("How fast are you going (in mph)? ");
      userSpeed = keyboard.nextInt();
      
      System.out.println("How may hours have you traveled? ");
      hours = keyboard.nextInt();
      
      outputFile.println("Hour    Distance Traveled");
      outputFile.println("-------------------------");
      
      for (i = 1; i <= hours; i++)
      {
         distance = userSpeed * hours;
         perHour += distance / hours;
         outputFile.println(i + "           " + perHour);
         
      }
      
      outputFile.close();
   }
}