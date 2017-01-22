import javax.swing.JOptionPane;

public class MassWeight
{
   public static void main(String[]args)
   {
      double mass, weight; //declare mass & weight variables
      String input; //to hold keyboard input
      
      input = JOptionPane.showInputDialog("Enter the object's mass (in Newtons)");
      mass = Double.parseDouble(input);

      weight = mass * 9.8;
      
      JOptionPane.showMessageDialog(null, "The object's weight is " + weight + " Newtons.");

   if (weight > 1000)
      {
         JOptionPane.showMessageDialog(null, "The object is too heavy.");
      }
         else if (weight < 10)
      {
         JOptionPane.showMessageDialog(null, "The object is too light.");
      }
         else
      {   
         JOptionPane.showMessageDialog(null, "The object is a normal weight.");
      }
   }
}      
      