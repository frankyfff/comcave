package oo.p06_verkettung;

import java.util.ArrayList;
import java.util.List;

public class Abteilung {
  
  private String bezeichnung;
  
  private Mitarbeiter abteilungsleiter;
  
  private List<Mitarbeiter> mitarbeiterListe = new ArrayList<Mitarbeiter>();
  
  
  public Abteilung() {
    this(null, null);
  }

  public Abteilung(String bezeichnung) {
    this(bezeichnung, null);
  }

  public Abteilung(String bezeichnung, Mitarbeiter abteilungsleiter) {
    super();
    this.abteilungsleiter = abteilungsleiter;
    this.bezeichnung = bezeichnung;
    mitarbeiterListe = new ArrayList<Mitarbeiter>();
  }

  public Mitarbeiter getAbteilungsleiter() {
    return abteilungsleiter;
  }

  public void setAbteilungsleiter(Mitarbeiter abteilungsleiter) {
    this.abteilungsleiter = abteilungsleiter;
  }

  public String getBezeichnung() {
    return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
  }
  
  public void addMitarbeiter(Mitarbeiter neuerMitarbeiter) {
    this.mitarbeiterListe.add(neuerMitarbeiter);
  }
  
  public void bericht() {
    System.out.println("#################################################################");
    System.out.println("# Abteilung: " + bezeichnung);
    System.out.println("#################################################################");
    System.out.println("Abteilungsleiter: " + abteilungsleiter); // --> Mitarbeiter.toString()
    System.out.println();
    System.out.println("Mitarbeiterliste");
    System.out.println("-----------------");
    for (Mitarbeiter ma : mitarbeiterListe) {
      System.out.println(ma); // ma.toString() --> Mitarbeiter.toString()
    }
    
  }

}
