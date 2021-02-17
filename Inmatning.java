import java.util.Locale;
import java.util.Scanner;

public class Inmatning
{

   public static void main(String[] args) throws Exception
   {
      // TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      float number1, number2;
      
      scanner.useLocale(Locale.US);
      
      System.out.println("Mata in två tal");
      
      number1 = scanner.nextFloat();
      number2 = scanner.nextFloat();
      
      System.out.printf("Summa: %10s", number1 + number2);

   }

}
