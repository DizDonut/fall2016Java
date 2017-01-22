import java.util.Scanner;
import java.util.Random;

public class DiceGame
{
   public static void main(String[] args)
   {
      int comp, user, play = 0, count, compWin = 0, userWin = 0;
      Scanner keyboard = new Scanner(System.in);
      Random randomNum = new Random();
      
      System.out.println("Would you like to play? 1 = Y, 0 = N");
      play = keyboard.nextInt();
      
      while(play == 1)
         {
            for(count = 1; count <=10; count++)
            {
               comp = randomNum.nextInt(6)+1;
               user = randomNum.nextInt(6)+1;
               System.out.println("Round " + count + ": Computer rolls " + comp + ".  You rolled a " + user + ".");
                  if(comp > user)
                  {
                     compWin ++;
                     System.out.println("\nComputer wins this round.\n");
                  }
                  else
                  {
                     if(comp == user)
                     {
                        System.out.println("Tie!\n");
                     }
                     else
                     {                   
                       userWin++;
                       System.out.println("\nYou win this round.\n");
                     }             
                   }

     
            }    
            if(compWin > userWin)
               {
                 System.out.println("\nThe computer wins with " + compWin + " wins.");
               }
               else
               {
                 System.out.println("\nYou win with " + userWin + " wins!");
               }
            System.out.println("Would you like to play again? 1 = Y 0 = N");
            play = keyboard.nextInt();
            System.out.println("Goodbye!");       
         }
         System.out.println("Goodbye!");    
   }  
}