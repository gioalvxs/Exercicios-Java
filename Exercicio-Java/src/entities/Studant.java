package entities;

public class Studant {

   public String name;
   public double grade1;
   public double grade2;
   public double grade3;

   public double add;

   public double miss;

   public double avareges() {

      return add = grade1 + grade2 + grade3;

   }

   public double missingPoint() {
     return miss = 60 - add;
   }

   public  String toString() {

      if (avareges() < 60) {
         return String.format("%.2f", add )+ "\nFAILED" + "\nMISSING: " + String.format("%.2f", missingPoint()) + " POINTS";
      }
      else {
         return String.format("%.2f", add) + "\nPASS";
      }

   }
}
