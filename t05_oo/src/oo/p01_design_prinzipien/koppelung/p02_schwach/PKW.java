package oo.p01_design_prinzipien.koppelung.p02_schwach;

public class PKW extends Fahrzeug {
  
  @Override
  public void start() {
    System.out.println("PKW startet ...");
  }

}
