import java.util.Scanner;

public class chapter5
{
   public static void main(String []args)
   {
      int cost;
      double markup;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the wholesale cost: ");
      cost = keyboard.nextInt();
      
      System.out.println("Enter the markup %: ");
      markup = keyboard.nextDouble();
      
      calculateRetail(cost, markup);
      
      
      
      
   }  
      public static void calculateRetail(int x, double y)
      {
         double total=0;
         total = (x*y)+x;
         System.out.println("The total is " + total + "."); 
      }
   
}