import java.util.Scanner;

public class question4
{
   public static void main(String []args)
   {
    int rooms, sqft, totalSqft=0;
    double price;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter the number of rooms to paint: ");
    rooms = keyboard.nextInt();
    
    for (int i = 1; i <= rooms; i++)
    { 
      System.out.println("Enter the squarefeet of wall space for room " + i + ": ");
      sqft = keyboard.nextInt();
      totalSqft += sqft; 
    } 
    
    System.out.println("Enter the price of paint per gallon: ");
    price = keyboard.nextDouble();
    
    numGals(totalSqft);
             
   }//end main
    
    public static void numGals(int x)
    {
      int gallons = 0;
      if ((x/115)<1)
      {
         gallons = 1;
      }
      else
      {
         gallons = Math.round(x / 115);
      }
      System.out.println("Total gallons needed is " + gallons); 
    }

}