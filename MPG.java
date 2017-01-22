import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MPG
{

   public static void main(String[] args) throws IOException
   {
      File file = new File("MilesPerGallon.txt");
      Scanner inputFile = new Scanner(file);
      
      DecimalFormat formatter = new DecimalFormat("#0.00");
      
      String model;
      double gallons, miles, mpg, avgMPG = 0;
      int count = 0;
      
      while(inputFile.hasNext())
      {
         model = inputFile.nextLine();
         miles = inputFile.nextDouble();
         gallons = inputFile.nextDouble();
         
         inputFile.nextLine();
         
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }//end if statement
         
         mpg = miles / gallons;
         count++;
         avgMPG = (avgMPG + mpg) / count;
         
         System.out.println("Car Model: " + model);
         System.out.println("Miles Driven: " + miles);
         System.out.println("Gallons: " + gallons);
         System.out.println("Miles Per Gallon: " + formatter.format(mpg));
         System.out.println();
         
         }//end while loop
         
         System.out.println("Average Miles Per Gallon: " + formatter.format(avgMPG));
            
   }//end main

}//end class

