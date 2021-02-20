/*
 * Konstanter skapas
 * Variabler skapas
 * MATA IN VÄRDE 
 * Användaren matar in värde för datum, soluppgång och solnedgång
 * kWh räknas ut 
 * Priset för kWh räknas ut
 * Resultatet visas upp i konsolen
 * 
 * Programmet räknar ut hur mycket man kan tjäna på solpaneler under sommartiden 
 * @author Rizgar Teimouri, riztei-7
 */

import java.util.Scanner;

public class Uppgift2
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub

      // Deklarerar konstanter för kilowatt per timme, storleken på panelen,
      // antal paneler, priset för elektricitet, verkningsgrad och minuter i en timme
      // och Solinstrålning
      final double KILO_WATT_HOUR = 0.9;
      final double SIZE_OF_PANELS = 1.7;
      final int NUMBER_OF_PANELS = 26;
      final double ELECTRICITY_PRICE = 0.9;
      final double EFFICIENCY = 0.2;
      final int MINUTES_PER_HOUR = 60;
      final int SOLAR_RADIATION = 166;

      // Deklarerar variablarna månad, dag, soluppgång och nedgång och Produktion
      // (kWh)
      int month, date;
      int division = 1000;
      double sunriseHour, sunriseMinute, sunsetHour, sunsetMinute;
      double totalSunHour;
      double production;
      double price;

      // Skapar en scanner input för att ta in värden som användaren matar in
      Scanner userInput = new Scanner(System.in);
      userInput.useDelimiter("-|:|\\s");
      System.out.printf("Skriv dagens datum [mm-dd]> ");

      // Sparar ner värden som användaren matar in. Värden som sparas är månaden och
      // datumet.
      month = userInput.nextInt();
      date = userInput.nextInt();
      userInput.nextLine();

      // Sparar ner värdet som användaren skriver in för soluppgång
      System.out.printf("Skriv in tidpunkt soluppgång [hh:mm]> ");
      sunriseHour = userInput.nextInt();
      sunriseMinute = userInput.nextInt();
      userInput.nextLine();

      // Koden nedan sparar ner solnedgången som användaren matar in
      System.out.printf("Skriv in tidpunkt solnedgång [hh:mm]> ");
      sunsetHour = userInput.nextInt();
      sunsetMinute = userInput.nextInt();
      System.out.println("==========================================");

      // Beräknar totala soltimmar
      totalSunHour = (sunsetHour + sunsetMinute / MINUTES_PER_HOUR) - (sunriseHour + sunriseMinute / MINUTES_PER_HOUR);

      // Koden beräknar produktionen (kWh)
      production = (SOLAR_RADIATION * totalSunHour * NUMBER_OF_PANELS * SIZE_OF_PANELS * EFFICIENCY) / division;

      // Beräknar värdet
      price = production * ELECTRICITY_PRICE;

      // Skapar en if statement det kollar om månaden är 6 eller 7 som användaren har
      // matat in
      if (month == 6 || month == 7)
      {
         // Skapar en nested if statement, för att kolla att värdet för solnedgång är
         // senare än soluppgång
         if (sunriseHour < sunsetHour || sunriseMinute < sunsetMinute)
         {
            System.out.printf("Soltimmar: %.2f timmar", totalSunHour);
            System.out.printf("\nProduktionen %s/%s är: %.2f kWh till ett värde av: %.2f kr", date, month, production,
                  price);
         } else
         {
            System.out.print("Klockslaget för solnedgång måste vara senare än soluppgång");
         }

      } else
      {
         System.out.print("Du har matat in fel värden för månaden");
      }

   }

}
