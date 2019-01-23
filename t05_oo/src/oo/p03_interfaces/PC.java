package oo.p03_interfaces;

public class PC implements Startable {
  private double speed = 1.0;
  
  @Override
  public void start() {
    System.out.println("PC startet ...");
  }
  public double getSpeed() {
    return speed; // GHz
  }
  

}
