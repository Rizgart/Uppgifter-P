import java.util.Locale; 

public class Format
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
      
      float number = 0.123456789f;
      
      // loop 10 times to increase number 
      for(int i=0; i<10; i++)
      {
          System.out.printf(Locale.US ,"Number: %15.5f %n", number); //width=15 characters, precision=5 decimals
          number = number * 10; 
     }

   }

}
