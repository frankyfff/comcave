package oo.p04_polymorphismus;

public class Mitarbeiter extends Person implements Motivationsfähig {
  
  private double gehalt;
  
  public Mitarbeiter() {
  }

  public Mitarbeiter(String nachname, String vorname) {
    super(nachname, vorname);
  }

  public Mitarbeiter(String nachname, String vorname, double gehalt) {
    super(nachname, vorname);
    this.gehalt = gehalt;
  }

  public double getGehalt() {
    return gehalt;
  }

  public void setGehalt(double gehalt) {
    this.gehalt = gehalt;
  }

  @Override
  public void printData() {
        System.out.format("Mitarbeiterdaten: %s %s - Gehalt: %.2f%n", getVorname(), getNachname(), gehalt);

  }
  
  
}
