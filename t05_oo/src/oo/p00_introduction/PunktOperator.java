package oo.p00_introduction;

public class PunktOperator {
  
  public static void main(String[] args) {
    Auto auto1 = new Auto();
    auto1.hersteller = "Ford";
    auto1.modell = "Focus";

    Auto auto2 = new Auto();
    auto2.hersteller = "BMW";
    auto2.modell = "520";
    
    auto1.start();
    auto2.start();
    
//    Auto.counter = 12; // nicht möglich, da counter "private" ist.
    System.out.println("auto1.counter (nicht empfehlenswert)  --> " + auto1.getCounter());
//    System.out.println("Auto.counter  --> " + Auto.counter);
    System.out.println("Auto.getCounter()  --> " + Auto.getCounter());
  }
}

class Auto {
  private static int counter;
  String hersteller;
  String modell;
  int erstZulassung;

  public Auto() {
    counter++;
  }
  
  public int getAlter() {
    //    return aktuellesJahr - erstZulassung;
    return 0;
  }
  public static int getCounter() {
    return counter;
  }

  public String getHersteller() {
    return hersteller;
  }

  public String getModell() {
    return modell;
  }
  
  public int getSize() {return 0;}
  public void setSize(int size) {}

  public void start() {
    System.out.format("Das Auto '%s %s' wird gestartet ...%n", hersteller, modell);
  }
}
