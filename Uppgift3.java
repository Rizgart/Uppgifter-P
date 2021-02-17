import java.util.Scanner;

public class Uppgift3
{

   public static void main(String[] args)
   {
      int age;
      String name;
    
      Scanner userInput = new Scanner(System.in);
         
      System.out.print("Skriv in din ålder: ");
      age = userInput.nextInt();
         
      System.out.print("Skriv in ditt namn: ");
      name = userInput.next();
               
      System.out.println("Du heter " + name + " och är " + age + " år");  
      
      // Declaration and initialization of characters 
      char firstChar = '\u0061', secondChar='\u006E',
            thirdChar = 110, fourthChar = 97;
 
      // Print concatenated string 
      System.out.println("Den sammanslagna strängen blir : "
          + firstChar + secondChar + thirdChar + fourthChar);
      
   }

}
