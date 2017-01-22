import java.util.Scanner;
import java.io.*;

public class LetterCounterNumber2
{
   public static void main(String[] args) throws IOException
   {
      File file = new File(""); 
      String name, letter;
      int position, i = 0;
      Scanner inputFile = new Scanner(file);
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a the name of a file: ");
      name = keyboard.nextLine();
      
      while (inputFile.hasNext())
      {
         System.out.println("Choose an alphanumeric character from your string: ");
         letter = inputFile.nextLine();
      
         letter = letter.toLowerCase();
      }
      
      for(position = 0; position< sentence.length(); position++)
      {
         if(sentence.charAt(position) == letter.charAt(0))
         {
            i++;
         }
      }
      
      System.out.print("There are " + i + " occurances of the letter " + letter + " in the string " + sentence);
   }
}