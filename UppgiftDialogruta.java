import javax.swing.JOptionPane;

public class UppgiftDialogruta
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
         //String name = JOptionPane.showInputDialog(null ,"Skriv in ditt namn", "Namn", JOptionPane.WARNING_MESSAGE);
         
         String strNr1 = JOptionPane.showInputDialog("Skriv in tal 1:");
         String strNr2 = JOptionPane.showInputDialog("Skriv in tal 2:");
         int intNr1 = Integer.parseInt(strNr1);
         int intNr2 = Integer.parseInt(strNr2);
         int intSum = intNr1 + intNr2;
         JOptionPane.showMessageDialog(null, "Summan av talen är " + intSum);
   }

}
