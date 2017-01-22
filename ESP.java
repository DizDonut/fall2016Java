/*
   Mike Bechtel - Peer Programming Exam Practice
   
   Program will randomly select the name of a color, ask
   user for input of a color choice up to 10 times, then
   display the number of times the user picked the correct
   color
*/

import java.util.Random;
import java.util.Scanner;

public class ESP
{
   public static void main(String[] args)
   {
      String color = "";
      String userAnswer = "";
      int i = 0;
      int total = 0;
      Random randomNum = new Random();
      
      Scanner keyboard = new Scanner(System.in);
      
      while(i < 11)
      {
         int compAnswer = randomNum.nextInt(4) + 1;
         
         if(compAnswer == 1)
         {
            color = "Green";
         }   
            else
            {   
               if(compAnswer == 2)
               {
                  color = "Red";
               }    
                  else
                  {
                     if(compAnswer == 3)
                     {
                        color = "Orange";
                     }
                        else
                        {
                           if(compAnswer == 4)
                           {
                              color = "Yellow";
                           }
                        }
                  }
            }
         
         System.out.println("Guess a color: ");
         userAnswer = keyboard.nextLine();
         System.out.println("Computer guessed: " + color + "\n");
         
         if(userAnswer.equals(color))
         {
            total++;
         }
         
         i++;        
      
      }
      
      System.out.println("You guessed the right color " + total + " time(s).");
      
   }
}



