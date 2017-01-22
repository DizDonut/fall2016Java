/*
   Mike Bechtel - CSC143 - Project3:  converting Project2 into a modular program
*/

import java.util.Scanner;
import java.io.*;

public class PetGroomingProject3
{

   public static void main (String[] args) throws IOException
   {
      File file = new File("boarding.txt"); //declares variable file and initializes to the appropriate file
      Scanner inputFile = new Scanner(file);      
      String firstName, lastName, breed;
      final double TAX = 0.06;
      double weight, highRisk, bt, txamt, tp=034, abills=0, avgbills=0;
      int days, count=0;
      
      displayTitle();
      
      while (inputFile.hasNext())
      {
         firstName = inputFile.nextLine();   //nextLine method to read through line
         lastName = inputFile.nextLine();
         breed = inputFile.nextLine();    
         weight = inputFile.nextDouble();
         days = inputFile.nextInt();
         
         inputFile.nextLine();
         
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
         
         //if else statement to read the high risk breeds
         
         if(breed.equalsIgnoreCase("Pit bull") || breed.equalsIgnoreCase("Doberman Pinscher") || breed.equalsIgnoreCase("Rottweiler"))
         {
            highRisk = 20.00;
         }
         else
         {
            highRisk = 0;
         } //end if else statement
         
      bt = beforeTax(highRisk, weight, days);
      txamt = taxAmt(bt, TAX);      
      tp = totalPrice(txamt, bt);     
      abills +=tp;
      count++;
      
      getDisplay(firstName, lastName, breed, weight, days, highRisk, bt, txamt, tp);
      System.out.printf("\n\nTotal for billing cycle:   $%,.2f\n", abills);      
      }
    
    avgbills = avgCycle(abills, count);  
    System.out.printf("\nAverage for billing cycle: $%,.2f\n", avgbills);    
  
   }//end main method

   /**
      The displayTitle method displays the Kennel Title
   */
   public static void displayTitle()
   {
      String title = "Madison Kennel & Grooming";
      System.out.println(title);
   }
   
   /**
      The beforeTax method calculates the before tax cost for boarding the dog
      @param i The high risk fee associated with certain breeds
      @param y Weight of the dog
      @param x Number of boarding days
   */
   public static double beforeTax(double i, double y, int x)
   {
      double total = 0;
      total = ((y * 0.70) * x) + i;
      return total;
   }  
   
   /**
      The taxAmt method calculates the tax on the beforeTax subtotal
      @param i The value returned from the beforeTax method
      @param y The constant TAX variable
   */
   public static double taxAmt(double i, double y)
   {
      double taxAmt = 0;
      taxAmt = (i * y);
      return taxAmt;
   }
   
   /**
      The totalPrice method adds the values from the beforeTax method and taxAmt method
      @param i Value from the beforeTax method
      @param x Value from the taxAmt method
   */
   public static double totalPrice(double i, double x)
   {
      double totalPrice = 0;
      totalPrice = (i+x);
      return totalPrice;
   }
   
   /**
      The avgCycle method returns the average amount of each bill in the billing cycle
      @param i The number calculated from the abills accumulator in the main method
      @param x The count number from the main method
   */
   public static double avgCycle(double i, int x)
   {
      double allBills = i / x;
      return allBills;
   }
   
   /**
      The getDisplay method displays all values from previously calculated methods
      @param x firstName variable from main method
      @param y lastName variable from main method
      @param z breed variable from main method
      @param wght weight variable from main method
      @param days days variable from main method
      @param hr highRisk variable from main method
      @param sub Value returned from beforeTax method
      @param tx Value returned from taxAmt method
      @param ttl Value returned from totalPrice method
   */
   public static void getDisplay(String x, String y, String z, double wght, int days, double hr, double sub, double tx, double ttl)
   {
        System.out.println("\nCustomer:                 " + x + " " + y);
        System.out.println("Breed:                    " + z);
        System.out.println("Weight:                   " + wght);
        System.out.println("Boarding days:            " + days + " day(s)");
        System.out.printf("High Risk Fee:            $%,.2f\n", hr);
        System.out.printf("Subtotal for " + days + " days:      $%,.2f\n", sub);
        System.out.printf("Tax:                      $%,.2f\n", tx);
        System.out.printf("Total Due:                $%,.2f\n", ttl);
   }
}