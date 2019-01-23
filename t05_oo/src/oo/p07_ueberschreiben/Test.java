package oo.p07_ueberschreiben;

public class Test {
  public static void main(String[] args) {
    Tier var = new Vogel();
//    var.report(); // Compiler-Warnung
    Tier.report();
    Vogel.report();
  }
}

class Tier {
  public static void report() {
    System.out.println("Tierreport");
  }
}

class Vogel extends Tier {

//  @Override
  public static void report() { // Klassenmethode
    System.out.println("Vogelreport");

  }

}
