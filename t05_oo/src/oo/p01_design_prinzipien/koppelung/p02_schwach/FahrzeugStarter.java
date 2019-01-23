package oo.p01_design_prinzipien.koppelung.p02_schwach;

public class FahrzeugStarter {
  private Fahrzeug fz; // Fahrzeug ist "abstract"
  
  public FahrzeugStarter(Fahrzeug fz) {
    this.fz = fz;
  }

  public void start() {
    // andere Aktionen vorher
    System.out.println("Preparing Start Process...");
    fz.start();
    System.out.println("Finishing Start Process...");
    // andere Aktionen nachher
  }

  public void setFahrzeug(Fahrzeug fz) {
    this.fz = fz;
  }

}
