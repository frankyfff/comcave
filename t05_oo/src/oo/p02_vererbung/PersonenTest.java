package oo.p02_vererbung;

import java.util.Date;

public class PersonenTest {

  public static void main(String[] args) {
    Person person1 = new Person("Schmidt", "Peter");
    person1.printData();
    
    Teilnehmer teilnehmer1 = new Teilnehmer("Heppner", "Robert");
    teilnehmer1.setStartDatum(new Date());
    
    Teilnehmer teilnehmer2 = new Teilnehmer("Meyer", "Hans", new Date());
    teilnehmer1.printData();
    teilnehmer2.printData();
    
    Dozent dozent1 = new Dozent("Lejmi", "Salah");
    dozent1.setPersonalNummer(234);
    dozent1.printData();
    
  }

}
