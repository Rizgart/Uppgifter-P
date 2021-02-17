import javax.swing.JOptionPane;

public class change
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
      int amount, remainingAmount;
      int numberOf20, numberOf10, numberOf5, numberOf1;

      String inputString = JOptionPane.showInputDialog(null, "Mata in ditt värde", "Växlare",
            JOptionPane.WARNING_MESSAGE);
      amount = Integer.parseInt(inputString);

      numberOf20 = amount / 20;

      remainingAmount = amount % 20;

      numberOf10 = remainingAmount / 10;
      remainingAmount = remainingAmount % 10;

      numberOf5 = remainingAmount / 5;

      numberOf1 = remainingAmount % 5;

      String message = "20-sedlar: " + numberOf20 + "\n" + "10-kronor: " + numberOf10 + "\n" + "5-kronor: " + numberOf5
            + "\n" + "1-kronor: " + numberOf1;

      JOptionPane.showMessageDialog(null, message);

   }

}
