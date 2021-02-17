import java.util.Scanner;

public class Tidomvandlare
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      
      int hour, minute, seconds, sum;
      scanner.useDelimiter(":|\\s");
      
      System.out.print("Mata in tim, min och sek på formen (tt:mm:ss): ");
      
      hour = scanner.nextInt();
      minute= scanner.nextInt();
      seconds = scanner.nextInt();
      
      hour = hour * 3600;
      minute = minute * 60;
      sum = hour + minute + seconds;
      System.out.print("Det blir "+ sum +" sekunder");
      
      
   }

}
