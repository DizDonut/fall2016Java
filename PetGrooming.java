/*
   Mike Bechtel - CPCC CSC143_51 Project 1
   This program calculates the total cost of boarding a dog.
   User will input the dog's weight and number of desired
   boarding days, and the program will display all inputs as well as
   total cost pre tax and post tax   
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PetGrooming
{
   public static void main(String[]args)
   {
      String title = "Madison Kennel & Grooming";  //To store the name of the kennel
      double dogWeight;                            //To store the dog's weight
      int boardDays;                               //To store the # of days dog will be boarded
      double preTax;                               //To store pre tax calculation of cost
      double salesTaxPercent = 0.06;               //Assign 6% tax rate
      double salesTaxAmount;                       //To store total sales tax amount
      double totalCost;                            //To store total cost with tax
      
      //Create Scanner object to read input
      Scanner keyboard = new Scanner(System.in);      
      
      //Display Title & Greeting
      JOptionPane.showMessageDialog(null, "Welcome to " + title + "!\nPlease follow the on screen prompts to estimate your boarding costs.");
      
      //Ask user for dog's weight
      System.out.println("What is your dog's weight (in lbs.)?");
      dogWeight = keyboard.nextDouble();      
      
      //Ask user for desired number of boarding days
      System.out.println("How many days are you boarding?");
      boardDays = keyboard.nextInt();
      
      //Assign calculations to variables
      preTax = (double)Math.round(dogWeight * 0.70 * boardDays *100)/100;
      salesTaxAmount = (preTax * salesTaxPercent);
      totalCost = (preTax + salesTaxAmount);
      
      //Display inputs and calculation amounts to the screen
      System.out.println("Weight: " + dogWeight + "\nDays: " + boardDays + 
                     "\nBoarding Fee for " + boardDays + " days: $" + preTax + "\nSales Tax: $" + 
                     salesTaxAmount + "\nTotal Amount Due: $" + totalCost);
      
      //Display inputs and calculation amounts to a dialog box
      JOptionPane.showMessageDialog(null, "Weight: " + dogWeight + "\nDays: " + boardDays + 
                     "\nBoarding Fee for " + boardDays + " days: $" + preTax + "\nSales Tax: $" + 
                     salesTaxAmount + "\nTotal Amount Due: $" + totalCost);
    }
}
      