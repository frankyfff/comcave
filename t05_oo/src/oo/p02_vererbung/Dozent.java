package oo.p02_vererbung;

public class Dozent extends Person {
  
  private int personalNummer; 
  private Veranstaltung[] veranstaltungen;
  
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
    System.out.format("Personalnummer: " + personalNummer);
  }
  
}

