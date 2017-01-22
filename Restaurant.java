import javax.swing.JOptionPane;

//This program computes tax and tip on a restaurant bill

public class Restaurant
{ 
   public static void main(String[] args)
   { 
      int bill;
      String str;
      str = JOptionPane.showInputDialog("Enter the bill amount.");
      bill = Integer.parseInt(str);
      double tax = 0.0675;
      double tip = 0.20;
      double totalWithoutTip = (bill * tax) + bill;
      double totalBill = (totalWithoutTip * tip) + totalWithoutTip;
      System.out.println("The total cost is " + totalBill);   
    }
} 