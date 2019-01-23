package oo.p06_verkettung;

public class VerkettungTest {

  public static void main(String[] args) {

// Peter Schmidt, wohnhaft am Rosenweg 10, 50111 Köln als Abteilungsleiter der "IT-Abteilung" setzen
//    Mitarbeiter ma1 = new Mitarbeiter("Schmidt", "Peter");
//    Adresse adr1 = new Adresse("Rosenweg", "10", 50111, "Köln");
//    ma1.setAdresse(adr1);
//    Mitarbeiter ma1 = new Mitarbeiter("Schmidt", "Peter",  adr1 );
    Mitarbeiter ma1 = new Mitarbeiter("Schmidt", "Peter", new Adresse("Rosenweg", "10", 50111, "Köln"));

//    Abteilung abt1 = new Abteilung("IT");
//    abt1.setAbteilungsleiter(ma1);
    
    Abteilung abt1 = new Abteilung("IT", ma1);
//    Abteilung abt1 = new Abteilung("IT", new Mitarbeiter("Schmidt", "Peter", new Adresse("Rosenweg", "10", 50111, "Köln")));

    
    manipulate(abt1);
  }
  
  private static void manipulate(Abteilung abt) {

    // ############### Bezeichnung der Abteilung ändern ###############
    //    abt.setBezeichnung("....");
    
    // ############### Neuen Abteilungsleiter setzen ###############
    //    Mitarbeiter ma2 = new Mitarbeiter("Meyer", "Hans", new Adresse("...", "...", 11111, "..."));
    //    abt1.setAbteilungsleiter(ma2);
    
    // ############### Die Strasse (Adresse) des Abteilungsleiters lesen ###############
    String str = abt.getAbteilungsleiter().getAdresse().getStrasse();
    
    // ############### Hersteller vom 2. Firmenwagen des Abteilungsleiters lesen ###############
//    String hersteller = abt.getAbteilungsleiter().getFirmenwagen()[1].getHersteller();

    // ############### PLZ des Abteilungsleiters auf 50113 setzen ###############
    abt.getAbteilungsleiter().getAdresse().setPlz(50113);

    // ############### Abteilungsleiter ist umgezogen ==> "Musterstr. 1a, 44124 Dortmund" ###############
    Adresse adr = new Adresse("Musterstr.", "1a", 44124, "Dortmund");
    abt.getAbteilungsleiter().setAdresse(adr);

    // ############### Neuer Mitarbeiter (Paul Kosmos), wohnhaft am "Grüner Weg 12, 50201 Köln" ###############
    Mitarbeiter ma = new Mitarbeiter("Kosmos", "Paul", new Adresse("Grüner Web", "12", 50201, "Köln"));
    abt.addMitarbeiter(ma);
    
    abt.bericht();
  }

}
