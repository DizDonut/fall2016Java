/*
   Mike Bechtel - CSC143_51 Project 2
   
   This program is a continuation of Project 1, Madison Kennel & Grooming.  The program
   reads the input from the text file boarding.txt, parses the data, assigns appropriate
   fees and taxes, then displays the dog, breed, weight, days, and fees for each customer.
   
   Finally, the program will print the total fees to be collected during the billing cycle.  
*/   


import java.util.Scanner; //needed for Scanner class
import java.io.*; //needed for file input and IOException

public class PetGroomingProject2
{
   public static void main(String[] args) throws IOException
   {
      File file = new File("boarding.txt"); //declares variable file and initializes to the appropriate file
      Scanner inputFile = new Scanner(file);
      
      //declare and intitialize variables
      
      String title = "Madison Kennel & Grooming";  //title
      String firstName, lastName, breed;           //string variables from input file
      double weight, subtotal, total, allBills = 0, highRisk = 0, taxAmt = 0; //double variables for numbers & currency
      final double TAX = 0.06;                     //declare constant for tax percent
      int days, count = 0;                         //int variables for days and count for loop
      
      System.out.println(title+"\n");
      
      //while loop with hasNext to read through all data in the file
      
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
                              
         subtotal = ((weight * 0.70 * days)+highRisk); //calc for subtotal 70% of weight * days + any highRisk fees
         taxAmt = (subtotal * TAX);                    //calc for taxAmt
         total = subtotal + taxAmt;                    //calc for total
         allBills += total;                            //accumulator for all fees within the billing cycle
         count++;                                      //to close the loop
         
         //print out displays
         
         System.out.println("\nCustomer:                 " + firstName + " " + lastName);
         System.out.println("Breed:                    " + breed);
         System.out.println("Weight:                   " + weight);
         System.out.println("Boarding days:            " + days + " day(s)");
         System.out.printf("High Risk Fee:            $%,.2f\n", highRisk);
         System.out.printf("Subtotal for " + days + " days:      $%,.2f\n", subtotal);
         System.out.printf("Tax:                      $%,.2f\n", taxAmt);
         System.out.printf("Total Due:                $%,.2f\n", total);
               
      }
      
      System.out.printf("\n\nTotal Fees for billing cycle: $%,.2f",allBills); 
      inputFile.close(); //close the file
   }
}