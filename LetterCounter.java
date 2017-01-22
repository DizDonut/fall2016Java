import java.util.Scanner;

public class LetterCounter
{
   public static void main(String[] args)
   {
      String str, sentence, letter;
      int position, i = 0;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a string: ");
      str = keyboard.nextLine();
      
      sentence = str.toLowerCase();
      
      System.out.println("Choose an alphanumeric character from your string: ");
      letter = keyboard.nextLine();
      
      letter = letter.toLowerCase();
      
      for(position = 0; position<sentence.length(); position++)
      {
         if(sentence.charAt(position) == letter.charAt(0))
         {
            i++;
         }
      }
      
      System.out.print("There are " + i + " occurances of the letter " + letter + " in the string " + sentence);
   }
}