package oo.p04_polymorphismus;

import oo.p02_vererbung.Veranstaltung;


public class Dozent extends Mitarbeiter { // Dozent und Person: IS-Beziehung
  
  private int personalNummer; 
  private Veranstaltung[] veranstaltungen; // Dozent und Versanstaltung: HAS-Beziehung

  public Dozent() {
  }

  public Dozent(String nachname, String vorname) {
    super(nachname, vorname);
  }
  void test() {
    
  }

  public Veranstaltung[] getVeranstaltungen() {
    return veranstaltungen;
  }
  public void setVeranstaltungen(Veranstaltung[] veranstaltungen) {
    this.veranstaltungen = veranstaltungen;
  }
  
  public int getPersonalNummer() {
    double cos = Math.cos(personalNummer); // Dozent-Math: USE-Beziehung
    return personalNummer;
  }
  public void setPersonalNummer(int personalNummer) {
    this.personalNummer = personalNummer;
  }
  
  @Override
  public void printData() {
//    System.out.println(nachname);
//    System.out.println(vorname);
    System.out.println("################ Dozentendaten ################");
    super.printData(); // nachname und vorname
    System.out.println("Personalnummer: " + personalNummer);
  }
  
}

