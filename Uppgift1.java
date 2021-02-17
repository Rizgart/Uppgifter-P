
/*Konstanter skapas
 * Variabler skapas
 * Laddeffekt beräknas med värden från konstanter som skapades
 * Laddningstid beräknas värdet batteri * laddeffekt
 * resultatet visas upp i konsolen
 * 
 * 
 * Beräknar och presenterar tabellen i console
 * @author Rizgar Teimouri, riztei-7
 */

public class Uppgift1
{

   public static void main(String[] args)
   {
      // Deklarerar konstanter för spänning-VOLTAGE, ström-CURRENT och batteri-BATTERY
      final double CURRENT_10 = 10;
      final double CURRENT_16 = 16;
      final double CURRENT_32 = 32;
      final double VOLTAGE_230 = 230;
      final double VOLTAGE_400 = 400;
      final int CONV_FACT = 1000;
      final double BATTERY = 35.8;

      // chargingPower = laddeffekt, skapar variablar för att spara värdet i de
      double chargingPower1;
      double chargingPower2;
      double chargingPower3;
      double chargingPower4;
      double chargingPower5;

      // chargingTime = laddningstid, värdet för laddningstiden sparas i dessa
      // varibaler
      double chargingTime1;
      double chargingTime2;
      double chargingTime3;
      double chargingTime4;
      double chargingTime5;

      // laddeffekt beräknas ut i koden nedan
      chargingPower1 = (VOLTAGE_230 * CURRENT_10) / CONV_FACT;
      chargingPower2 = (VOLTAGE_230 * CURRENT_16) / CONV_FACT;
      chargingPower3 = (VOLTAGE_400 * CURRENT_10 * Math.sqrt(3)) / CONV_FACT;
      chargingPower4 = (VOLTAGE_400 * CURRENT_16 * Math.sqrt(3)) / CONV_FACT;
      chargingPower5 = (VOLTAGE_400 * CURRENT_32 * Math.sqrt(3)) / CONV_FACT;

      // Laddningstid räknas ut i koden nedan
      chargingTime1 = BATTERY / chargingPower1;
      chargingTime2 = BATTERY / chargingPower2;
      chargingTime3 = BATTERY / chargingPower3;
      chargingTime4 = BATTERY / chargingPower4;
      chargingTime5 = BATTERY / chargingPower5;

      System.out.print("Batteri 35.8(kWh)");
      System.out.print("\nStröm(A)" + "\tSpänning(V)" + "\tLaddeffekt(kW)" + "\tLaddningstid(h)");
      System.out.print("\n===============================================================");
      System.out.print("\n" + Math.round(CURRENT_10) + "\t\t" + Math.round(VOLTAGE_230) + "\t\t" + chargingPower1
            + "\t\t" + Math.round(chargingTime1 * 100.0) / 100.0);
      System.out.print("\n" + Math.round(CURRENT_16) + "\t\t" + Math.round(VOLTAGE_230) + "\t\t" + chargingPower2
            + "\t\t" + Math.round(chargingTime2 * 100.0) / 100.0);
      System.out.print("\n" + Math.round(CURRENT_10) + "\t\t" + Math.round(VOLTAGE_400) + "\t\t"
            + Math.round(chargingPower3 * 100.0) / 100.0 + "\t\t" + Math.round(chargingTime3 * 100.0) / 100.0);
      System.out.print("\n" + Math.round(CURRENT_16) + "\t\t" + Math.round(VOLTAGE_400) + "\t\t"
            + Math.round(chargingPower4 * 100.0) / 100.0 + "\t\t" + Math.round(chargingTime4 * 100.0) / 100.0);
      System.out.print("\n" + Math.round(CURRENT_32) + "\t\t" + Math.round(VOLTAGE_400) + "\t\t"
            + Math.round(chargingPower5 * 100.0) / 100.0 + "\t\t" + Math.round(chargingTime5 * 100.0) / 100.0);

   }

}
